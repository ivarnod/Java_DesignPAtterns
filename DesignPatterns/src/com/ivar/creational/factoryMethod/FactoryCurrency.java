package com.ivar.creational.factoryMethod;

public class FactoryCurrency {
	
	public static Currency createCurrency(String country){
		if(country.equalsIgnoreCase("India")){
			return new Rupee();
		}else if(country.equalsIgnoreCase("US")){
			return new SGDollar();
		}else if(country.equalsIgnoreCase("SG")){
			return new SGDollar();
		}else{
			throw new IllegalArgumentException("No such currency...");
		}
	}

}
