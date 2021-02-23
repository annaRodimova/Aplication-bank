package Graphics;

import Logic.Methods;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.sql.SQLException;
import java.util.ArrayList;

public class Components_transfer_money {
    private ArrayList<Component> buttons_transfer_money = new ArrayList<>();
    public Components_transfer_money () throws SQLException, ClassNotFoundException {
        Components_home come = new Components_home();
        JTextField textField_SCORE = new JTextField(come.getscore());
        textField_SCORE.setBounds(75, 170, 150, 30);
        JTextField textField_sum = new JTextField("sum");
        textField_sum.setBounds(225, 170, 150, 30);
        JTextField textField_SCORE_in = new JTextField("score in");   // не видно
        textField_SCORE_in.setBounds(75, 210, 150, 30); // не видно
        JTextField textField_surname_in = new JTextField("Surname in");   // не видно
        textField_surname_in.setBounds(225, 210, 150, 30);  // не видно
        JButton execute = new JButton("execute");
        execute.setBackground(new Color(0xE8E5AE));
        execute.setBounds(125, 250, 150, 20);
        JButton back = new JButton("<-Back");
        back.setBackground(new Color(0xDBD5B1));
        back.setBounds(5, 400, 110, 50);

        buttons_transfer_money.add(textField_SCORE);
        buttons_transfer_money.add(textField_sum);
        buttons_transfer_money.add(execute);
        buttons_transfer_money.add(back);
        buttons_transfer_money.add(textField_SCORE_in);
        buttons_transfer_money.add(textField_surname_in);

        back.addActionListener(new AbstractAction() {
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

        execute.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    new Methods().transfer_balance(Integer.parseInt(textField_sum.getText()), Integer.parseInt(textField_SCORE.getText()), new Components_identification().getPassword(), Integer.parseInt(textField_SCORE_in.getText()), textField_surname_in.getText());
                    textField_SCORE.setText(null);
                    String text = "funds transferred";
                    JOptionPane.showMessageDialog(null, text);

                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                    String text = "Recipient not found";
                    JOptionPane.showMessageDialog(null, text);
                } catch (ClassNotFoundException classNotFoundException) {
                    classNotFoundException.printStackTrace();
                }
            }
        });

    }
    public ArrayList<Component> return_transfer_money() {
        return buttons_transfer_money;
    }

}
