package com.technelevate.Java8Features.LambdaExpressionDemo;
import java.util.*;
public class ForEachUsingLambdaExpression {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add("Apple");
		al.add("Oranges");
		al.add("Mangoes");
		al.add("Grapes");
		
		al.forEach(fruit->System.out.println(fruit));

	}

}
