package com.cd3vane.model;

import java.util.ArrayList;
import java.util.List;

public class TransactionHistory {
    public List<Transaction> transactionList = new ArrayList<>();

    public void push(Transaction transaction){
        transactionList.add(transaction);
    }

    public Transaction getTransactionById(int id) {
        for (Transaction transaction : transactionList) {
            if (transaction.getTransactionId() == id) {
                return transaction;
            }
        }
        System.out.println("Transaction does not exist");
        return null;
    }
}
