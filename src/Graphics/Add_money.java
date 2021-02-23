package Graphics;

import javax.swing.*;
import java.awt.*;
import java.sql.SQLException;

public class Add_money {
    public void add_money () throws SQLException, ClassNotFoundException {
        JFrame frame_Add_money = new JFrame("Start");
        frame_Add_money.setSize(500, 500);
        frame_Add_money.getContentPane().setBackground(new Color(0xC8DCDC));
        frame_Add_money.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame_Add_money.setLayout(null);

        Components_add_money component = new Components_add_money();

        for (int i = 0; i < component.returnAdd().size(); i++) {
            frame_Add_money.add(component.returnAdd().get(i));
        }
        frame_Add_money.setVisible(true);

    }
}
