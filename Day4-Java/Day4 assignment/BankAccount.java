package com.coforge.day4.assignment;

public class BankAccount {
	private int accountNumber;
	private int balance;
	
	public void deposit(int money) {
		balance = balance + money;
		System.out.println(money + " Deposited");
	}
	public void withdraw(int money) {
		balance = balance - money;
		System.out.println(money + " Withdrawed");
		
	}
	public void checkBalance() {
		System.out.println("Balance : " + balance);
	}
}
