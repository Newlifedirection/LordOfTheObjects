package com.skilldistillery.lordoftheobjects;

import java.util.Scanner;

public class Humvee extends Vehicle {

	public Humvee(int condition, String size, String advantage, String disadvantage) {
		super(condition, size, advantage, disadvantage);

		System.out.println("The Humvee comes with some great battle ready feature, including"
				+ " fire proof armor and a large fuel tank");
		System.out.println();
		System.out.println("The Humvee is large receiving frequent damage, on small roads");
		System.out.println();

		Vehicle humvee = new Vehicle(10, "Large", "Durable", "Damage prone");
		System.out.println(humvee.getInfo1());

	}

	public void comfrontObstacle(Scanner kb) {
		Battle obstacle = new Battle();
		String o = obstacle.obstacle();
		System.out.println(o);
		System.out.println();

		if (o == obstacle.getObstacle()[0]) {
			System.out.println("1. Drive through the horde of poop animals.");
			System.out.println("2. Stick your head out the window and scream at the animals to get out of the way.");
			System.out.println("3. Wait for the animals to move.");
			int decision = kb.nextInt();

			if (decision == 1) {
				System.out.println("Oh no the tires slipped on poop and you hit a wall");
				int damage = (int) (Math.floor(Math.random() * 6) + 4) ;
				this.setCondition(this.getCondition() - damage);

			}
			if (decision == 2) {
				System.out.println("Oh no.. poop landed on your face right when you stuck your head out the window");
				int damage = (int) (Math.floor(Math.random() * 2) + 1) ;
				this.setCondition(this.getCondition() - damage);

			}
			if (decision == 3) {
				System.out.println("You drive past undamaged, continue on");
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
				System.out.println("Wow you were lucky Godzilla was to busy dancing and didn't notice you.");
				System.out.println("Your car took : 0 damage");
				this.setCondition(this.getCondition() - 0);

			}
			if (decision == 2) {
				System.out.println(
						"The car was too fat and Godzilla grazed your car making your car spin out and hitting a wall.");
				int damage = (int) (Math.floor(Math.random() * 6) + 4) ;
				System.out.println("Your car took : " + damage + " damage");
				this.setCondition(this.getCondition() - damage);

			}
			if (decision == 3) {
				System.out.println("Godzilla dancing made your car flip a cpuple of times");
				int damage = (int) (Math.floor(Math.random() * 3) + 2) ;
				System.out.println("Your car took : " + damage + " damage");
				this.setCondition(this.getCondition() - damage);

			}
			System.out.println("condition of vehicle is: " + this.getCondition());
			System.out.println();
			System.out.println("After that you drove down the road and make a left and encounter");
			System.out.println();

		}
		if (o == obstacle.getObstacle()[2]) {
			System.out.println("1: Thor battles Thanos, throwing his hammer");
			System.out.println("2: The Hulk throws a car in you path narrowly missing you");
			System.out.println("3: Iron man is thrown, sliding across the payment, stopping at your bumper");
			int decision = kb.nextInt();

			if (decision == 1) {
				System.out.println(
						"That was close, the hammer smashes through your back window landing in the back seat");
				int damage = (int) (Math.floor(Math.random() * 4) + 2) ;
				System.out.println("Your car took : " + damage + " damage");
				this.setCondition(this.getCondition() - damage);

			}
			if (decision == 2) {
				System.out.println("You didn't stop fast enough and crash into a near by upside down car");
				int damage = (int) (Math.floor(Math.random() * 4) + 2) ;
				System.out.println("Your car took : " + damage + " damage");
				this.setCondition(this.getCondition() - damage);

			}
			if(decision == 3) {
				System.out.println("Iron man didn't see you inside and threw you.");
				int damage = (int) (Math.floor(Math.random() * 6) + 4) ;
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
