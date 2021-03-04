package Graphics;

import javax.swing.*;
import java.awt.*;
import java.sql.SQLException;

public class Chat_frame {
    public void chat_frame() throws SQLException, ClassNotFoundException {
        JFrame frame_chat = new JFrame("Start");
        frame_chat.setSize(500, 500);
        frame_chat.getContentPane().setBackground(new Color(0xC8DCDC));
        frame_chat.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame_chat.setLayout(null);

        Components_Chat component = new Components_Chat();

        for (int i = 0; i < component.return_array().size(); i++) {
            frame_chat.add(component.return_array().get(i));
        }
        frame_chat.setVisible(true);
    }
}
