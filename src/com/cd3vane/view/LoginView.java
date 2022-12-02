package com.cd3vane.view;

import javax.swing.*;

public class LoginView extends JFrame {
    JButton loginButton;
    JPasswordField passwordField;
    JTextField usernameField;
    public LoginView(){
        super("Login");

        JPanel loginView = new JPanel();

        usernameField = new JTextField(16);
        passwordField = new JPasswordField(16);
        loginButton = new JButton("Login");

        loginView.add(usernameField);
        loginView.add(passwordField);
        loginView.add(loginButton);

        this.add(loginView);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setSize(300, 400);
    }
}
