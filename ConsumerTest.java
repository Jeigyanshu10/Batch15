package com.technelevate.Java8Features;

import java.util.*;
import java.util.function.Consumer;

public class ConsumerTest {

	public static void main(String[] args) {
	List<String> l=	Arrays.asList("apple","mangoes","oranges");
	
	
	l.forEach(s ->System.out.println(s));

	}

}
