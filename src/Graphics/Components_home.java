package Graphics;

import Logic.Users;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.sql.SQLException;
import java.util.ArrayList;

public class Components_home {
    private static String score1 = "";

    public String getscore() {
        return score1;
    }

    ArrayList<Component> components_array =  new ArrayList<>();
    public Components_home () throws SQLException, ClassNotFoundException {
        ArrayList<Integer> score = new Users().access_to_data(new Components_identification().getScore(), new Components_identification().getPassword());

        String[] items  = new String[score.size()];
        for(int i = 0 ; i < score.size() ; i++){
            items[i] = String.valueOf(score.get(i));  //valueOf- переводит число в строку
        }

        JComboBox comboBox = new JComboBox(items);
        comboBox.setBounds(50, 200, 200, 30);

        JButton button_operation1 = new JButton("Operation");
        button_operation1.setBackground(new Color(0x5DBFBF));
        button_operation1.setBounds(300, 200, 100, 30);
        JButton button_Open_score = new JButton("Open score");
        button_Open_score.setBackground(new Color(0x5DBFBF));
        button_Open_score.setBounds(160, 400, 100, 30);

        JButton Chat = new JButton("Chat");
        Chat.setBackground(new Color(0xDBD5B1));
        Chat.setBounds(300, 400, 110, 30);

        JButton back = new JButton("<-Back");
        back.setBackground(new Color(0xDBD5B1));
        back.setBounds(5, 400, 110, 30);

        back.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Identification().identifications();
            }

        });
        button_operation1.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    new Operations().operation();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                } catch (ClassNotFoundException classNotFoundException) {
                    classNotFoundException.printStackTrace();
                }
            }
        });

        button_Open_score.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        comboBox.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                score1 = (String) comboBox.getSelectedItem();
            }
        });

        Chat.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    new Chat_frame().chat_frame();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                } catch (ClassNotFoundException classNotFoundException) {
                    classNotFoundException.printStackTrace();
                }
            }
        });

        button_Open_score.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Add_Score().add_score();
            }
        });

        components_array.add(comboBox);
        components_array.add(button_operation1);
        components_array.add(button_Open_score);
        components_array.add(back);
        components_array.add(Chat);

    }
    public ArrayList<Component> return_array_home() {
        return components_array;
    }
}
