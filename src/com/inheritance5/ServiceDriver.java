package com.inheritance5;

public class ServiceDriver {
	public static void main(String[] args) {
		
		Service basic = new Service();
		Service basicPlan = basic.createPlan();
		basicPlan.showDetails();
		
		System.out.println("---------------");
		
		PremiumService premium = new PremiumService();
		PremiumService premiumPlan = premium.createPlan();
		
		premiumPlan.showDetails();
		premiumPlan.prioritySupport();
	}

}
