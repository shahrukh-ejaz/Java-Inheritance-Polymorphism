package com.inheritance4;

public class SmartDevice extends Device {
	
	@Override
	public void powerOn() {
		System.out.println("Smart device is starting");
	}
	
	public void connectWifi() {
		System.out.println("Connected to WIFI");
		
	}
	
	public void installApp() {
		System.out.println("Application installed");
	}

}
