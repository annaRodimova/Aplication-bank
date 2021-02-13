package Logic;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Users implements Connect {

    private String name = "";
    private String Surname = "";
    private String Patronymic = "";
    private String pasword = "";
    private static int id  = 3;


    public Users(String pasword, String name, String Surname, String Patronymic) {
        this.name = name;
        this.Surname = Surname;
        this.Patronymic = Patronymic;
        this.pasword = pasword;
    }

    public void new_user(Users new_user) throws SQLException, ClassNotFoundException {
        Connection connection = Connect("LexusIS250@#", "Bank2");
        Statement statement = connection.createStatement();
        Random random_id = new Random();
        statement.executeUpdate(String.format("insert into users (id, Name, Surname, Patronamyc, password) values('%s', '%s', '%s', '%s', '%s');", id,
                new_user.name, new_user.Surname, new_user.Patronymic, new_user.pasword));
        id ++;
    }

    public int identification(int score, String password) throws SQLException, ClassNotFoundException {
        Connection connection = Connect("LexusIS250@#", "Bank2");
        Statement statement = connection.createStatement();
        int id_us = new Methods().id_us_return(score);
        int id_users = new Methods().id_users_return(password);
        if (id_us == id_users) {
            access_to_data(score, password);
        } else {

        }
        return id_us;
    }

    public void add_score(String password) throws SQLException, ClassNotFoundException {
        Random random_score = new Random();
        int score = random_score.nextInt(1147483647) + 1000000001;
        Connection connection = Connect("LexusIS250@#", "Bank2");
        Statement statement = connection.createStatement();
        int id_users = new Methods().id_users_return(password);
        statement.executeUpdate(String.format("insert into user values(%s, %s, 00.00);", id_users, score));

    }

    public Map<Integer, Double> access_to_data(int score, String password) throws SQLException, ClassNotFoundException {
        Map<Integer, Double> user_data = new HashMap<>();
        Connection connection = Connect("LexusIS250@#", "Bank2");
        Statement statement = connection.createStatement();
        int id_us = new Methods().id_us_return(score);
        int id_users = new Methods().id_users_return(password);

        if (id_us == id_users) {

            ResultSet res = statement.executeQuery(String.format("select score, balance from user where id_us = '%s';", id_us));
            while (res.next()) {
                user_data.put(res.getInt(1), res.getDouble(2));
            }
        }

        return user_data;
    }

}
