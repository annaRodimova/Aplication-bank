package Graphics;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

public class Components_operations {
    ArrayList<Component> components_Array = new ArrayList<>();
    public Components_operations() {
        JTextField textField_score = new JTextField("Score");
        textField_score.setBounds(100, 150, 265, 50);
        JButton button_add_money = new JButton("Add Money");
        button_add_money.setBackground(new Color(0x5DBFBF));
        button_add_money.setBounds(5, 250, 110, 50);
        JButton button_Take_of = new JButton("Take of");
        button_Take_of.setBackground(new Color(0x5DBFBF));
        button_Take_of.setBounds(120, 250, 110, 50);
        JButton button_transfer =  new JButton("Transfer");
        button_transfer.setBackground(new Color(0x5DBFBF));
        button_transfer.setBounds(235, 250, 110, 50);
        JButton button_update = new JButton("Update balance");
        button_update.setBackground(new Color(0x5DBFBF));
        button_update.setBounds(350, 250, 125, 50);
        JButton back = new JButton("<-Back");
        back.setBackground(new Color(0xDBD5B1));
        back.setBounds(5, 400, 110, 50);

        back.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Home().home();
            }
        });
        components_Array.add(textField_score);
        components_Array.add(button_update);
        components_Array.add(button_add_money);
        components_Array.add(button_Take_of);
        components_Array.add(button_transfer);
        components_Array.add(back);

    }
    public ArrayList<Component> return_array() {
        return components_Array;
    }
}
