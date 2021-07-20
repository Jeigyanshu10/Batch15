package com.technoelevate.ExceptionHandlingConcept;

public class InsufficientBalanceException extends RuntimeException{

	public InsufficientBalanceException(String message) {
		super(message);	
	}	
}
