package com.ivar.structural.BridgeDesignPattern;

public abstract class EntertainmentDevice {

	public int deviceState;
	public int maxSetting;
	public int volume = 0;

	public abstract void pressSeven();

	public abstract void pressEight();

	public void deviceFeedback(){
		if(deviceState > maxSetting || deviceState < 0 ){
			deviceState = 0;
		}
		System.out.println("On " +deviceState);
	}

	public void pressFive() {
		volume--;
		System.out.println("Volume down : " + volume);
	}

	public void pressSix() {
		volume++;
		System.out.println("Volume down : " + volume);
	}

}
