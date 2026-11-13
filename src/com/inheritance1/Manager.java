package com.inheritance1;

public class Manager extends Employee {

    String department;
    double bonus;
    
    public Manager(int id, String name, double salary, 
    		String department, double bonus) {
    	super(id, name, salary);
    	
    	this.department = department;
    	this.bonus = bonus;
    }
    
    public void displayManager() {
    	
    	displayEmployee();
    	
    	 System.out.println("Department: " + department);
         System.out.println("Bonus: " + bonus);
         System.out.println("Total Salary: " + (salary + bonus));
    }
}
