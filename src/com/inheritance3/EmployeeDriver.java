package com.inheritance3;

public class EmployeeDriver {
	public static void main(String[] args) {
		
		Employee emp = new Employee("Rahul", 30000);
		Manager manager =  new Manager("Amit", 50000, 15000);
		
		
		 Developer developer = new Developer("Rohit", 40000, 10000);

	        System.out.println("Employee: " + emp.name);
	        System.out.println("Salary: " + emp.calculateSalary());

	        System.out.println("--------------------");

	        System.out.println("Manager: " + manager.name);
	        System.out.println("Salary: " + manager.calculateSalary());

	        System.out.println("--------------------");

	        System.out.println("Developer: " + developer.name);
	        System.out.println("Salary: " + developer.calculateSalary());
	}

}
