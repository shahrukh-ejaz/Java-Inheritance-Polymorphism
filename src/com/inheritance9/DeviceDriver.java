package com.inheritance9;

public class DeviceDriver {
	
	public static void main(String[] args) {
		
		SmartHomeDevice device = new SmartHomeDevice();
		
		device.takePhoto();
		device.recordVideo();
		
		device.playMusic();
		device.stopMusic();
	}

}
