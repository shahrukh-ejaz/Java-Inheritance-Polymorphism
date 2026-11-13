package com.inheritance1;

public class Employee {
	int employeeId;
	String employeeName;
	double salary;
	
	
	public Employee(int employeeId, String employeeName, double salary) {
		this.employeeId=employeeId;
		this.employeeName = employeeName;
		this.salary = salary;
	}
	
	public void displayEmployee() {
		System.out.println("Employee ID:" + employeeId);
		System.out.println("Employee Name: " + employeeName);
		System.out.println("Basic salary: " + salary);
		
	}

}
