package com.banking;

/*
 * state - account no , 
 * customer name(first name ,last name) , balance ,  
 * account  type : string
 */
public class BankAccount {
	private String acctNo;
	private String firstName;
	private String lastName;
	private double balance;
	private String acctType;

	public BankAccount(String acctNo, String firstName, String lastName, double balance, String acctType) {
		super();
		this.acctNo = acctNo;
		this.firstName = firstName;
		this.lastName = lastName;
		this.balance = balance;
		this.acctType = acctType;
	}

	@Override
	public String toString() {
		return "BankAccount Summary -" + acctNo + ", firstName=" + firstName + ", lastName=" + lastName + ", balance="
				+ balance + ", acctType=" + acctType + "]";
	}

	@Override
	public boolean equals(Object anotherObj) {
		System.out.println("in ac equals");
		if (anotherObj instanceof BankAccount) {
			BankAccount anotherAccount=((BankAccount)anotherObj);
			return this.acctNo.equals(anotherAccount.acctNo);
		}
		return false;
	}

}
