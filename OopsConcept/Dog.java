package com.technoelevate.OopsConcept;

public class Dog extends Animal{

	private int eyes;
	private int legs;
	private int tail;
	private String coat;
	
	public Dog(String name, int size, int weight, int eyes,int legs,int tail,String coat) {
		super(name, 1,1, size, weight);
		this.eyes=eyes;
		this.legs=legs;
		this.tail=tail;
		this.coat=coat;
	}

	public void chew() {
		System.out.println("dog.chew() called");
	}
	
	public void eat() {
		chew();
		super.eat();
	}

	public void walk() {
		System.out.println("Dog.walk() called");
		move(5);
	}
	
	public void run() {
		System.out.println("Dog.run() called");
		super.move(25);
	}
	
	public void move(int speed) {
		System.out.println("Dog.move() called. dog moving at a speed of : "+speed);
	}
	
}
