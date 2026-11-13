package com.inheritance3;

public class Employee {
	
	String name;
	double basicSalary;
	
	public Employee(String name, double basicSalary) {
		this.name = name;
		this.basicSalary = basicSalary;
	}
	
	public double calculateSalary() {
		return basicSalary;
	}

}
