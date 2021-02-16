package Graphics;

import Logic.Users;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

public class Components_home {
    ArrayList<Component> components_array =  new ArrayList<>();
    public Components_home () {
        JTextField score1 = new JTextField("score");
        score1.setBounds(50, 100, 100, 30);
        JTextField score2 = new JTextField("score");
        score2.setBounds(50, 150, 100, 30);
        JTextField score3 = new JTextField("score");
        score3.setBounds(50, 200, 100, 30);
        JTextField balance1 = new JTextField("balance");
        balance1.setBounds(175, 100, 100, 30);
        JTextField balance2 = new JTextField("balance");
        balance2.setBounds(175, 150, 100, 30);
        JTextField balance3 = new JTextField("balance");
        balance3.setBounds(175, 200, 100, 30);

        JButton button_operation1 = new JButton("Operation");
        button_operation1.setBackground(new Color(0x5DBFBF));
        button_operation1.setBounds(300, 100, 100, 30);
        JButton button_operation2 = new JButton("Operation");
        button_operation2.setBackground(new Color(0x5DBFBF));
        button_operation2.setBounds(300, 150, 100, 30);
        JButton button_operation3 = new JButton("Operation");
        button_operation3.setBackground(new Color(0x5DBFBF));
        button_operation3.setBounds(300, 200, 100, 30);

        button_operation1.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Operations().operation();
            }
        });

        /*button_operation2.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

         */

        /*button_operation3.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

         */

        components_array.add(score1);
        components_array.add(score2);
        components_array.add(score3);
        components_array.add(balance1);
        components_array.add(balance2);
        components_array.add(balance3);
        components_array.add(button_operation1);
        components_array.add(button_operation2);
        components_array.add(button_operation3);
    }
    public ArrayList<Component> return_array_home() {
        return components_array;
    }
}
