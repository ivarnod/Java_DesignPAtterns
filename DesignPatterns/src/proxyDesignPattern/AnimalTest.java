package proxyDesignPattern;

public class AnimalTest {

	public static void main(String[] args) {
		Animal dog = new AnimalProxy();
		dog.move();
	}

}
