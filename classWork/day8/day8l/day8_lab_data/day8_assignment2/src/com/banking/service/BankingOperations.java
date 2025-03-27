package com.banking.service;

//B.L layer interface
public interface BankingOperations {
	//open new bank account
	String  openBankAccount(int acctNo, String firstName, 
			String lastName, double balance, String acctType,String dob);
//	2.2 Display all accounts
	void displayAllAccounts();

}
