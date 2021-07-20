package com.technoelevate.ExceptionHandlingConcept;

public class ThrowsConcept {

	public static void main(String[] args) {
	
		doStuff();
	}
	public static void doStuff(){
		doMoreStuff();
	}
	public static void doMoreStuff() {
		
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
}
