package Graphics;

import javax.swing.*;
import java.awt.*;
import java.sql.SQLException;

public class Transfer_money {
    public void transfer_money () throws SQLException, ClassNotFoundException {
        JFrame frame_transfer_money = new JFrame("Start");
        frame_transfer_money.setSize(500, 500);
        frame_transfer_money.getContentPane().setBackground(new Color(0xC8DCDC));
        frame_transfer_money.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame_transfer_money.setLayout(null);

        Components_transfer_money component = new Components_transfer_money();

        for (int i = 0; i < component.return_transfer_money().size(); i++) {
            frame_transfer_money.add(component.return_transfer_money().get(i));
        }
        frame_transfer_money.setVisible(true);

    }
}
