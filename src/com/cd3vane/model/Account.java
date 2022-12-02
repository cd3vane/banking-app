package com.cd3vane.model;

import java.util.List;

public class Account {

    public enum accountType {
        CHECKING, SAVING
    }
    private User accountOwner;
    private double balance;



    public Account(User owner){
        accountOwner = owner;
        balance = 100.00;
    }


    public double getBalance() {
        return balance;
    }

    public User getAccountOwner() {
        return accountOwner;
    }

}
