package Graphics;

import javax.swing.*;
import java.awt.*;

public class Home {
    public void home() {
        JFrame frame_home = new JFrame("Start");
        frame_home.setSize(500, 500);
        frame_home.getContentPane().setBackground(new Color(0xC8DCDC));
        frame_home.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame_home.setLayout(null);
        frame_home.setVisible(true);
        Components_home component = new Components_home();

        for (int i = 0; i < component.return_array_home().size(); i++) {
            frame_home.add(component.return_array_home().get(i));
        }
    }
}
