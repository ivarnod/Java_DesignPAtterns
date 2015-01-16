package com.ivar.creational.abstractFactory;

public class ElephantFactory implements AnimalFactory {

	@Override
	public Animal createAnimal() {
		return new Elephant();
	}

}
