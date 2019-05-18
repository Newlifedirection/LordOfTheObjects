package com.skilldistillery.lordoftheobjects;

public class Humvee extends Vehicle {

//	Fields

//	Constructors

//		Methods

		
	public Humvee(int condition, String size, String advantage, String disadvantage) {
		super(condition, size, advantage, disadvantage);
		
		System.out.println("The Humvee comes with some great battle ready feature, including"
				+ " fire proof armor and a large fuel tank");
		System.out.println();
		System.out.println("The Humvee is large receiving frequent damage, on small roads");
		System.out.println();
		
		Vehicle humvee = new Vehicle(10, "Large", "Durable", "Damage prone");
		System.out.println(humvee.getInfo1());
	}
}
