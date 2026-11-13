package com.inheritance6;

public class SavingAccount extends BankAccount {
	
	@Override
	public void calculateInterest() {
		System.out.println("saving account interest is: 6%");
		
	}
	
	public static void bankPolicy() {
		System.out.println("Saving account special policy");
	}
	 

}
