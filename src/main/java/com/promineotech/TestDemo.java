package com.promineotech;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class TestDemo {

	public int addPositive(int a, int b) {
	if(a > 0 && b > 0) {
		return a + b;
	} else {
		throw new IllegalArgumentException("Both parameters must be positive!");
	}
	}
	
	
	//this method is to check to see if an input is in a particular list
	List<String> baseballTeamNames = Arrays.asList("Rays", "Orioles", "Red Sox",
			"Yankees", "Blue Jays", "Guardians", "Twins", "Tigers", "White Sox",
			"Royals", "Astros", "Rangers", "Mariners", "Angels", "Athletics",
			"Braves", "Mets", "Phillies", "Marlins", "Nationals", "Brewers", "Reds",
			"Cubs", "Pirates", "Cardinals", "Dodgers", "Diamondbacks", "Padres", "Giants", "Rockies");
	
	
	public String isThisABaseballTeam(String teamName) {
		String result = " is a baseball team!";
		if(baseballTeamNames.contains(teamName)) {
			return teamName + result;
		} else {
			throw new IllegalArgumentException (teamName + " is not a baseball team");
		}
	
		
}
	int hipToBeSquared = getRandomInt();
	
	public int randomNumberSquared() {
		getRandomInt();
		return hipToBeSquared * hipToBeSquared;
		}


	int getRandomInt() {
		Random random = new Random();
		return random.nextInt(10) + 1;
	}
	
}
