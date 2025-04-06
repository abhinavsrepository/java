package com.selfHelp.com;

import java.util.Scanner;

public class BankingApp {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nBanking System Menu:");
            System.out.println("1. Open New Account");
            System.out.println("2. Display Account Summary");
            System.out.println("3. Withdraw");
            System.out.println("4. Deposit");
            System.out.println("5. Funds Transfer");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Account Number: ");
                    int accNoOpen = scanner.nextInt();
                   // scanner.nextLine();
                    System.out.print("Enter Account Holder Name: ");
                    String nameOpen = scanner.nextLine();
                    System.out.print("Enter Initial Deposit: ");
                    double depositOpen = scanner.nextDouble();
                    scanner.nextLine();
                    bank.openAccount(accNoOpen, nameOpen, depositOpen);
                    break;
                case 2:
                    System.out.print("Enter Account Number to display summary: ");
                    int accNoDisplay = scanner.nextInt();
                    scanner.nextLine();
                    bank.displayAccountSummary(accNoDisplay);
                    break;
                case 3:
                    System.out.print("Enter Account Number to withdraw from: ");
                    int accNoWithdraw = scanner.nextInt();
                    System.out.print("Enter Withdrawal Amount: ");
                    double amountWithdraw = scanner.nextDouble();
                    scanner.nextLine();
                    bank.withdraw(accNoWithdraw, amountWithdraw);
                    break;
                case 4:
                    System.out.print("Enter Account Number to deposit into: ");
                    int accNoDeposit = scanner.nextInt();
                    System.out.print("Enter Deposit Amount: ");
                    double amountDeposit = scanner.nextDouble();
                    scanner.nextLine();
                    bank.deposit(accNoDeposit, amountDeposit);
                    break;
                case 5:
                    System.out.print("Enter Source Account Number: ");
                    int srcAccNo = scanner.nextInt();
                    System.out.print("Enter Destination Account Number: ");
                    int destAccNo = scanner.nextInt();
                    System.out.print("Enter Transfer Amount: ");
                    double transferAmount = scanner.nextDouble();
                    scanner.nextLine();
                    bank.transferFunds(srcAccNo, destAccNo, transferAmount);
                    break;
                case 0:
                    System.out.println("Exiting Banking System. Thank you!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 0);

        scanner.close();
    }
}
//creating banking core 
