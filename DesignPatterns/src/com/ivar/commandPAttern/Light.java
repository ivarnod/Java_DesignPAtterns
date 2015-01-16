package com.ivar.commandPAttern;

public class Light {//Receiver

	@SuppressWarnings("unused")
	private boolean on;

	public void switchOn() {
		on = true;
	}

	public void switchOff() {
		on = false;
	}

}
