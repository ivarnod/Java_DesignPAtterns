package com.ivar.creational.decorator;

public class HoneyDecorator extends AbstractIcecream {

	public HoneyDecorator(IceCreamDecorator decorator) {
		super(decorator);
	}

	@Override
	public String makeIcecream() {
		return decorator.makeIcecream() + addHoney();
	}

	public String addHoney() {
		return " + Honey..";
	}

}
