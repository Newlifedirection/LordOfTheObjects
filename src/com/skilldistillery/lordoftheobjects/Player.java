package com.skilldistillery.lordoftheobjects;

import java.util.Scanner;

public class Player {

	public static void main(String[] args) {
		Player vehicle = new Player();
		vehicle.run();

	}
	public void run() {
		Scanner kb = new Scanner(System.in);
		System.out.println("Good morning and welcome to Denver's Morning Traffic battle! "
				+ "Select your combat vehicle");
		System.out.println("1: Humvee");
		System.out.println("2: Camry");
		System.out.println("3: Pinto");
		
		int choice = kb.nextInt();
		if(choice == 1) {
			System.out.println("Congradulatins! You picked the Humvee...over compinsating much?");
		}
		if(choice == 2) {
			System.out.println("Congradulations! You picked the Camry...you are ordanery");
		}
		if(choice == 3 ) {
			System.out.println("Congradulation! You picked the Pinto...you live for danger");
		}
		kb.close();
	}
	
}
