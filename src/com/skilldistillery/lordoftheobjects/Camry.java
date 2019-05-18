package com.skilldistillery.lordoftheobjects;

public class Camry extends Vehicle {
//	Fields

//	Constructors
	
//	Methods
	
	public Camry(int condition, String size, String advantage, String disadvantage) {
		super(condition, size, advantage, disadvantage);
		
		System.out.println(
				"The Camry comes with some great battle ready feature, including" 
				+ " ultimate urban camoflauge");
		System.out.println();
		System.out.println("The Camry is difficult to see receiving frequent damage");
		System.out.println();
	Vehicle camry = new Vehicle(8, "Medium", "Maliable", "Average");
	System.out.println(camry.getInfo2());

	}
}
