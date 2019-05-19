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
		}

		if (o == obstacle.getObstacle()[1]) {
			System.out.println("1: Drive under Godzilla Dancing.");
			System.out.println("2: Drive around Godzilla Dancing.");
			System.out.println("3: Wait for Godzilla to leave.");
			int decision = kb.nextInt();

			if (decision == 1) {
				System.out.println("Godzilla saw your ugly car and stomped on you.");
				this.setCondition(this.getCondition() - 10);

			}
			if (decision == 2) {
				System.out.println(
						"Godzilla thaught a cockroach ran passed his foot and ran away.");
				this.setCondition(this.getCondition() - 0);

			}
			if (decision == 3) {
				System.out.println("Before Godzilla got tired from dancing your car exhaust fell off.");
				this.setCondition(this.getCondition() - 1);

			}

		}
		
		if ( o == obstacle.getObstacle()[2]) {
			System.out.println("1. Drive through.");
			System.out.println("2. Scream for help");
			System.out.println("3. Help.");
			int decision = kb.nextInt();

			if (decision == 1) {
				System.out.println("Your car blended in with the destruction and no one noticed you.");
				this.setCondition(this.getCondition() - 0);

			}
			if (decision == 2) {
				System.out
						.println(" You alerted more monsters and the avengers lost the fight.");
				this.setCondition(this.getCondition() - 10);

			}
			if (decision == 3) {
				System.out.println("You jumped out of your moving car, when the car hit thanos it exploded."
						+ "But an alien came up behind you and stabbed you.");
				this.setCondition(this.getCondition() - 10);

			
		}
			System.out.println(this.getCondition());
		}
	}

}