package Graphics;

import javax.swing.*;
import java.awt.*;

public class Operations {
    public void operation() {
        JFrame frame_operation = new JFrame("Start");
        frame_operation.setSize(500, 500);
        frame_operation.getContentPane().setBackground(new Color(0xC8DCDC));
        frame_operation.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame_operation.setLayout(null);
        frame_operation.setVisible(true);
        Components_operations component = new Components_operations();

        for (int i = 0; i < component.return_array().size(); i++) {
            frame_operation.add(component.return_array().get(i));
        }
    }
}
