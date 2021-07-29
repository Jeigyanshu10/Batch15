package com.technelevate.Java8Features;

public interface MyInterface {
	
	public void add();
	default void show() {
		
	}
	
	static void get() {
		System.out.println("Hello");
	}

}
