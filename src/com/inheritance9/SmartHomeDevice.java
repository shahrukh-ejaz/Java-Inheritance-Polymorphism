package com.inheritance9;

public class SmartHomeDevice implements Camera, MusicPlayer {
	
	@Override
	public void takePhoto() {
		System.out.println("Photo captured");
		
	}
		
		@Override
	    public void recordVideo() {
	        System.out.println("Video recording started");
	    }

	    @Override
	    public void playMusic() {
	        System.out.println("Music is playing");
	    }

	    @Override
	    public void stopMusic() {
	        System.out.println("Music stopped");
	}

}
