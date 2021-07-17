package com.technoelevate.ClassConcept;

public class Main {

	public static void main(String[] args) {
		Car bmw= new Car();
		Car audi= new Car();
		bmw.setModel("GTX");
		System.out.println(bmw.getModel());
		audi.setModel("AudiS");
		System.out.println(audi.getModel());
		audi.setBrand("Audi");
		
	}

}
