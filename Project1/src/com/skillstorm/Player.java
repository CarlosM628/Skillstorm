package com.skillstorm;

public class Player {
	String name;
	int healthPoints;
	int christmasPower;
	

	public Player(String name, int healthPoints, int christmasPower) {
		this.name = name;
		this.healthPoints = healthPoints;
		this.christmasPower = christmasPower;
		
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getHealthPoints() {
		return healthPoints;
	}


	public void setHealthPoints(int healthPoints) {
		this.healthPoints = healthPoints;
	}


	public int getChristmasPower() {
		return christmasPower;
	}


	public void setChristmasPower(int christmasPower) {
		this.christmasPower = christmasPower;
	}
}
