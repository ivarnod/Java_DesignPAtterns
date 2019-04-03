package factoryMethod;

import java.util.Scanner;

public class TestCurrency {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		String country = scanner.nextLine();
		
		Currency currency = FactoryCurrency.createCurrency(country);
		System.out.println(currency.getCurrency());
		
	}

}
