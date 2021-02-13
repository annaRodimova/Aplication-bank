package Logic;

import java.sql.SQLException;
import java.util.ArrayList;

public interface Operation {
    public void add_balance(int add_money, int score, String password) throws SQLException, ClassNotFoundException;
    public void take_of_balance(int take_of_money, int score, String password) throws SQLException, ClassNotFoundException;
    public int show_balance(int score, String password) throws SQLException, ClassNotFoundException;
    public void transfer_balance(int transfer_money, int score_from, String password_from, int score_in, String name_in) throws SQLException, ClassNotFoundException;
    //public ArrayList<> show_scores ();//
}
