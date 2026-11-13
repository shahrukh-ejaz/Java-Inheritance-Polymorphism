package com.inheritance6;

public class BankDriver {

	public static void main(String[] args) {
		BankAccount account = new SavingAccount();
		
		account.calculateInterest();
		
		account.bankPolicy();
		
		SavingAccount savings = new SavingAccount();
		
		savings.bankPolicy();
	}
}
