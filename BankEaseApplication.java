package com.bankease;

import java.util.Scanner;

public class BankEaseApplication {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        BankService bank = new BankService();

        int choice;

        do {

            System.out.println("\n================================");
            System.out.println("       WELCOME TO BANKEASE");
            System.out.println("================================");

            System.out.println("1. Create Account");
            System.out.println("2. Display All Accounts");
            System.out.println("3. Search Account");
            System.out.println("4. Deposit Money");
            System.out.println("5. Withdraw Money");
            System.out.println("6. Check Balance");
            System.out.println("7. Transaction History");
            System.out.println("8. Delete Account");
            System.out.println("9. Exit");

            System.out.print("\nEnter your choice: ");

            try {

                choice = Integer.parseInt(sc.nextLine());

                switch (choice) {

                case 1:

                    try {

                        System.out.print("Enter Account Number: ");
                        int accNo = Integer.parseInt(sc.nextLine());

                        System.out.print("Enter Account Holder Name: ");
                        String name = sc.nextLine();

                        System.out.print("Enter Opening Balance: ");
                        double balance = Double.parseDouble(sc.nextLine());

                        bank.createAccount(accNo, name, balance);

                    } catch (DuplicateAccountException |
                             InvalidAmountException e) {

                        System.out.println("Error: " + e.getMessage());

                    } catch (IllegalArgumentException e) {

                        System.out.println("Error: " + e.getMessage());
                    }

                    break;


                case 2:

                    bank.displayAllAccounts();

                    break;


                case 3:

                    try {

                        System.out.print("Enter Account Number: ");
                        int accNo = Integer.parseInt(sc.nextLine());

                        BankAccount account = bank.searchAccount(accNo);

                        System.out.println("Account Found!");
                        System.out.println("Account Holder: "
                                + account.getAccountHolderName());
                        System.out.println("Balance: Rs. "
                                + account.getBalance());

                    } catch (AccountNotFoundException e) {

                        System.out.println("Error: " + e.getMessage());
                    }

                    break;


                case 4:

                    try {

                        System.out.print("Enter Account Number: ");
                        int accNo = Integer.parseInt(sc.nextLine());

                        System.out.print("Enter Deposit Amount: ");
                        double amount = Double.parseDouble(sc.nextLine());

                        bank.deposit(accNo, amount);

                    } catch (AccountNotFoundException |
                             InvalidAmountException e) {

                        System.out.println("Error: " + e.getMessage());
                    }

                    break;


                case 5:

                    try {

                        System.out.print("Enter Account Number: ");
                        int accNo = Integer.parseInt(sc.nextLine());

                        System.out.print("Enter Withdrawal Amount: ");
                        double amount = Double.parseDouble(sc.nextLine());

                        bank.withdraw(accNo, amount);

                    } catch (AccountNotFoundException |
                             InvalidAmountException |
                             InsufficientBalanceException e) {

                        System.out.println("Error: " + e.getMessage());
                    }

                    break;


                case 6:

                    try {

                        System.out.print("Enter Account Number: ");
                        int accNo = Integer.parseInt(sc.nextLine());

                        bank.checkBalance(accNo);

                    } catch (AccountNotFoundException e) {

                        System.out.println("Error: " + e.getMessage());
                    }

                    break;


                case 7:

                    try {

                        System.out.print("Enter Account Number: ");
                        int accNo = Integer.parseInt(sc.nextLine());

                        bank.displayTransactions(accNo);

                    } catch (AccountNotFoundException e) {

                        System.out.println("Error: " + e.getMessage());
                    }

                    break;


                case 8:

                    try {

                        System.out.print("Enter Account Number: ");
                        int accNo = Integer.parseInt(sc.nextLine());

                        bank.deleteAccount(accNo);

                    } catch (AccountNotFoundException e) {

                        System.out.println("Error: " + e.getMessage());
                    }

                    break;


                case 9:

                    System.out.println("Thank you for using BankEase!");
                    break;


                default:

                    System.out.println("Invalid choice! Please try again.");
                }

            } catch (NumberFormatException e) {

                System.out.println("Please enter a valid numeric input.");
                choice = 0;
            }

        } while (choice != 9);

        sc.close();
    }
}
