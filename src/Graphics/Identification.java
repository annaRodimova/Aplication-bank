package Graphics;

import javax.swing.*;
import java.awt.*;

public class Identification {
    public void identifications() {
        JFrame frame_identification = new JFrame("Start");
        frame_identification.setSize(500, 500);
        frame_identification.getContentPane().setBackground(new Color(0xC8DCDC));
        frame_identification.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame_identification.setLayout(null);

        Components_identification identification_user= new Components_identification();

        for (int i = 0; i < identification_user.Return_array().size(); i++) {
            frame_identification.add(identification_user.Return_array().get(i));

        }
        frame_identification.setVisible(true);
    }
}
