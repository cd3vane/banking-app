package com.cd3vane.model;

public class Transaction {
    private int transactionId;
    private String companyName;
    private double amount;

    // Dummy data transaction creation for testing
    public Transaction(){
        transactionId = 1;
        companyName = "Amazon";
        amount = 13.95;
    }

    public int getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(int transactionId) {
        this.transactionId = transactionId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public boolean hasValidID(){
        return (transactionId != 0);
    }
}
