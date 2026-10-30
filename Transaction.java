package com.bankease;

public class Transaction {

    private int transactionId;
    private int accountNumber;
    private String transactionType;
    private double amount;

    public Transaction(int transactionId, int accountNumber,
                       String transactionType, double amount) {

        this.transactionId = transactionId;
        this.accountNumber = accountNumber;
        this.transactionType = transactionType;
        this.amount = amount;
    }

    public int getTransactionId() {
        return transactionId;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public double getAmount() {
        return amount;
    }

    public void displayTransaction() {

        System.out.println("Transaction ID: " + transactionId);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Transaction Type: " + transactionType);
        System.out.println("Amount: Rs. " + amount);
        System.out.println("--------------------------");
    }
}
