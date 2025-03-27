package com.banking.core;

import java.time.LocalDate;

/*
 * state - account no , 
 * customer name(first name ,last name) , balance ,  
 * account  type : string
 */
public class BankAccount {
	private int acctNo;
	private String firstName;
	private String lastName;
	private double balance;
	private String acctType;
	//bank customer's date of birth
	private LocalDate dob;
	public BankAccount(int acctNo, String firstName, 
			String lastName, double balance, String acctType,
			LocalDate dob) {
		super();
		this.acctNo = acctNo;
		this.firstName = firstName;
		this.lastName = lastName;
		this.balance = balance;
		this.acctType = acctType;
		this.dob=dob;
	}
	@Override
	public String toString() {
		return "BankAccount Summary -"+ acctNo + ", firstName=" + firstName + ", lastName=" + lastName + ", balance="
				+ balance + ", acctType=" + acctType + "Customer's  DoB "+dob;
	}
	
	@Override
	public boolean equals(Object o)
	{
		System.out.println("in acct eq");
		if(o instanceof BankAccount) {
			return this.acctNo==((BankAccount)o).acctNo;
		}
		return false;
	}
	
}
