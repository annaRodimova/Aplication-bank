package Graphics;

import Logic.Users;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.sql.SQLException;
import java.util.ArrayList;

public class Components_Create_score {
    ArrayList<Component> components_array = new ArrayList<>();
    public Components_Create_score() {
        JTextField textFiel_open_score = new JTextField("new Score");
        textFiel_open_score.setBounds(185, 100, 150, 30);
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
        textField.setBounds(100, 150, 200, 100);
        JCheckBox jCheckBox_no = new JCheckBox("No");
        jCheckBox_no.setBounds(260, 210, 40, 10);
        JCheckBox jCheckBox_yes = new JCheckBox("Yes");
        jCheckBox_yes.setBounds(260, 260, 40, 10);

        JButton EXIT_IN_BANK =  new JButton("Exit in the bank");
        EXIT_IN_BANK.setBackground(new Color(0x5DBFBF));
        EXIT_IN_BANK.setBounds(5, 400, 110, 50);

        JButton Save = new JButton("Save");
        Save.setBackground(new Color(0x5DBFBF));
        Save.setBounds(350, 400, 110, 50);

        components_array.add(textFiel_open_score);
        components_array.add(EXIT_IN_BANK);
        components_array.add(textField);
        components_array.add(jCheckBox_no);
        components_array.add(jCheckBox_yes);
        components_array.add(Save);

        EXIT_IN_BANK.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Identification().identifications();
            }
        });

        Save.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Components_Check_in_user_in_the_bank new_user = new Components_Check_in_user_in_the_bank();
                Users users =  new Users();
                try {
                    textFiel_open_score.setText(String.valueOf(users.add_score(new_user.getPassword())));

                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                } catch (ClassNotFoundException classNotFoundException) {
                    classNotFoundException.printStackTrace();
                }
            }
        });
    }



    public ArrayList<Component> return_array () {
        return components_array;
    }
}
