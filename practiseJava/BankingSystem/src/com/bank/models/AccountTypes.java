package com.bank.models;

public enum AccountTypes {
	
	SAVING(8.1),CURRENT(1900);
	
	private double acctypeconstant;
	private AccountTypes(double acctypeconstant) {
		this.acctypeconstant = acctypeconstant;
		
	}
	public double getAcctypeconstant() {
		return acctypeconstant;
		

	}
	public void setAcctypeconstant(double acctypeconstant) {
		this.acctypeconstant = acctypeconstant;
	}
}
