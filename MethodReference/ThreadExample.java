package com.technelevate.Java8Features.MethodReference;

import java.util.function.BiFunction;

public class ThreadExample {

	public static void myThread() {
		System.out.println("Thread running");
	}
	
	public static void main(String[] args) {
	
		Runnable run = ThreadExample::myThread;
		Thread t = new Thread(run);
		t.start();
	}
	

}
