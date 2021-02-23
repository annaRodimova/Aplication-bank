package Logic;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Users implements Connect {

    private String name = "";
    private String Surname = "";
    private String Patronymic = "";
    private String pasword = "";
    private static int id  = 5;



    public Users(String name, String Surname, String Patronymic, String pasword) {
        this.name = name;
        this.Surname = Surname;
        this.Patronymic = Patronymic;
        this.pasword = pasword;
    }
    public Users() {

    }

    public void new_user(Users new_user) throws SQLException, ClassNotFoundException {
        Connection connection = Connect("LexusIS250@#", "Bank2");
        Statement statement = connection.createStatement();
        //Random random_id = new Random();
        statement.executeUpdate(String.format("insert into users (id, Name, Surname, Patronamyc, password) values('%s', '%s', '%s', '%s', '%s');", id,
                new_user.name, new_user.Surname, new_user.Patronymic, new_user.pasword));
        id ++;
    }

    public boolean identification(int score, String password) throws SQLException, ClassNotFoundException {
        Connection connection = Connect("LexusIS250@#", "Bank2");
        Statement statement = connection.createStatement();
        int id_us = 0;
        id_us = new Methods().id_us_return(score);
        int id_users = 0;
        id_users = new Methods().id_users_return(password);
        boolean exit = false;
        if (id_us == id_users) {
            exit = true;
            access_to_data(score, password);
            }
        if (id_us == 0 || id_users == 0) {
            exit = false;
        }
        if (id_us != id_users){
            exit = false;
        }
        return exit;
    }

    public int add_score(String password) throws SQLException, ClassNotFoundException {
        Random random_score = new Random();
        int score = random_score.nextInt(1147483647) + 1000000001;
        Connection connection = Connect("LexusIS250@#", "Bank2");
        Statement statement = connection.createStatement();
        Methods methods =  new Methods();
        int id_users = methods.id_users_return(password);
        statement.executeUpdate(String.format("insert into user values(%s, %s, 00.00);", id_users, score));

        return score;

    }

    public ArrayList<Integer> access_to_data(int score, String password) throws SQLException, ClassNotFoundException {
        ArrayList<Integer> user_data = new ArrayList<>();
        Connection connection = Connect("LexusIS250@#", "Bank2");
        Statement statement = connection.createStatement();
        int id_us = new Methods().id_us_return(score);
        int id_users = new Methods().id_users_return(password);

        if (id_us == id_users) {

            ResultSet res = statement.executeQuery(String.format("select score from user where id_us = '%s';", id_us));
            while (res.next()) {
                user_data.add(res.getInt(1));
            }
        }
        return user_data;
    }

    /*public ArrayList<Integer> count_score(int score, String password) throws SQLException, ClassNotFoundException {
        Connection connection = Connect("LexusIS250@#", "Bank2");
        Statement statement = connection.createStatement();
        int id_us = 0;
        ResultSet res = statement.executeQuery(String.format("select score from user where id_us = %s", id_us));
        ArrayList<Integer> count_sql_score = new ArrayList<>();
        while (res.next()) {
            count_sql_score.add(res.getInt(1));
        }
        return count_sql_score;

    }

     */

}
