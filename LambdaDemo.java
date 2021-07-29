package com.technelevate.Java8Features;

public class LambdaDemo {
	
	public static void main(String[] args) {
//	Runnable runnable= ()->{System.out.println("App Started"+Thread.currentThread().getClass());};
//
//for(int i=0;i<10;i++) {
//	System.out.println(i);
//}
//try {
//	Thread.sleep(1000);
//}catch(InterruptedException e) {
//	e.printStackTrace();
//}
		
		MyRunnable mr = new MyRunnable();
		Thread t1= new Thread(mr);
		t1.start();

Runnable runnable2 = () -> {
	System.out.println("App started " + Thread.currentThread().getName());
	for(char ch = 'a'; ch<='z'; ch++) {
		System.out.println(ch);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
};
//Thread t = new Thread(runnable);
Thread t2 = new Thread(runnable2);
//t.start();
t2.start();
}
}
