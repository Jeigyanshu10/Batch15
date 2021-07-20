package com.technoelevate.Coupling.LoseCoupling;

public class Person {

	public static void main(String[] args) {
			
		Transport transportation1= new Bus();
		Transport transportation2= new Train();
		Transport transportation3 = new Flight();
		
		Travel travel = new Travel(transportation3);
		travel.go();
	}

}
