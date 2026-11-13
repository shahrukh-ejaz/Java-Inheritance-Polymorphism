package com.inheritance3;

public class Manager  extends Employee{
	
	double bonus;
	
	public Manager(String name, double basicSalary, double bonus) {
		super(name, basicSalary);
		this.bonus = bonus;
	}
	
	@Override
	public double calculateSalary() {
		return basicSalary + bonus;
		
		

	}

}
