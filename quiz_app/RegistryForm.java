package com.example.demo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RegistryForm extends JFrame {
    private JLabel nameLabel, emailLabel, passwordLabel;
    private JTextField nameField, emailField;
    private JPasswordField passwordField;
    private JButton registerButton;
    private DefaultListModel<String> listModel;
    private JList<String> nameList;

    public RegistryForm() {
        // set window properties
        setTitle("Registry Form");
        setSize(400, 300);
        setLocationRelativeTo(null); // center window
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // create form components
        nameLabel = new JLabel("Name:");
        emailLabel = new JLabel("Email:");
        passwordLabel = new JLabel("Password:");
        nameField = new JTextField(20);
        emailField = new JTextField(20);
        passwordField = new JPasswordField(20);
        registerButton = new JButton("OK");
        listModel = new DefaultListModel<>();
        nameList = new JList<>(listModel);

        // create layout
        JPanel panel = new JPanel(new GridLayout(4, 2));
        panel.add(nameLabel);
        panel.add(nameField);
        panel.add(emailLabel);
        panel.add(emailField);
        panel.add(passwordLabel);
        panel.add(passwordField);
        panel.add(new JLabel()); // empty cell
        panel.add(registerButton);

        // add list to layout
        //add(nameList, BorderLayout.SOUTH);

        // add layout to window
        add(panel, BorderLayout.NORTH);

        // add action listener to button
        registerButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                listModel.addElement(name);
                System.out.println(name);
                //nameField.setText("");
            }
        });

        // set window to visible
        setVisible(true);
    }

    public static void main(String[] args) {
        RegistryForm form = new RegistryForm();
    }
}

