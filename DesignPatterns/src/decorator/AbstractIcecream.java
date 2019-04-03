package decorator;

public class AbstractIcecream implements IceCreamDecorator {

	IceCreamDecorator decorator;

	public AbstractIcecream(IceCreamDecorator decorator) {
		this.decorator = decorator;
	}

	@Override
	public String makeIcecream() {
		return decorator.makeIcecream();
	}

}
