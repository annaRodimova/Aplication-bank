package Logic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public interface Connect {

    public default Connection Connect(String password, String name_DB) throws ClassNotFoundException, SQLException {
        String user = "root";
        String connection = "jdbc:mysql://localhost:3306/";
        String add_connections = "?serverTimezone=Europe/Moscow";
        password = "LexusIS250@#";
        String all_connect = connection + name_DB + add_connections;
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection1 = DriverManager.getConnection(all_connect, user, password);
        return connection1;
    }

}
