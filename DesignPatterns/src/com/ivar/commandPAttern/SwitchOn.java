package com.ivar.commandPAttern;

public class SwitchOn implements Command {

	Light light;

	public SwitchOn(Light light) {
		super();
		this.light = light;
	}

	@Override
	public void execute() {
		light.switchOn();
		System.out.println("Light On...");
	}

}
