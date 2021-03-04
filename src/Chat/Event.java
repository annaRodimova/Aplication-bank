package Chat;

import Logic.Methods;

import java.sql.SQLException;

public class Event {

    String Score = "Информацию о своих счетах вы можете найти на главной странице";
    String Balance = "Для того, что бы узнать свой баланс, вам необходимо провалиться в соответствующую вкладку на главной странице";
    String transfer =  "для перевода стредств, провалитесь во вкладку transfer, далее вам необходимо будет ввести номер счета и фамилию получателя, сумму перевода";
    String OpenScore = "открыть счет вы можете на главной странице";


    public String balance(int score, String password) throws SQLException, ClassNotFoundException {
        String showBalance = "Ваш баланс равен ";
        int newBalance = new Methods().show_balance(score, password);
        showBalance = showBalance + newBalance;
        return showBalance;
    }
}
