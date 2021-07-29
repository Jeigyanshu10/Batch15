package com.technelevate.Java8Features.LambdaExpressionDemo.CretaingThreads;

public class MyThread implements Runnable{

	
	void running() {
		System.out.println("My running thread");	
		}
	
	
	@Override
	public void run() {
	System.out.println("MyThread");
		
	}
	
	
	

}
