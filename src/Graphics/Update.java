package Graphics;

import javax.swing.*;
import java.awt.*;
import java.sql.SQLException;

public class Update {
    public void update_balance () throws SQLException, ClassNotFoundException {
        JFrame frame_update_balance = new JFrame("Start");
        frame_update_balance.setSize(500, 500);
        frame_update_balance.getContentPane().setBackground(new Color(0xC8DCDC));
        frame_update_balance.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame_update_balance.setLayout(null);

        Components_update component = new Components_update();

        for (int i = 0; i < component.returnUPDATE().size(); i++) {
            frame_update_balance.add(component.returnUPDATE().get(i));
        }
        frame_update_balance.setVisible(true);

    }
}
