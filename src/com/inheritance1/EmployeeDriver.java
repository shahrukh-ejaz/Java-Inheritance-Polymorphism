package com.inheritance1;

public class EmployeeDriver {
	
	public static void main(String[] args) {
		
		Manager manager = new Manager(
				10,
				"Rahul",
				50000,
				"IT",
				10000);
		
		manager.displayManager();
	}

}
