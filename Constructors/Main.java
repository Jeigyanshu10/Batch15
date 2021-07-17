package com.technoelevate.Constructors;

public class Main {

	public static void main(String[] args) {
		
	
		Account shabanAccount = new Account();
		shabanAccount.setAccountNumber("123457890");
		shabanAccount.setBalance(1000.0);
		shabanAccount.setCustomerEmailAddress("shaban.modh@ceo.com");
		shabanAccount.setCustomerPhoneNumber("7827342392");
		shabanAccount.setCustomerName("Shaban");
		
		
		Account snehaAccount = new Account("11000000",50000.0,"Sneha S","sneha.email@address.com","9999999999");
		
		Account pawanAccount = new Account("Pawan","pawan@kalyan.com","4567890353");
		
		System.out.println(pawanAccount.getBalance());
		pawanAccount.withdraw(3000.00);
		pawanAccount.deposite(50000.00);
		pawanAccount.withdraw(3000.00);
		pawanAccount.deposite(10000.00);

		

	}

}
