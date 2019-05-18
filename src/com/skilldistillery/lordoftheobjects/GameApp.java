package com.skilldistillery.lordoftheobjects;

import java.util.Scanner;

public class GameApp {

	public static void main(String[] args) {
		GameApp gameApp = new GameApp();
		gameApp.run();

	}
	public void run() {
		Scanner kb = new Scanner(System.in);
		System.out.println(" Good morning and welcome to Denver's Morning Traffic battle! "
				+ " Select your combat vehicle wisely, it is a war out there.");
		System.out.println("1: Humvee ");
		System.out.println("2: Camry ");
		System.out.println("3: Pinto ");
		
		int choice = kb.nextInt();
		Vehicle player;
		if(choice == 1) {
			System.out.println("Congradulatins! You picked the Humvee...over compinsating much?");
			System.out.println();
			player = new Humvee(10, "TOO BIG", "Battle ready", "Costly");
		}
		else if(choice == 2) {
			System.out.println("Congradulations! You picked the Camry...you are ordanery");
			System.out.println();
			player = new Camry(7, "Just Right", "Camoflauge", "Plain");
		}
		else {
			System.out.println("Congradulation! You picked the Pinto...you live for danger");
			System.out.println();
			player = new Pinto(5, "Small", "Combustable", "Spontaneously combusts");
		}
		
		System.out.println();
		for (int i = 0; i < 3 ; i++) {
			player.comfrontObstacle(kb); }
		
		System.out.println(" Congradulations! You have survived the morning commute. " 
				+ " You Win and Dr. Strange teleports you home safely.");
		
		kb.close();
		
	}
	
}
