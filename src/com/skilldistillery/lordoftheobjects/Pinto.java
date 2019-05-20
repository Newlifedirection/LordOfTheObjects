package com.skilldistillery.lordoftheobjects;

import java.util.Scanner;

public class Pinto extends Vehicle {

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

	public void comfrontObstacle(Scanner kb) {
		Battle obstacle = new Battle();
		String o = obstacle.obstacle();
		System.out.println(o);
		System.out.println();

		if ( o == obstacle.getObstacle()[0]) {
			System.out.println("1. Risk everything and speed through.");
			System.out.println("2. Stick your head out the window and scream at the animals to get out of the way.");
			System.out.println("3. Wait for the animals to move.");
			int decision = kb.nextInt();

			if (decision == 1) {
				System.out.println(
						"Your car was so ugly the animals ignored you");
				this.setCondition(this.getCondition() - 0);

			}
			if (decision == 2) {
				System.out.println("The animals didn't even look at you");
				this.setCondition(this.getCondition() - 0);

			}
			if (decision == 3) {
				System.out.println("Hmm waiting seems to have worked the animals are leaving");
				this.setCondition(this.getCondition() - 0);
			}
			System.out.println("condition of vehicle is: " + this.getCondition());
			System.out.println();
			System.out.println("After getting out of there you run into");
			System.out.println();
		}
		
		if (o == obstacle.getObstacle()[1]) {
			System.out.println("1: Drive under Godzilla Dancing.");
			System.out.println("2: Drive around Godzilla Dancing.");
			System.out.println("3: Wait for Godzilla to leave.");
			int decision = kb.nextInt();

			if (decision == 1) {
				System.out.println("Godzilla saw your ugly car and stomped on you.");
				int damage = (int) (Math.floor(Math.random() * 6) + 4) ;
				System.out.println("Your car took : " + damage + " damage");
				this.setCondition(this.getCondition() - damage);
				
			}
			if (decision == 2) {
				System.out.println(
						"Godzilla thaught a cockroach ran passed his foot and ran away.");
//				int damage = (int) (Math.floor(Math.random() * 6) + 4) ;
				System.out.println("Your car took 0 damage");
				this.setCondition(this.getCondition() - 0);

			}
			if (decision == 3) {
				System.out.println("Before Godzilla got tired from dancing your car exhaust fell off.");
				int damage = (int) (Math.floor(Math.random() * 2) + 1) ;
				System.out.println("Your car took : " + damage + " damage");
				this.setCondition(this.getCondition() - damage);

			}
			
			System.out.println("condition of vehicle is: " + this.getCondition());
			System.out.println();
			System.out.println("After that you drove down the road and make a left and encounter");
			System.out.println();
		}
		
		if ( o == obstacle.getObstacle()[2]) {
			System.out.println("1. Drive through.");
			System.out.println("2. Scream for help.");
			System.out.println("3. Help the avengers.");
			int decision = kb.nextInt();

			if (decision == 1) {
				System.out.println("Your car blended in with the destruction and no one noticed you.");
				System.out.println("Your car took : 0 damage");
				this.setCondition(this.getCondition() - 0);

			}
			if (decision == 2) {
				System.out
						.println(" You alerted more monsters and the avengers lost the fight the city blows up and so does your car.");
				int damage = (int) (Math.floor(Math.random() * 6) + 4) ;
				System.out.println("Your car took : " + damage + " damage");
				
				this.setCondition(this.getCondition() - damage);

			}
			if (decision == 3) {
				System.out.println("You jumped out of your moving car, when the car hit thanos it exploded."
						+ "But an alien came up behind you and stabbed you.");
				int damage = (int) (Math.floor(Math.random() * 8) + 6) ;
				System.out.println("Your car took : " + damage + " damage");
				this.setCondition(this.getCondition() - damage);

			
		}
			
			System.out.println("condition of vehicle is: " + this.getCondition());
			System.out.println();
			System.out.println("After that mess you run into");
			System.out.println();
		}
	}

}