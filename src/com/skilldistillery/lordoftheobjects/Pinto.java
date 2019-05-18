package com.skilldistillery.lordoftheobjects;

public class Pinto extends Vehicle {
//	Fields

//	Constructors

//	Methods
	
	public Pinto(int condition, String size, String advantage, String disadvantage) {
		super(condition, size, advantage, disadvantage);
		
		System.out.println("The Pinto comes with some great battle ready feature, including"
				+ " great aerodynamics and the ability to explode on will");
		System.out.println();
		System.out.println("The Pinto is prone to spontaneous combustion receiving frequent damage");
		System.out.println();
		
		Vehicle pinto = new Vehicle(5, "Small", "Conbustable", "Conbustable");
		System.out.println(pinto.getInfo3());
	}
}