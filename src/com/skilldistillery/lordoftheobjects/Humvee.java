package com.skilldistillery.lordoftheobjects;

public class Humvee extends Vehicle {

//	Fields

//	Constructors

//		Methods

		
	public Humvee(String condition, String size, String advantage, String disadvantage) {
		super(condition, size, advantage, disadvantage);
		
		System.out.println("The Humvee comes with some great battle ready feature, including"
				+ "fire and small caliber bullet proof armor and a large fuel tank");
		System.out.println("The Humvee's large fuel tank requires frequent refueling");
	}
}
