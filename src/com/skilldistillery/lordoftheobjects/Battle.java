package com.skilldistillery.lordoftheobjects;

public class Battle {

		String[] obstacle = { " A pack of zoo animals are blocking the road. They are throwing poop everywhere. "
				+ " What will you do? ", 
				" Godzilla has started a fire in the middle of the road and is dancing what will you do? ", 
				" The Avengers are fighting Thanos. There are lasers, rocks, buildings, dead aliens, body parts, and debris "
				+ " flying everywhere. What will you do? ",
				" Snap! You are suddenly disoriented, your car spinning out of control " 
				+ " The turn you made has safely teleported home, You Win!" };
		
		String picked = "";

		public String[] getObstacle() {
			return obstacle;
		}

		public void setObstacle(String[] obstacle) {
			this.obstacle = obstacle;
		}

		public String obstacle() {

			int x = -1;
			do{
				x = (int) (Math.random() * 3);
				
			}
			while(picked.contains("" + x));
			picked += x;
			x = 0;

			return obstacle[x];
			 
			
					
		}
	}
