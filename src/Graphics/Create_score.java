package Graphics;

import javax.swing.*;
import java.awt.*;

public class Create_score {
    public void create_score() {
        JFrame frame_create = new JFrame("Create");
        frame_create.setSize(500, 500);
        frame_create.getContentPane().setBackground(new Color(0xC8DCDC));
        frame_create.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame_create.setLayout(null);

        Components_Create_score components_create_score = new Components_Create_score();

        for (int i = 0; i < components_create_score.return_array().size(); i++) {
            frame_create.add(components_create_score.return_array().get(i));
        }
        frame_create.setVisible(true);
    }
}
