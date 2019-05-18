package com.skilldistillery.lordoftheobjects;

import java.util.Scanner;

public class Vehicle {

//	Fields
	private String condition;
	private String size;
	private String advantage;
	private String disadvantage;
	
	public String getCondition() {
		return condition;
	}
	
	public Vehicle(String condition, String size, String advantage, String disadvantage) {
		super();
		this.condition = condition;
		this.size = size;
		this.advantage = advantage;
		this.disadvantage = disadvantage;
	}

	public void setCondition(String condition) {
		this.condition = condition;
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
	
}
