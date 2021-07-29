package com.technelevate.Java8Features;

import java.util.Arrays;
import java.util.*;
public class Main implements MyInterface, MySecInterface{

	public static void main(String[] args) {
		List l1=new ArrayList();
		l1.add("Jeigyanshu");
		l1.add("Anshu");
		l1.add("Jiggy");
		l1.forEach(names->System.out.println(names));
	}

	@Override
	public void add() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		MyInterface.super.show();
	}
	
	

}
