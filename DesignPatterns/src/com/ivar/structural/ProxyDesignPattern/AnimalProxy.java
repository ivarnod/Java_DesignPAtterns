package com.ivar.structural.ProxyDesignPattern;

public class AnimalProxy implements Animal {
	
	private Animal animal;

	@Override
	public void move() {
		if(animal == null){
			animal = new AnimalImpl("DOG...");
		}		
		animal.move();
	}

}
