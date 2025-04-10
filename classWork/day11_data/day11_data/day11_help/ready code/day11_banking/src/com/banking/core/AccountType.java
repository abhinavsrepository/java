package com.banking.core;

public enum AccountType {
	SAVING(10000), CURRENT(3000), LOAN(50000), FD(25000);
	

	private double minBalance;
	private AccountType (double minBalance) {
		this.minBalance =minBalance;
	}

public int getMinBalance() {
	return (int) minBalance;
}
}
