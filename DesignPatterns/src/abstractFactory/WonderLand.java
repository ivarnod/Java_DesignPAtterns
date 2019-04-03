package abstractFactory;

public class WonderLand {
	
	public WonderLand(AnimalFactory factory){
		Animal animal = factory.createAnimal();
		animal.move();
	}

}
