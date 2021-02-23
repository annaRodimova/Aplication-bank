package Graphics;

import Logic.Methods;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.sql.SQLException;
import java.util.ArrayList;

public class Components_take_of {
    private ArrayList<Component> buttons_take_of = new ArrayList<>();
    public Components_take_of () throws SQLException, ClassNotFoundException {
        Components_home come = new Components_home();
        JTextField textField_SCORE = new JTextField(come.getscore());
        textField_SCORE.setBounds(75, 200, 150, 30);
        JTextField textField_sum = new JTextField("sum");
        textField_sum.setBounds(225, 200, 150, 30);
        JButton execute =  new JButton("execute");
        execute.setBackground(new Color(0xE8E5AE));
        execute.setBounds(125, 250, 150, 20);
        JButton back = new JButton("<-Back");
        back.setBackground(new Color(0xDBD5B1));
        back.setBounds(5, 400, 110, 50);
        buttons_take_of.add(textField_SCORE);
        buttons_take_of.add(textField_sum);
        buttons_take_of.add(execute);
        buttons_take_of.add(back);

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
                    new Methods().take_of_balance((Integer.parseInt(textField_sum.getText())), Integer.parseInt(textField_SCORE.getText()), new Components_identification().getPassword());
                    textField_SCORE.setText(null);
                    textField_sum.setText(null);
                    String text = "You balance is reduced";
                    JOptionPane.showMessageDialog(null, text);
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                } catch (ClassNotFoundException classNotFoundException) {
                    classNotFoundException.printStackTrace();
                }
            }
        });
    }

    public ArrayList<Component> returntake_of() {
        return buttons_take_of;
    }
}
