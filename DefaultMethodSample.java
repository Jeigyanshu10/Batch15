package com.technelevate.Java8Features;

public interface DefaultMethodSample {
	void multiply();
	
	  default int addition(int i, int j) {
		  return i-j; 
		  }
	 
}
