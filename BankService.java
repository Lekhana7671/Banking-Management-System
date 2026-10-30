package com.bankease;

import java.util.HashMap;
import java.util.ArrayList;

public class BankService {

    //Collection to store bank accounts
    private HashMap<Integer, BankAccount> accounts =
            new HashMap<>();

    //Collection to store transactions
    private ArrayList<Transaction> transactions =
            new ArrayList<>();

    private int transactionCounter = 1;


    //Create account
    public void createAccount(int accountNumber,
                              String accountHolderName,
                              double balance)
            throws DuplicateAccountException,
                   InvalidAmountException {

        if (accounts.containsKey(accountNumber)) {
            throw new DuplicateAccountException(
                    "Account number already exists!"
            );
        }

        if (accountNumber <= 0) {
            throw new IllegalArgumentException(
                    "Account number must be positive!"
            );
        }

        if (accountHolderName == null ||
                accountHolderName.trim().isEmpty()) {
            throw new IllegalArgumentException(
                    "Account holder name cannot be empty!"
            );
        }

        if (balance < 0) {
            throw new InvalidAmountException(
                    "Opening balance cannot be negative!"
            );
        }

        BankAccount account = new BankAccount(
                accountNumber, accountHolderName, balance
        );

        accounts.put(accountNumber, account);

        System.out.println("Account created successfully!");
    }


    //Display all accounts
    public void displayAllAccounts() {

        if (accounts.isEmpty()) {
            System.out.println("No accounts available.");
            return;
        }

        System.out.println("\n===== ALL BANK ACCOUNTS =====");

        for (BankAccount account : accounts.values()) {

            System.out.println("Account Number: "
                    + account.getAccountNumber());

            System.out.println("Account Holder: "
                    + account.getAccountHolderName());

            System.out.println("Balance: Rs. "
                    + account.getBalance());

            System.out.println("--------------------------");
        }
    }


    //Search account
    public BankAccount searchAccount(int accountNumber)
            throws AccountNotFoundException {

        BankAccount account = accounts.get(accountNumber);

        if (account == null) {
            throw new AccountNotFoundException(
                    "Account not found!"
            );
        }

        return account;
    }


    //Deposit money
    public void deposit(int accountNumber, double amount)
            throws AccountNotFoundException,
                   InvalidAmountException {

        BankAccount account = searchAccount(accountNumber);

        if (amount <= 0) {
            throw new InvalidAmountException(
                    "Deposit amount must be greater than zero!"
            );
        }

        double updatedBalance = account.getBalance() + amount;

        account.setBalance(updatedBalance);

        addTransaction(accountNumber, "DEPOSIT", amount);

        System.out.println("Amount deposited successfully!");
        System.out.println("Updated Balance: Rs. "
                + updatedBalance);
    }


    //Withdraw money
    public void withdraw(int accountNumber, double amount)
            throws AccountNotFoundException,
                   InvalidAmountException,
                   InsufficientBalanceException {

        BankAccount account = searchAccount(accountNumber);

        if (amount <= 0) {
            throw new InvalidAmountException(
                    "Withdrawal amount must be greater than zero!"
            );
        }

        if (amount > account.getBalance()) {
            throw new InsufficientBalanceException(
                    "Insufficient balance!"
            );
        }

        double updatedBalance = account.getBalance() - amount;

        account.setBalance(updatedBalance);

        addTransaction(accountNumber, "WITHDRAWAL", amount);

        System.out.println("Amount withdrawn successfully!");
        System.out.println("Remaining Balance: Rs. "
                + updatedBalance);
    }


    //Check balance
    public void checkBalance(int accountNumber)
            throws AccountNotFoundException {

        BankAccount account = searchAccount(accountNumber);

        System.out.println("Account Holder: "
                + account.getAccountHolderName());

        System.out.println("Available Balance: Rs. "
                + account.getBalance());
    }


    //Add transaction
    private void addTransaction(int accountNumber,
                                String type,
                                double amount) {

        Transaction transaction = new Transaction(
                transactionCounter++,
                accountNumber,
                type,
                amount
        );

        transactions.add(transaction);
    }


    // 8. DISPLAY TRANSACTION HISTORY
    public void displayTransactions(int accountNumber)
            throws AccountNotFoundException {

        searchAccount(accountNumber);

        boolean found = false;

        System.out.println("\n===== TRANSACTION HISTORY =====");

        for (Transaction transaction : transactions) {

            if (transaction.getAccountNumber() == accountNumber) {

                transaction.displayTransaction();
                found = true;
            }
        }

        if (!found) {
            System.out.println("No transactions available.");
        }
    }


    //Delete account
    public void deleteAccount(int accountNumber)
            throws AccountNotFoundException {

        searchAccount(accountNumber);

        accounts.remove(accountNumber);

        System.out.println("Account deleted successfully!");
    }
}
