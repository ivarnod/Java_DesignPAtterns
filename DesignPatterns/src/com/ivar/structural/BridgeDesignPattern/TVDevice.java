package com.ivar.structural.BridgeDesignPattern;

public class TVDevice extends EntertainmentDevice {

	TVDevice(int deviceState, int maxSetting) {
		this.deviceState = deviceState;
		this.maxSetting = maxSetting;
	}

	@Override
	public void pressSeven() {
		System.out.println("Device Channel Down...");
		deviceState--;
	}

	@Override
	public void pressEight() {
		System.out.println("Device Channel Up...");
		deviceState++;
	}

}
