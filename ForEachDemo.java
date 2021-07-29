package com.technelevate.Java8Features;

import java.util.*;

public class ForEachDemo {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add("Apple");
		al.add("Orange");
		al.add("Kiwi");
		al.add("Mangoes");
		al.add("Guava");
		al.add("Pine Apple");
		
//		Iterator itr = al.iterator();
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}
		
		for (Object fruit : al) {
			System.out.println(fruit);
			
		}
		
		al.forEach (fruits->System.out.println(fruits));

	}

}
