package Graphics;

import Logic.Methods;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.lang.reflect.Method;
import java.sql.SQLException;
import java.util.ArrayList;

public class Components_update {
    private ArrayList<Component> buttons_update = new ArrayList<>();
    public Components_update () throws SQLException, ClassNotFoundException {
        Components_home come = new Components_home();
        JTextField textField_SCORE = new JTextField(come.getscore());
        textField_SCORE.setBounds(75, 200, 150, 30);
        JTextField textField_sum = new JTextField("Balance");
        textField_sum.setBounds(225, 200, 150, 30);
        JButton execute = new JButton("execute");
        execute.setBackground(new Color(0xE8E5AE));
        execute.setBounds(125, 250, 150, 20);
        JButton back = new JButton("<-Back");
        back.setBackground(new Color(0xDBD5B1));
        back.setBounds(5, 400, 110, 50);
        buttons_update.add(textField_SCORE);
        buttons_update.add(textField_sum);
        buttons_update.add(execute);
        buttons_update.add(back);

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
                    textField_sum.setText(String.valueOf(new Methods().show_balance(Integer.parseInt(textField_SCORE.getText()), new Components_identification().getPassword())));

                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                } catch (ClassNotFoundException classNotFoundException) {
                    classNotFoundException.printStackTrace();
                }
            }
        });
    }


    public ArrayList<Component> returnUPDATE() {
        return buttons_update;
    }
}
