package com.ivar.structural.BridgeDesignPattern;

public abstract class Remote {
	
	private EntertainmentDevice device;
	
	Remote(EntertainmentDevice device){
		this.device = device;
	}
	
	public abstract void pressNine();
	
	public void keyFivePressed(){
		device.keyFivePressed();
	}
	
	public void keySixPressed() {
		device.keySixPressed();
	}

}
