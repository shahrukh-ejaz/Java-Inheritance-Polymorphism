package com.inheritance7;

public class DigitalAccount  extends Account{
	
	String paymentId;
	
	DigitalAccount(String accountHolder, double balance,
				String paymentId){
		
		super(accountHolder, balance);
		this.paymentId = paymentId;
		
	}
	
	public void showDigitalDetails() {
		System.out.println("Payemnt ID: "+ paymentId);
	}

}
