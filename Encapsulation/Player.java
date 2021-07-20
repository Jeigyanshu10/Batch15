package com.technoelevate.Encapsulation;

public class Player {

	public String fullName;
	public int health;
	public String weapon;
	
	public void looseHeath(int damage) {
		this.health-=damage;
		System.out.println(this.fullName+"'s Remaining health : "+this.health);
		if(this.health<=0) {
			System.out.println(this.fullName+" got knocked out");
		}
		
	}
	
	
}
