package com.ivar.structural.BridgeDesignPattern;

public class TVRemote extends Remote {

	TVRemote(EntertainmentDevice device){
		super(device);
	}
	
	@Override
	public void pressNine() {
		System.out.println("Mute it...");
	}

}
