package com.technelevate.Java8Features.LambdaExpressionDemo;

public class Geetings {

	public static void main(String[] args) {
		GreetingInterFace gi = (name)->{
			
			String str1="Good Morning !";
			String str2=name;
			String str3="! How are you today?";
			return str1+str2+str3;
		};

	System.out.println(gi.greet("Anshu"));
	}

}
