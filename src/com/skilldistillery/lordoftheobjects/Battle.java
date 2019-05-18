package com.skilldistillery.lordoftheobjects;

public class Battle {

		String[] obstacle = { "A pack of zoo animals are blocking the road. They are throwing poop everywhere."
				+ "What will you do?", 
				"Godzilla has started a fire in the middle of the road. Godzilla is also dancing what will you do?", 
				"The avengers are fighting Thanos. There is lasers, rocks, buildings, dead aliens, body parts, and debris "
				+ "are flying everywhere. what will you do?",
				"Snap! You are suddenly disoriented, your car spinning out of control " 
				+ " The turn you made has safely teleported home, You Win!" };

		public String[] getObstacle() {
			return obstacle;
		}

		public void setObstacle(String[] obstacle) {
			this.obstacle = obstacle;
		}

		public String obstacle() {

			int x = (int) (Math.random() * 3);
			x = 0;

			return obstacle[x];
			 
			
					
		}
	}
