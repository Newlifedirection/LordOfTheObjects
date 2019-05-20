package com.skilldistillery.lordoftheobjects;

import java.util.Scanner;

public class Camry extends Vehicle {

	public Camry(int condition, String size, String advantage, String disadvantage) {
		super(condition, size, advantage, disadvantage);

		System.out.println(
				"The Camry comes with some great battle ready feature, including" + " ultimate urban camoflauge");
		System.out.println();
		System.out.println("The Camry is difficult to see receiving frequent damage");
		System.out.println();
		Vehicle camry = new Vehicle(8, "Medium", "Maliable", "Average");
		System.out.println(camry.getInfo2());

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
				System.out.println(
						"Oh no the animals saw your normal ordinary looking car and are enraged. they threw poop and rammed your car");
				int damage = (int) (Math.floor(Math.random() * 6) + 4) ;
				System.out.println("Your car took : " + damage + " damage");
				this.setCondition(this.getCondition() - damage);

			}
			if (decision == 2) {
				System.out.println("Oh no.. poop landed on your face right when you stuck your head out the window");
				int damage = (int) (Math.floor(Math.random() * 3) + 2) ;
				System.out.println("Your car took : " + damage + " damage");
				this.setCondition(this.getCondition() - damage);

			}
			if (decision == 3) {
				System.out.println("Hmm waiting seems to have worked the animals are leaving");
				System.out.println("Your car took : 0 damage");
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
				System.out.println("Wow you were unlucky Godzilla kicked a rock and it hit your trunk.");
				int damage = (int) (Math.floor(Math.random() * 5) + 3) ;
				System.out.println("Your car took : " + damage + " damage");
				this.setCondition(this.getCondition() - damage);

			}
			if (decision == 2) {
				System.out.println(
						"The car was too fat and Godzilla grazed your car making your car spin out and hitting a wall.");
				int damage = (int) (Math.floor(Math.random() * 6) + 4) ;
				this.setCondition(this.getCondition() - damage);

			}
			if (decision == 3) {
				System.out.println("Godzilla got tired from dancing and left");
				System.out.println("Your car took : 0 damage");
				this.setCondition(this.getCondition() - 0);

			}
			System.out.println("condition of vehicle is: " + this.getCondition());
			System.out.println();
			System.out.println("After that you drove down the road and make a left and encounter");
			System.out.println();

		}
		if (o == obstacle.getObstacle()[2]) {
			System.out.println("1. Drive through.");
			System.out.println("2. Take pictures.");
			System.out.println("3. Scream for help");
			int decision = kb.nextInt();

			if (decision == 1) {
				System.out.println("Are you an idiot? Your car was hit by a missle.");
				int damage = (int) (Math.floor(Math.random() * 6) + 4) ;
				this.setCondition(this.getCondition() - damage);

			}
			if (decision == 2) {
				System.out
						.println("The flash on your phone alerted an alien, the alien shoots your car and grazed it. ");
				int damage = (int) (Math.floor(Math.random() * 4) + 2) ;
				System.out.println("Your car took : " + damage + " damage");
				this.setCondition(this.getCondition() - 2);

			}
			if (decision == 3) {
				System.out.println("The avengers heard your cry and braught you to safety");
				System.out.println("Your car took : 0 damage");
				this.setCondition(this.getCondition() - 0);
			}
			System.out.println("condition of vehicle is: " + this.getCondition());
			System.out.println();
			System.out.println("After that mess you run into");
			System.out.println();
		}
	}
}
