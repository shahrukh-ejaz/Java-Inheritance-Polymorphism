package com.inheritance3;

public class Developer  extends Employee{
	
	double projectAllowance;
	
	public Developer(String name, double basicSalary,
			double projectAllowance) {
		super(name, basicSalary);
		this.projectAllowance=projectAllowance;
	}
	
	@Override
	public double calculateSalary() {
		return basicSalary;
	}
	
	
	
	
	

}
