package com.ivar.creational.factoryMethod;

public class TestCurrency {

	public static void main(String[] args) {
		Currency currency = FactoryCurrency.createCurrency("India");
		System.out.println(currency.getCurrency());
		
	}

}
