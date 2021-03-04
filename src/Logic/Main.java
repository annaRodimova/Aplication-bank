package Logic;

import Chat.Chat;
import Graphics.Home;
import Graphics.Identification;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        /*Users users1 =  new Users("ИВАН", "ИВАНОВ", "ИВАНОВИЧ", "QWERTY123");
        users1.new_user(users1);
        users1.add_score("QWERTY123");

         */

       Identification identification =  new Identification();
        identification.identifications();





        /*Chat chat = new Chat();
        System.out.println(chat.responceOutput("where i can show balance ?"));

         */
    }
}
