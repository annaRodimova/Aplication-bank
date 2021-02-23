package Graphics;

import javax.swing.*;
import java.awt.*;

public class Check_in_user_in_the_bank {
    public void Chec_in() {
        JFrame frame_chec_in = new JFrame("Start");
        frame_chec_in.setSize(500, 500);
        frame_chec_in.getContentPane().setBackground(new Color(0xC8DCDC));
        frame_chec_in.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame_chec_in.setLayout(null);

        Components_Check_in_user_in_the_bank components_check_in_user_in_the_bank = new Components_Check_in_user_in_the_bank();

        for (int i = 0; i < components_check_in_user_in_the_bank.return_array().size(); i++) {
            frame_chec_in.add(components_check_in_user_in_the_bank.return_array().get(i));

        }
        frame_chec_in.setVisible(true);
    }
}
