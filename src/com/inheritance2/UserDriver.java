package com.inheritance2;

public class UserDriver {
	
	public static void main(String[] args) {
		
		
		AdminUser admin = new AdminUser("Rahul", "rahul@gmail.com", "Super Admin");
		CustomerUser customer = new CustomerUser("Amit", "amit@gmail.com", 101);
		
		 System.out.println("----- ADMIN DETAILS -----");
	        admin.displayAdmin();

	        System.out.println();

	        System.out.println("----- CUSTOMER DETAILS -----");
	        customer.displayCustomer();
	}

}
