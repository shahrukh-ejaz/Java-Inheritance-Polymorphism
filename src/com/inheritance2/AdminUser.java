package com.inheritance2;

public class AdminUser extends User {
	
	String adminRole;
	
	public AdminUser(String name, String email, String adminRole) {
		super(name, email);
		this.adminRole = adminRole;
	}
	
	public void displayAdmin() {
		displayUser();
		System.out.println("Admin Role: "+ adminRole);
	}

}
