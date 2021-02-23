package Graphics;

import Logic.Methods;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.sql.SQLException;
import java.util.ArrayList;

public class Components_add_money {
    private ArrayList<Component> buttons_add_money = new ArrayList<>();
    public Components_add_money () throws SQLException, ClassNotFoundException {
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
        buttons_add_money.add(textField_SCORE);
        buttons_add_money.add(textField_sum);
        buttons_add_money.add(execute);
        buttons_add_money.add(back);

        execute.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    new Methods().add_balance(Integer.parseInt(textField_sum.getText()), Integer.parseInt(textField_SCORE.getText()), new Components_identification().getPassword());
                    textField_SCORE.setText(null);
                    textField_sum.setText(null);
                    String text = "You balance is replanished";
                    JOptionPane.showMessageDialog(null, text);

                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                } catch (ClassNotFoundException classNotFoundException) {
                    classNotFoundException.printStackTrace();
                }
            }
        });
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

    }
    public ArrayList<Component> returnAdd() {
        return buttons_add_money;
    }
}
