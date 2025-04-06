package com.banking.bank;
import java.util.Scanner;

// 4.2 BankAccount HAS-A relationship
class Bank {
    private int accountNumber;
    private String firstName;
    private String lastName;
    private double balance;
    private String accountType;

    
    public Bank(int accountNumber, String firstName, String lastName, String accountType) {
        this.accountNumber = accountNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = 0.0;
        this.accountType = accountType;
    }



    
    @Override
    public String toString() {
        return "Account Number: " + accountNumber + ", Name: " + firstName + " " + lastName +
                ", Balance: " + String.format("%.2f", balance) + ", Account Type: " + accountType;
    }
}

