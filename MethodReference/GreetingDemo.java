package com.technelevate.Java8Features.MethodReference;

public class GreetingDemo {

	public static String wish(String name) {
		return "Good Evening, "+name;
	}
	public static String wish() {
		return "Hello";
	}
	
	public static void main(String[] args) {
		Greetings greet = GreetingDemo::wish;
		System.out.println(greet.ask("Soujanya"));
		
	}

}
