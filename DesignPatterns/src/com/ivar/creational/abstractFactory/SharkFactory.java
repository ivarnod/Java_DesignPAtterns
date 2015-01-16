package com.ivar.creational.abstractFactory;

public class SharkFactory implements AnimalFactory {

	@Override
	public Animal createAnimal() {		
		return new Shark();
	}

}
