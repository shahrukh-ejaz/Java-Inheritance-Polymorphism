package com.inheritance7;

public class Account {
	String accountHolder;
	double balance;
	
	public Account(String accountHolder, double balance) {
		
		this.accountHolder = accountHolder;
		this.balance = balance;
	}
	
	
	public void showAccountDetails() {
		System.out.println("Account Holder: "+ accountHolder);
		System.out.println("Balance: "+ balance);
	}
	

}
