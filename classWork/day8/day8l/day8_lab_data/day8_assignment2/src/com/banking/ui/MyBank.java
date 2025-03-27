package com.banking.ui;

import java.util.Scanner;

import com.banking.service.BankingOperations;
import com.banking.service.BankingOperationsImpl;

public class MyBank {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// 1. prompt user
			System.out.println("Enter max no of accounts ");
			// 2 . Create Bank operations imple class instance
			BankingOperations ops = new BankingOperationsImpl(sc.nextInt());
			boolean exit = false;
			while (!exit) {
				System.out.println("1. Open A/c 2. Display All 0.Exit");
				System.out.println("Enter Option");
				switch (sc.nextInt()) {
				case 1:
					System.out.println("Enter a/c details - acctNo,  firstName, "
							+ "lastName,  balance,  acctType,  dob ");
					System.out.println(ops.openBankAccount(sc.nextInt(), sc.next(), sc.next(),
							sc.nextDouble(), sc.next(),sc.next()));
					break;
				case 2:
					ops.displayAllAccounts();
					break;

				case 0:
					break;
				}
			}

		}

	}

}
