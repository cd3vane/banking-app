package com.cd3vane.view;

import com.cd3vane.model.Account;
import com.cd3vane.model.User;

import javax.swing.*;
import java.awt.event.*;

public class AccountView extends JFrame {
    boolean balanceIsShown = false;
    JTextField balanceOutput;
    JTextField accountOwner;
    public static Account myAccount;
    User currentUser;
    public AccountView(){
        super("Account View");

        myAccount = initializeAccount();
        JPanel accountView = new JPanel();

        // Create fields
        balanceOutput = new JTextField(16);
        accountOwner = new JTextField(16);

        // Set default text
        balanceOutput.setText("Your current balance: *****");
        accountOwner.setText("Hello, " + myAccount.getAccountOwner().getName());

        JButton toggleBalance = new JButton("Toggle Balance");
        ViewBalanceListener viewBalanceListener = new ViewBalanceListener();
        toggleBalance.addActionListener(viewBalanceListener);

        accountView.add(accountOwner);
        accountView.add(toggleBalance);
        accountView.add(balanceOutput);

        this.add(accountView);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setSize(300, 400);
    }

    private class ViewBalanceListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if(!balanceIsShown){
                balanceOutput.setText("Your current balance: " + myAccount.getBalance());
                balanceIsShown = true;
            }else{
                balanceOutput.setText("Your current balance: ****" );
                balanceIsShown = false;
            }
            }
        }


    public Account initializeAccount(){
        return new Account(new User("Charles DeVane"));
    }

}
