package com.coforge.day4.assignment;

public class BankAccountApp {

	public static void main(String[] args) {
		BankAccount bankAccount = new BankAccount();
		
		bankAccount.deposit(2000);
		bankAccount.withdraw(500);
		bankAccount.checkBalance();

	}

}
