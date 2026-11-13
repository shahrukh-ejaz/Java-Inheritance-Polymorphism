package com.inheritance5;

public class PremiumService extends Service {
	
	@Override
	public PremiumService createPlan() {
		System.out.println("Premimum service plan created");
		return new PremiumService();
	}
	
	@Override
	public void showDetails() {
		System.out.println("Premimum service activated");
	}
	
	public void prioritySupport() {
		System.out.println("24/7 prioroty support enabled");
	}

}
