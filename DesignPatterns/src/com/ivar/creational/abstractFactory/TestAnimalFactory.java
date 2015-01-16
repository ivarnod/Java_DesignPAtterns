package com.ivar.creational.abstractFactory;

public class TestAnimalFactory {

	public static void main(String[] args) {
		
		new WonderLand(createAnimalFactory("water"));
		
	}
	
	public static AnimalFactory createAnimalFactory(String types){
		
		if("water".equalsIgnoreCase(types)){
			return new SharkFactory();
		}else{
			return new ElephantFactory();
		}
		
	}

}
