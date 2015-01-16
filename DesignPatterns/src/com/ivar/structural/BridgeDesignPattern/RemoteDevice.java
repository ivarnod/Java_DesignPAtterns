package com.ivar.structural.BridgeDesignPattern;

public abstract class RemoteDevice {

	EntertainmentDevice device;

	RemoteDevice(EntertainmentDevice device) {
		this.device = device;
	}

	public void pressSeven() {
		device.pressSeven();
	}

	public void pressEight() {
		device.pressEight();
	}

	public abstract void pressNine();

}
