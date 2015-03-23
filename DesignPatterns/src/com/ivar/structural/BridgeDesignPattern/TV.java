package com.ivar.structural.BridgeDesignPattern;

public class TV extends EntertainmentDevice {
	
	TV(int deviceState, int maxSetting){
		this.deviceState = deviceState;
		this.maxSetting = maxSetting;
	}

	@Override
	public void keyFivePressed() {
		System.out.println("Channel up...");
		deviceState++;
	}

	@Override
	public void keySixPressed() {
		System.out.println("Channel down...");
		deviceState--;
	}

}
