package com.technelevate.Java8Features.LambdaExpressionDemo;

public class LambdaExpressionWithArg {
	
	public static void main(String[] args) {		
		
		//Lambda Expression version
		Trainer t = (name)->{return name;};
		System.out.println(t.trainerName("Anshu"));
	}

}
