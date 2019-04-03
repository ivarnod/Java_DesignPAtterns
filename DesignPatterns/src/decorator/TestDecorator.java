package decorator;

public class TestDecorator {

	public static void main(String[] args) {

		IceCreamDecorator decorator = new HoneyDecorator(new NuttyDecorator(
				new BaseIcecream()));

		System.out.println(decorator.makeIcecream());

	}

}
