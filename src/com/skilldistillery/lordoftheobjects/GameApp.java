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
			player = new Humvee(10, "TOO BIG", "Battle ready", "Costly");
		}
		else if(choice == 2) {
			System.out.println("Congradulations! You picked the Camry...you are ordanery");
			player = new Camry(7, "Just Right", "Camoflauge", "Plain");
		}
		else {
			System.out.println("Congradulation! You picked the Pinto...you live for danger");
			player = new Pinto(5, "Small", "Combustable", "Spontaneously combusts");
		}
		
		
		Battle obstacle = new Battle();
		String o = obstacle.obstacle();
		System.out.println(o);
		

		if(choice == 1 && o == obstacle.getObstacle()[0]) {
			System.out.println("1. Drive through the horde of poop animals.");
			System.out.println("2. Stick your head out the window and scream at the animals to get out of the way.");
			System.out.println("3. Wait for the animals to move.");
			int decision = kb.nextInt();
			
			if(decision == 1) {
				System.out.println("Oh no the tires slipped on poop and you hit a wall");
				player.setCondition (player.getCondition() - 3);
				
			}
			if(decision == 2) {
				System.out.println("Oh no.. poop landed on your face right when you stuck your head out the window");
				player.setCondition (player.getCondition() - 2);
					
			}
			if(decision == 3) {
				System.out.println("Hmm");
				player.setCondition (player.getCondition() - 1);
			}
		}
		
		kb.close();
		
	}
	
}
