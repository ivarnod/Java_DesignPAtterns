package commandPattern;

public class Client {

	public static void main(String[] args) {

		Light light = new Light();
		RemoteControl remote = new RemoteControl();

		Command cmdOn = new SwitchOn(light);
		Command cmdOff = new SwitchOff(light);

		// SwithOn
		remote.setCommand(cmdOn);
		remote.pressButton();

		// SwithOn
		remote.setCommand(cmdOff);
		remote.pressButton();

	}

}
