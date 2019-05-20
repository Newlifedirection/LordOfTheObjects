package com.skilldistillery.lordoftheobjects;

public class Battle {

	String[] task = {
			" A pack of zoo animals are blocking the road. They are throwing poop everywhere. " + " What will you do? ",
			" Godzilla has started a fire in the middle of the road and is dancing what will you do? ",
			" The Avengers are fighting Thanos. There are lasers, rocks, buildings, dead aliens, body parts, and debris "
					+ " flying everywhere. What will you do? ", };

	public String[] getObstacle() {
		return task;
	}

	public void setObstacle(String[] obstacle) {
		task = obstacle;
	}

	public String obstacle() {
		int random = (int) Math.floor(Math.random() * task.length);
		int newrandom = random;
		System.out.println(random);
		while (newrandom == random) {
			random = (int) Math.floor(Math.random() * task.length);
		}

		return task[newrandom];

//		String picked = "";
////			String i = Math.floor(Math.random() * obstacle.length);
////			System.out.println(obstacle)[i];
//		String obstaclePicked = "";
//
//		int x;
//		do {
//			x = 0;
//			x = (int) (Math.random() * 2);
//			System.out.println( "this is" + x);
//			obstaclePicked = task[x];
//		} while (picked.contains("" + x));
//		picked += x;
//		
//		return obstaclePicked;
	}
}
