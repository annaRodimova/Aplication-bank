package Graphics;

import Logic.Users;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.sql.SQLException;
import java.util.ArrayList;

public class Components_add_score {
    ArrayList<Component> components_array = new ArrayList<>();

    public Components_add_score() {
        JTextField textFiel_open_score = new JTextField("new Score");
        textFiel_open_score.setBounds(140, 50, 200, 30);
        JTextArea textField = new JTextArea("Заявление на открытие счета карты.Условия банковского обслуживания физических лиц ПАО Сбербанк\n" +
                "(вступают в силу с 15.03.2021)\n" +
                "1. ОБЩИЕ ПОЛОЖЕНИЯ\n" +
                "1.1. Настоящие Условия банковского обслуживания физических лиц ПАО Сбербанк (далее -\n" +
                "«Условия банковского обслуживания») и Заявление на банковское обслуживание, надлежащим образом\n" +
                "заполненное и подписанное Клиентом, в совокупности являются заключенным между Клиентом и ПАО\n" +
                "Сбербанк (далее - «Банк») Договором банковского обслуживания (далее - «ДБО»).\n" +
                "1.2. ДБО считается заключенным с момента получения Банком лично от Клиента Заявления на\n" +
                "банковское обслуживание на бумажном носителе по форме, установленной Банком, подписанного\n" +
                "Клиентом собственноручно, при предъявлении Клиентом документа, удостоверяющего личность.\n" +
                "Экземпляр Заявления на банковское обслуживание с отметкой о принятии его Банком передается Клиенту\n" +
                "и является документом, подтверждающим факт заключения ДБО.\n" +
                "ДБО может быть заключен с использованием Аналога собственноручной подписи/электронной подписи\n" +
                "Клиента, если это предусмотрено иным договором, ранее заключенным между Клиентом и Банком.");
        textField.setBounds(35, 100, 410, 250);
        JCheckBox jCheckBox_no = new JCheckBox("Yes");
        jCheckBox_no.setBounds(245, 360, 100, 30);
        JCheckBox jCheckBox_yes = new JCheckBox("No");
        jCheckBox_yes.setBounds(135, 360, 100, 30);

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

        JButton Save = new JButton("Save");
        Save.setBackground(new Color(0x5DBFBF));
        Save.setBounds(363, 400, 110, 50);

        components_array.add(textFiel_open_score);
        components_array.add(back);
        components_array.add(textField);
        components_array.add(jCheckBox_no);
        components_array.add(jCheckBox_yes);
        components_array.add(Save);

        Save.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {
                    //if (jCheckBox_no.getText().equals(null)) {

                        Users users = new Users();
                        textFiel_open_score.setText(String.valueOf(users.add_score(new Components_identification().getPassword())));
                   // }
                    /*else {
                        String text = "Для открытия счета, необходимо подписать заявление";
                        JOptionPane.showMessageDialog(null, text);
                    }*/

                    } catch(SQLException throwables){
                        throwables.printStackTrace();
                    } catch(ClassNotFoundException classNotFoundException){
                        classNotFoundException.printStackTrace();
                    }

            }
        });
    }

    public ArrayList<Component> return_array () {
        return components_array;
    }
}
