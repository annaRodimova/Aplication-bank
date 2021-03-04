package Graphics;

import Chat.Chat;
import Logic.Users;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.sql.SQLException;
import java.util.ArrayList;

public class Components_Chat {

    ArrayList<Component> components_array = new ArrayList<>();

    public Components_Chat() {
        JTextField textFiel_user_name = new JTextField("You");
        textFiel_user_name.setBounds(10, 50, 50, 30);
        TextArea textFiel_user_massage = new TextArea("new massage");
        textFiel_user_massage.setBounds(10, 100, 200, 100);
        JTextField textFiel_bank_name = new JTextField("Bank");
        textFiel_bank_name.setBounds(380, 150, 50, 30);
        TextArea textField_bank_massage = new TextArea("***");
        textField_bank_massage.setBounds(230, 200, 200, 100);

        JButton send_message = new JButton("Send");
        send_message.setBackground(new Color(0x5DBFBF));
        send_message.setBounds(355, 400, 110, 50);

        JButton back = new JButton("<-Back");
        back.setBackground(new Color(0xDBD5B1));
        back.setBounds(5, 400, 110, 50);

        back.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    new Home().home();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                } catch (ClassNotFoundException classNotFoundException) {
                    classNotFoundException.printStackTrace();
                }
            }

        });

        send_message.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Chat chat = new Chat();
                textField_bank_massage.setText(null);
                textField_bank_massage.setText(chat.responceOutput(textFiel_user_massage.getText()));
            }
        });
        components_array.add(textFiel_user_massage);
        components_array.add(textField_bank_massage);
        components_array.add(textFiel_bank_name);
        components_array.add(textFiel_user_name);
        components_array.add(send_message);
        components_array.add(back);



        send_message.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    public ArrayList<Component> return_array () {
        return components_array;
    }
}
