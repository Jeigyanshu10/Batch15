package com.technelevate.Java8Features.AnonymousClassConcept;

public class SingerMain {

	public static void main(String[] args) {		
//		Singer singer1= new SingerName();
//		singer1.getSingerName();
		
		Singer singer2 = new Singer(){
			public void getSingerName() {
				System.out.println("Shourya");
			}
			public void getSong() {
				System.out.println("Super sub");
			}
		};			
		
		//singer2.getSingerName();
		singer2.getSong();
		
	}

}
