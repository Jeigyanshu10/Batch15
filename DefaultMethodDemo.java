package com.technelevate.Java8Features;

public interface DefaultMethodDemo {

	
	void multiply();//unitil 1.7
	default int add(int i, int j) {
		return i+j;
	}
}
