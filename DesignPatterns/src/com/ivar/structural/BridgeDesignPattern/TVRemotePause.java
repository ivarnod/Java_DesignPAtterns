package com.ivar.structural.BridgeDesignPattern;

public class TVRemotePause extends RemoteDevice {

	TVRemotePause(EntertainmentDevice device) {
		super(device);
	}

	@Override
	public void pressNine() {
		System.out.println("TV paused...");
	}
}
