package com.technelevate.Java8Features.LambdaExpressionDemo;

public class AddableMain {

	public static void main(String[] args) {
		Addable result = (a,b)->{return (a+b);};
		
		System.out.println(result.add(2, 3));

	}

}
