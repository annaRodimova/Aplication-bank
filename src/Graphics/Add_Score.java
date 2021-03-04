package Graphics;

import javax.swing.*;
import java.awt.*;

public class Add_Score {
    public void add_score() {
        JFrame frame_add = new JFrame("Create");
        frame_add.setSize(500, 500);
        frame_add.getContentPane().setBackground(new Color(0xC8DCDC));
        frame_add.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame_add.setLayout(null);

        Components_add_score components_add_score = new Components_add_score();

        for (int i = 0; i < components_add_score.return_array().size(); i++) {
            frame_add.add(components_add_score.return_array().get(i));
        }
        frame_add.setVisible(true);
    }
}
