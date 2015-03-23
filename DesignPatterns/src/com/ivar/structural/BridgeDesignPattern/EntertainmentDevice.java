package com.ivar.structural.BridgeDesignPattern;

public abstract class EntertainmentDevice {
	
	public int deviceState;
	public int maxSetting;
	public int volume = 0;
	
	public abstract void keyFivePressed();
	public abstract void keySixPressed();
	
	public void deviceFeedback(){
		if(deviceState > maxSetting || deviceState < 0){
			deviceState = 0;
		}
		
		System.out.println("On" + deviceState );
	}
	
	public void volumeUp(){
		System.out.println("Volume up...");
		volume++;
	}
	
	public void volumeDown(){
		System.out.println("Volume up...");
		volume--;
	}

}
