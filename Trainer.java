package com.technelevate.Java8Features;


@FunctionalInterface
public interface Trainer {
	
	void getTrainerName();
	default void getTraineeName(String name) {
		System.out.println(name);
	}

}
