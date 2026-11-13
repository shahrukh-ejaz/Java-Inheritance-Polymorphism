package com.inheritance5;

public class Service {
	public Service createPlan() {
		System.out.println("Basic service plan creted");
		return new Service();
	}
	
	public void showDetails() {
		System.out.println("Basic service activated");
	}

}
