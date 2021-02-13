package Logic;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Methods implements Operation, Connect{

    public int id_us_return (int score) throws SQLException, ClassNotFoundException {
        Connection connection = Connect("LexusIS250@#", "Bank2" );
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(String.format("select id_us from user where score = '%s'", score));
        int id= 0;
        while (resultSet.next()) {
            id = resultSet.getInt(1);
        }
        return id;
    }

    public int id_users_return (String password) throws SQLException, ClassNotFoundException {
        Connection connection = Connect("LexusIS250@#", "Bank2");
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(String.format("select id from users where password = '%s'", password));
        int id= 0;
        while (resultSet.next()) {
            id = resultSet.getInt(1);
        }
        return id;
    }

    @Override
    public void add_balance (int add_money, int score, String password) throws SQLException, ClassNotFoundException {
        Connection connection = Connect("LexusIS250@#", "Bank2" );
        Statement statement = connection.createStatement();
        int id_us = id_us_return(score);
        int id_users = id_users_return(password);
        if(id_us == id_users) {
            statement.executeUpdate(String.format("update user set balance = balance + '%s' where score = %s and id_us = '%s';",
                    add_money, score, id_us));
        }
        else {

        }
    }
    @Override
    public void take_of_balance (int take_of_money, int score, String password) throws SQLException, ClassNotFoundException {
        Connection connection = Connect("LexusIS250@#", "Bank2" );
        Statement statement = connection.createStatement();
        int id_us = id_us_return(score);
        int id_users = id_users_return(password);
        if(id_us == id_users) {
            statement.executeUpdate(String.format("update user set balance = balance - '%s' where score = %s and id_us = '%s';",
                    take_of_money, score, id_us));
        }
        else {

        }
    }

    @Override
    public int show_balance (int score, String password) throws SQLException, ClassNotFoundException {
        Connection connection = Connect("LexusIS250@#", "Bank2" );
        Statement statement = connection.createStatement();
        int id_us = id_us_return(score);
        int id_users = id_users_return(password);
        int show_balance = 0;
        if(id_us == id_users) {
            ResultSet res = statement.executeQuery(String.format("select balance from user where score = %s and id_us = '%s';",
                    score, id_us));
            while (res.next()) {
                show_balance = res.getInt(1);
            }

        }
        else {

        }
        return show_balance;
    }
    @Override
    public void transfer_balance (int transfer_money, int score_from, String password_from, int score_in, String Surname_in) throws SQLException, ClassNotFoundException {
        Connection connection = Connect("LexusIS250@#", "Bank2");
        Statement statement = connection.createStatement();
        int id_us_from = id_us_return(score_from);
        int id_users_from = id_users_return(password_from);
        ResultSet res  = statement.executeQuery(String.format("select id_us from user where score = '%s'", score_in));
        int id_us_in = 0;
        while (res.next()) {
            id_us_in = res.getInt(1);
        }

        ResultSet resultSet2 = statement.executeQuery(String.format("select id from users where Surname = '%s'", Surname_in));
        int id_users_in = 0;
        while (resultSet2.next()) {
            id_users_in = resultSet2.getInt(1);
        }
        if (id_us_from == id_users_from) {
           if (id_us_in == id_users_in & id_us_in > 0) {
               statement.executeUpdate(String.format("update user set balance = balance - '%s' where score = %s and id_us = '%s';",
                       transfer_money, score_from, id_us_from));
               statement.executeUpdate(String.format("update user set balance = balance + '%s' where score = %s and id_us = '%s';",
                       transfer_money, score_in, id_us_in));
           }
        } else {

        }


    }

}
