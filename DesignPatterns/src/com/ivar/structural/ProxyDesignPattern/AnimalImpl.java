package com.ivar.structural.ProxyDesignPattern;

public class AnimalImpl implements Animal {

	String animal;
	
	AnimalImpl(String animal){
		this.animal = animal;		
	}
	
	@Override
	public void move() {
		System.out.println("I am  moving" + this.animal);
	}

}
