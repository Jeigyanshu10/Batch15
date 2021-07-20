package com.technoelevate.ExceptionHandlingConcept;

public class Accounts {

	private double balance;

	public Accounts(double balance) {	
		this.balance = balance;
	}
	InsufficientBalanceException ibe = new InsufficientBalanceException("Insuficient balance in Jeigyanshu's account ");
	public double deduction(double amount){
		
		if(amount>this.balance) {
			throw ibe;
		}
		
		return balance;
	}
}
