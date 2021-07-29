package com.technelevate.Java8Features.MethodReference;

public class NonStaticMethodReference {

	public String wish(String name) {
		return "Good Evening, "+name;
	}
	
	public static void main(String[] args) {
		
		NonStaticMethodReference nmr = new NonStaticMethodReference();
		Greetings greet = nmr::wish;
		
		System.out.println(greet.ask("Mandar"));
	}

}
