package com.technelevate.Java8Features;

@FunctionalInterface
public interface Test {

	void add();
	default void print() {
		System.out.println("Hello");
	}
	
	static void newPrint() {
		System.out.println("hi");
	}
	
}
