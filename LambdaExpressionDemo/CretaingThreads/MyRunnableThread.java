package com.technelevate.Java8Features.LambdaExpressionDemo.CretaingThreads;

public class MyRunnableThread {

	public static void main(String[] args) {	
		
		Runnable run = ()->{
			for(int i=0;i<10;i++) {
				System.out.println("My Thread 1, Sequence: "+i);
				try {
				Thread.sleep(1000);
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		
		Thread t = new Thread(run);
		t.start();

	}

}
