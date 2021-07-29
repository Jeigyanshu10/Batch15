package com.technelevate.Java8Features.LambdaExpressionDemo.CretaingThreads;

public class CreatingThreadUsingLambda {

	public static void main(String[] args) {

		//Without LambdaExpression:
		Runnable run1= new Runnable(){

			@Override
			public void run() {
				for(int i=0;i<10;i++) {
					System.out.println("Running Thread 1, sequence: "+i);
					try{
						Thread.sleep(1000);
					}catch(InterruptedException e) {
						e.printStackTrace();
					}
				}		
			}
		};
		Thread t1 = new Thread(run1);
		t1.start();
		
		
		//With LambdaExpression:
		Runnable run2=()->{
			System.out.println("Running Thread 2");
		};
		
		Thread t2= new Thread(run2);
		t2.start();
		
		Runnable mt = new MyThread();
		Thread t3 = new Thread(mt);
		t3.start();
		
		
	}

}
