package com.ivar.compositePattern;

public class TestHouse {

	public static void main(String[] args) {

		// Initialize three blocks
		Block block1 = new Block();
		Block block2 = new Block();
		Block block3 = new Block();

		// Initialize three houses
		House house = new House();
		House house1 = new House();
		House house2 = new House();
		House house3 = new House();

		// Compose groups
		house1.add(block1);
		house1.add(block2);
		house2.add(block2);
		house2.add(block3);
		house3.add(block3);
		house3.add(block1);

		house.add(house1);
		house.add(house2);
		house.add(house3);

		house.assemble();
		
		System.out.println("=========================");
		
		house.remove(house3);
		house.remove(house2);
		house.assemble();

	}

}
