package com.banking.service;

import java.time.LocalDate;

import com.banking.core.BankAccount;

public class BankingOperationsImpl 
implements BankingOperations {
//state - bank accounts
	private BankAccount[] accounts;// state - mem allocated on the heap - upon obj creation!!!!
	private int counter;

	public BankingOperationsImpl(int size) {
		accounts = new BankAccount[size];
		System.out.println("created acct array");
	}

	@Override
	public String openBankAccount(int acctNo, 
			String firstName, String lastName, double balance, 
			String acctType,String dob) {
		if(counter < accounts.length)
		{
			//call validation rule
			BankAccount acct=new BankAccount(acctNo, firstName,
					lastName, balance, acctType,LocalDate.parse(dob));
			accounts[counter++]=acct;
			return "new bank a/c  opened.....";
		}
		else 			
		return "Bank capacity over !!!!!!!!!!!!!";
	}

	@Override
	public void displayAllAccounts() {
		System.out.println("All accounts -");
		for (BankAccount a : accounts)
			System.out.println(a);//a.toString()

	}

}
