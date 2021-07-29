package com.technelevate.Java8Features.LambdaExpressionDemo;

public class LambdaExpressionDemo {

	public static void main(String[] args) {

		int width = 30;
		
		Drawable d= ()->{
			System.out.println("Drawaing at "+width);
		};
		d.draw();
		}

	}
