package com.ivar.structural.BridgeDesignPattern;

public class TVRemoteMute extends RemoteDevice {

	TVRemoteMute(EntertainmentDevice device) {
		super(device);
	}

	@Override
	public void pressNine() {
		System.out.println("TV muted...");
	}

}
