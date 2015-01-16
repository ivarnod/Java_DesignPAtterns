package com.ivar.structural.BridgeDesignPattern;

public class DVDDevice extends EntertainmentDevice {
	
	DVDDevice(int deviceState, int maxSetting){
		this.deviceState = deviceState;
		this.maxSetting = maxSetting;
	}

	@Override
	public void pressSeven() {
		System.out.println("Next chapter...");
		deviceState++;
	}

	@Override
	public void pressEight() {
		System.out.println("Previous chapter...");
		deviceState--;
	}

}
