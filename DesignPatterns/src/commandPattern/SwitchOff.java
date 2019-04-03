package commandPattern;

public class SwitchOff implements Command {

	Light light;

	public SwitchOff(Light light) {
		super();
		this.light = light;
	}

	@Override
	public void execute() {
		light.switchOff();
		System.out.println("Light Off...");
	}

}
