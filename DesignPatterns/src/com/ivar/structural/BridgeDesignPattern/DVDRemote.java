package com.ivar.structural.BridgeDesignPattern;

public class DVDRemote extends Remote {

	DVDRemote(EntertainmentDevice device) {
		super(device);
	}

	@Override
	public void pressNine() {
		System.out.println("Mute it...");
	}

}
