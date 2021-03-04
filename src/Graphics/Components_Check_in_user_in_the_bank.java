package Graphics;

import Logic.Users;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.sql.SQLException;
import java.util.ArrayList;

public class Components_Check_in_user_in_the_bank {
    ArrayList<Component> components_array = new ArrayList<>();
    private static JTextField textField_Password = new JTextField("Password");

    public String getPassword () {
        return textField_Password.getText();
    }

    public Components_Check_in_user_in_the_bank() {
        JTextField textFiel_Name = new JTextField("Name");
        textFiel_Name.setBounds(75, 200, 150, 30);
        JTextField textField_Surname = new JTextField("Surname");
        textField_Surname.setBounds(225, 200, 150, 30);
        JTextField textField_Patronymic =  new JTextField("Patronymic");
        textField_Patronymic.setBounds(75, 250, 150, 20);
        textField_Password.setBounds(225, 250, 150, 20);


        JButton EXIT_IN_BANK =  new JButton("Exit in the bank");
        EXIT_IN_BANK.setBackground(new Color(0xE8E5AE));
        EXIT_IN_BANK.setBounds(75, 300, 150, 20);
        JButton check_in = new JButton("Check in the bank");
        check_in.setBackground(new Color(0x5DBFBF));
        check_in.setBounds(225, 300, 150, 20);

        check_in.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Users user = new Users(textFiel_Name.getText(), textField_Surname.getText(), textField_Patronymic.getText(), textField_Password.getText());

                new Create_score().create_score();

                try {
                    user.new_user(user);
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                } catch (ClassNotFoundException classNotFoundException) {
                    classNotFoundException.printStackTrace();
                }
            }
        });
        EXIT_IN_BANK.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Identification().identifications();
            }
        });

        components_array.add(textFiel_Name);
        components_array.add(textField_Surname);
        components_array.add(textField_Patronymic);
        components_array.add(textField_Password);
        components_array.add(check_in);
        components_array.add(EXIT_IN_BANK);
    }

    public ArrayList<Component> return_array () {
        return components_array;
    }
}
