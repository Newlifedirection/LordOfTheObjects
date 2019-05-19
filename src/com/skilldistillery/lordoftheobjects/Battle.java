package com.skilldistillery.lordoftheobjects;

public class Battle {

	String[] task = {
			" A pack of zoo animals are blocking the road. They are throwing poop everywhere. " + " What will you do? ",
			" Godzilla has started a fire in the middle of the road and is dancing what will you do? ",
			" The Avengers are fighting Thanos. There are lasers, rocks, buildings, dead aliens, body parts, and debris "
					+ " flying everywhere. What will you do? ",
			" Snap! You are suddenly disoriented, your car spinning out of control "
					 };

	public String[] getObstacle() {
		return task;
	}

	public void setObstacle(String[] obstacle) {
		task = obstacle;
	}

	public String obstacle() {
		int random = (int) Math.floor(Math.random() * task.length - 1);
		
		return task[random];
	}
}
