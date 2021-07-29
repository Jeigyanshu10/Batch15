package com.technelevate.Java8Features.LambdaExpressionDemo;

public class AnonymousClassDemo {

	public static void main(String[] args) {
		int width = 10;
		
		//Without Labbda:
		
		Drawable dra = new Drawable() {
			public void draw() {
			System.out.println("Drawing at width: "+width);	
			}
		};
		dra.draw();
	}

}
