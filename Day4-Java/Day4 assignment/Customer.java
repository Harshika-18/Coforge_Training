package com.coforge.day4.assignment;

public class Customer {
	int id;
	String name;
	Cart cart = new Cart();

	public Customer(int id, String name) {
		this.id = id;
		this.name = name;
	}

}
