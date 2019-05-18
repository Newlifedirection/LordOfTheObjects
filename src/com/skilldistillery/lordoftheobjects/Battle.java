package com.skilldistillery.lordoftheobjects;

public class Battle {

		String[] obstacle = { "A pack of zoo animals are blocking the road. They are throwing poop everywhere."
				+ "What will you do?", 
				"Godzilla has started a fire in the middle of the road. Godzilla is also dancing what will you do?", 
				"The avengers are fighting Thanos. There is lasers, rocks, buildings, dead aliens, body parts, and debris "
				+ "are flying everywhere. what will you do?",
				"Ah-oh you made a wrong turn there is , ", "teleport" };

		public String obstacle() {

			int x = (int) (Math.random() * 4);

			return obstacle[x];
			 
			
					
		}
	}
