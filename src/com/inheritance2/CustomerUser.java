package com.inheritance2;

public class CustomerUser extends User{
	
	int customerId;
	
	public CustomerUser(String name, String email, int customerId) {
		
		super(name, email);
		this.customerId = customerId;
		
	}
	
	public void displayCustomer() {
		
		displayUser();
		System.out.println("Customer ID: "+ customerId);
		
	}

}
