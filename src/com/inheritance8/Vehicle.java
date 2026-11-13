package com.inheritance8;

public class Vehicle {
	String brand;
	double rentPerDay;
	public Vehicle(String brand, double rentPerDay) {
	
		this.brand = brand;
		this.rentPerDay = rentPerDay;
	}
	
	public void showDetails() {
		System.out.println("Brand: "+ brand);
		System.out.println("Rent per Day: "+ rentPerDay);
	}
	
	public void calculateRent(int days) {
		System.out.println("Total Rent: "+(rentPerDay * days));
	}
	
	

}
