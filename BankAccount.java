package com.technoelevate.ExceptionHandlingConcept;

public class BankAccount {

	public static void main(String[] args) {
		Accounts anshuAccount = new Accounts(1000.00);
		anshuAccount.deduction(5000.00);
	}

}
