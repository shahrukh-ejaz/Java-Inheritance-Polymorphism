package com.inheritance4;

public class DeviceDriver {
	
	public static void main(String[] args) {
		
		Device device = new SmartDevice();
		
		device.powerOn();
		device.deviceInfo();
		
		SmartDevice smart = (SmartDevice)device;
		
		smart.connectWifi();
		smart.installApp();
		
	}

}
