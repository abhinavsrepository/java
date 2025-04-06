package com.selfHelp.com;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<BankAccount> accounts;

    public Bank() {
        this.accounts = new ArrayList<>();
    }

    public void openAccount(int accountNumber, String accountHolderName, double initialDeposit) {
        if (findAccount(accountNumber) != null) {
            System.out.println("Error: Account with number " + accountNumber + " already exists.");
            return;
        }
        if (initialDeposit >= 0) {
            BankAccount newAccount = new BankAccount(accountNumber, accountHolderName, initialDeposit);
            accounts.add(newAccount);
            System.out.println("Account opened successfully.");
        } else {
            System.out.println("Initial deposit must be non-negative.");
        }
    }

    private BankAccount findAccount(int accountNumber) {
        for (BankAccount account : accounts) {
            if (account.getAccountNumber() == accountNumber) {
                return account;
            }
        }
        return null;
    }

    public void displayAccountSummary(int accountNumber) {
        BankAccount account = findAccount(accountNumber);
        if (account != null) {
            account.displaySummary();
        } else {
            System.out.println("Account not found with number: " + accountNumber);
        }
    }

    public void withdraw(int accountNumber, double amount) {
        BankAccount account = findAccount(accountNumber);
        if (account != null) {
            account.withdraw(amount);
        } else {
            System.out.println("Account not found with number: " + accountNumber);
        }
    }

    public void deposit(int accountNumber, double amount) {
        BankAccount account = findAccount(accountNumber);
        if (account != null) {
            account.deposit(amount);
        } else {
            System.out.println("Account not found with number: " + accountNumber);
        }
    }

    public void transferFunds(int sourceAccountNumber, int destinationAccountNumber, double amount) {
        BankAccount sourceAccount = findAccount(sourceAccountNumber);
        BankAccount destinationAccount = findAccount(destinationAccountNumber);

        if (sourceAccount == null) {
            System.out.println("Source account not found: " + sourceAccountNumber);
            return;
        }
        if (destinationAccount == null) {
            System.out.println("Destination account not found: " + destinationAccountNumber);
            return;
        }
        if (sourceAccount.getBalance() >= amount) {
            if (sourceAccount.withdraw(amount)) {
                destinationAccount.deposit(amount);
                System.out.println("Funds transferred successfully from account " + sourceAccountNumber + " to " + destinationAccountNumber + ".");
            } else {
                System.out.println("Error during withdrawal from source account.");
            }
        } else {
            System.out.println("Insufficient balance in source account: " + sourceAccountNumber);
        }
    }
}
