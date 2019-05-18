package com.skilldistillery.lordoftheobjects;

import java.util.Scanner;

public class GameApp {

	public static void main(String[] args) {
		GameApp gameApp = new GameApp();
		gameApp.run();

	}
	public void run() {
		Scanner kb = new Scanner(System.in);
		System.out.println("Good morning and welcome to Denver's Morning Traffic battle! "
				+ "Select your combat vehicle");
		System.out.println("1: Humvee");
		System.out.println("2: Camry");
		System.out.println("3: Pinto");
		
		int choice = kb.nextInt();
		Vehicle player;
		if(choice == 1) {
			System.out.println("Congradulatins! You picked the Humvee...over compinsating much?");
			player = new Humvee("New and shiny 10", "TOO BIG", "Battle ready", "Costly");
		}
		if(choice == 2) {
			System.out.println("Congradulations! You picked the Camry...you are ordanery");
			player = new Camry("Not new or shiny 7", "Just Right", "Camoflauge", "Plain");
		}
		if(choice == 3 ) {
			System.out.println("Congradulation! You picked the Pinto...you live for danger");
			player = new Pinto("Barely roadworthy 5", "Small", "Combustable", "Spontaneously combusts");
		}
		
		Battle obstacle = new Battle();
		String O = obstacle.obstacle();
		System.out.println(O);
		
		kb.close();
		
	}
	
}
