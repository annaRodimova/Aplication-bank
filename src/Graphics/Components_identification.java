package Graphics;

import Logic.Users;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;

public class Components_identification {
    private ArrayList<Component> buttons_for_identification = new ArrayList<>();
    public Components_identification () {
        JTextField textFiel_SCORE = new JTextField("SCORE");
        textFiel_SCORE.setBounds(75, 200, 150, 30);
        JTextField textField_password = new JTextField("PASSWORD");
        textField_password.setBounds(225, 200, 150, 30);
        JButton check_in =  new JButton("Check in the bank");
        check_in.setBackground(new Color(0xE8E5AE));
        check_in.setBounds(75, 250, 150, 20);
        JButton EXIT_IN_BANK = new JButton("Exit in the bank");
        EXIT_IN_BANK.setBackground(new Color(0x5DBFBF));
        EXIT_IN_BANK.setBounds(225, 250, 150, 20);

        check_in.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Check_in_user_in_the_bank().Chec_in();
            }
        });

        EXIT_IN_BANK.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    textFiel_SCORE.setText(null);
                    textField_password.setText(null);
                    boolean exit = false;
                    exit = new Users().identification(textFiel_SCORE.getColumns(), textField_password.getText());
                    if (exit == true ) {
                        new Home().home();
                    }
                    else {
                        String text = "You entered incorrect login details";
                        JOptionPane.showMessageDialog(null, text);
                    }
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                } catch (ClassNotFoundException classNotFoundException) {
                    classNotFoundException.printStackTrace();
                }

            }
        });


                buttons_for_identification.add(check_in);
                buttons_for_identification.add(EXIT_IN_BANK);
                buttons_for_identification.add(textFiel_SCORE);
                buttons_for_identification.add(textField_password);
            }

            public ArrayList<Component> Return_array() {
                return buttons_for_identification;
            }
}
