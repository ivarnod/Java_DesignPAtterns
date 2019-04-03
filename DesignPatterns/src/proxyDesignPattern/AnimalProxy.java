package proxyDesignPattern;

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