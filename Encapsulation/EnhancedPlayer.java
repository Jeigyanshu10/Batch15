package com.technoelevate.Encapsulation;

public class EnhancedPlayer {
	
	private String fullName;
	private int health=100;
	private String weapon;
	
	public EnhancedPlayer(String name, int health, String weapon) {
		this.fullName = name;
		if(health>0 && health<=100) {
			this.health = health;
		}
		
		this.weapon = weapon;
	}
	
	public void looseHeath(int damage) {
		this.health-=damage;
		System.out.println(this.fullName+"'s Remaining health : "+this.health);
		if(this.health<=0) {
			System.out.println(this.fullName+" got knocked out");
		}
	}
	
	
	public void gainHealth(int numberMediCare) {
		
	}
	

	public String getName() {
		return fullName;
	}

	public int getHealth() {
		return health;
	}

	public String getWeapon() {
		return weapon;
	}
	
	
	
	

}
