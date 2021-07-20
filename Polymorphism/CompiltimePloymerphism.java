package com.technoelevate.Polymorphism;

public class CompiltimePloymerphism {

	public static void main(String[] args) {
		CompiltimePloymerphism ctp = new CompiltimePloymerphism();
		System.out.println(ctp.multiply(2, 3));
		System.out.println(ctp.multiply(4, 5,6));

	}
	
	public int multiply(int i, int j) {
		return i*j;
	}
	
	public int multiply(int i, int j,int k) {
		return i*j*k;
	}

}
