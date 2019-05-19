package com.skilldistillery.lordoftheobjects;

import java.util.Scanner;

public class Vehicle {

	private int condition;
	private String size;
	private String advantage;
	private String disadvantage;
	
	public int getCondition() {
		return condition;
	}
	
	public Vehicle(int condition, String size, String advantage, String disadvantage) {
		super();
		this.condition = condition;
		this.size = size;
		this.advantage = advantage;
		this.disadvantage = disadvantage;
	}

	public void setCondition(int condition) {
		this.condition = condition;
		if(condition <= 0) {
			System.out.println(" Game over, you are a loser! ");
			System.exit(0);
		}
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getAdvantage() {
		return advantage;
	}
	public void setAdvantage(String advantage) {
		this.advantage = advantage;
	}
	public String getDisadvantage() {
		return disadvantage;
	}
	public void setDisadvantage(String disadvantage) {
		this.disadvantage = disadvantage;
	}
	
	public String getInfo1() {
		return " Condition: " + condition + " | Size: " + size + " | Advantage: " + advantage + " | Disadvantage: " + disadvantage;
	}
	public String getInfo2() {
		return " Condition: " + condition + " | Size: " + size + " | Advantage: " + advantage + " | Disadvantage: " + disadvantage;
	}
	public String getInfo3() {
		return " Condition: " + condition + " | Size: " + size + " | Advantage: " + advantage + " | Disadvantage: " + disadvantage;
	}
	public void comfrontObstacle(Scanner kb) { 
	}
}
