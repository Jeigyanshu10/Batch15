package com.technelevate.Java8Features.AnonymousClassConcept;

public class Main {

	public static void main(String[] args) {
		//MyClass obj = new MyClass();
		AgeClass obj1 = new AgeClass(){
			@Override
			public void getAge() {
				System.out.println("My Age is "+x);
			}
		};
obj1.getAge();
	}

}
