package com.technoelevate.Constructors;

public class Account {
	
	private String accountNumber;
	private double balance;
	private String customerName;
	private String customerEmailAddress;
	private String customerPhoneNumber;
	
	public Account() {
		this("0000000",500.00,"Default","Default@email.com","default phone number");
		
	}
	
	
	public Account(String accountNumber,double balance,String customerName,String customerEmailAddress,String customerPhoneNumber){
		//System.out.println("Complete constructor called");
		this.accountNumber=accountNumber;
		this.balance=balance;
		this.customerName=customerName;
		this.customerEmailAddress=customerEmailAddress;
		this.customerPhoneNumber=customerPhoneNumber;
	}
	
	public Account(String customerName,String customerEmailAddress, String customerPhoneNumber) {				
		this("0000000",2000.00,customerName,customerEmailAddress,customerPhoneNumber);
	}
	
	
	public void deposite(double depositeAmount) {
		this.balance+=depositeAmount;
		System.out.println("Amount deposited: "+depositeAmount+". Updated balance in your account: "+this.balance);
	}
	
	public void withdraw(double withdrawalAmount) {
		if(this.balance<withdrawalAmount) {
			System.out.println("You have insuffiecent balance. Please try with less denomination than: "+this.balance);
		}else {
			this.balance-=withdrawalAmount;
			System.out.println("Withdrawl sucessful! Amount withdrawn : "+withdrawalAmount+". Updated balance: "+this.balance);
		}
		
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerEmailAddress() {
		return customerEmailAddress;
	}
	public void setCustomerEmailAddress(String customerEmailAddress) {
		this.customerEmailAddress = customerEmailAddress;
	}
	public String getCustomerPhoneNumber() {
		return customerPhoneNumber;
	}
	public void setCustomerPhoneNumber(String customerPhoneNumber) {
		this.customerPhoneNumber = customerPhoneNumber;
	}
	
	
}
