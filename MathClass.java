package com.technelevate.Java8Features;

public class MathClass extends MiddleMan implements DefaultMethodDemo,DefaultMethodSample {

	public static void main(String[] args) {
		
MathClass m = new MathClass();
System.out.println(m.add(1, 2));

	}

	@Override
	public void multiply() {
		System.out.println("this is multiply method");
		
	}

	
	

}
