package Logic;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Users users1 =  new Users("танчики123", "Роман", "Петров", "Федорович");
        users1.new_user(users1);
        users1.add_score("танчики123");


    }
}
