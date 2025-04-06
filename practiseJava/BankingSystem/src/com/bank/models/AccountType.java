package com.bank.models;

public abstract class AccountType {
	
	private int accountNumber;
	private String firstName;
	private String lastName;
	private double balance;
	private String accountType;
	

	public AccountType(int accountNumber,String firstName,String lastName,String accountType) {
		this.accountNumber = accountNumber;
		this.firstName = firstName;
		this.lastName =lastName;
		this.balance=0.0;
		this.accountType =accountType;
		
		
	}
	
	@Override
	public String toString () {
		return "Account Number " +accountNumber +"Name:"+firstName+ ""+lastName +
				"Balance: " +accountType;
	}

	
	

}
