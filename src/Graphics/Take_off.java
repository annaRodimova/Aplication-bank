package Graphics;

import javax.swing.*;
import java.awt.*;
import java.sql.SQLException;

public class Take_off {
    public void take_of_money () throws SQLException, ClassNotFoundException {
        JFrame frame_take_of_money = new JFrame("Start");
        frame_take_of_money.setSize(500, 500);
        frame_take_of_money.getContentPane().setBackground(new Color(0xC8DCDC));
        frame_take_of_money.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame_take_of_money.setLayout(null);

        Components_take_of component = new Components_take_of();

        for (int i = 0; i < component.returntake_of().size(); i++) {
            frame_take_of_money.add(component.returntake_of().get(i));
        }
        frame_take_of_money.setVisible(true);

    }
}
