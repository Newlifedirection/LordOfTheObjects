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
			player = new Humvee("New and shiny 10", "TOO BIG", "Battle ready", "Costly");
			System.out.println("Congradulatins! You picked the Humvee...over compinsating much?");
		}
		if(choice == 2) {
			player = new Camry("Not new or shiny 7", "Just Right", "Camoflauge", "Plain");
			System.out.println("Congradulations! You picked the Camry...you are ordanery");
		}
		if(choice == 3 ) {
			player = new Pinto("Barely roadworthy 5", "Small", "Combustable", "Spontaneously combusts");
			System.out.println("Congradulation! You picked the Pinto...you live for danger");
		}
		kb.close();
	}
	
}
