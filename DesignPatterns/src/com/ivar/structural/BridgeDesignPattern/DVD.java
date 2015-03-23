package com.ivar.structural.BridgeDesignPattern;

public class DVD extends EntertainmentDevice {
	
	DVD(int deviceState, int maxSetting){
		this.deviceState = deviceState;
		this.maxSetting = maxSetting;
	}

	@Override
	public void keyFivePressed() {
		System.out.println("Chapter up...");
		deviceState++;
	}

	@Override
	public void keySixPressed() {
		System.out.println("Chapter down...");
		deviceState--;
	}

}
