package com.coforge.day3;

public class Product {
	
	private int ProductId;
	private String name;
	private int price;
	private int quantity;
	
	public int calculateTotalAmount() {
		return price*quantity;
	}
	public void displayBill() {
		int total = calculateTotalAmount();
		System.out.println("Bill is " + total);
	}

}
