package com.coforge.day4.assignment;

public class OnlineShoppingCartApp {

	public static void main(String[] args) {
		Customer harshika = new Customer(101, "Harshika");

		Product laptop = new Product(1, "Laptop", 75000);
		Product headphone = new Product(2, "Headphones", 3000);
		Product mouse = new Product(3, "Mouse", 1500);

		harshika.cart.addProduct(laptop);
		harshika.cart.addProduct(headphone);
		harshika.cart.addProduct(mouse);

		harshika.cart.removeProduct(2);
		harshika.cart.calculateTotal();

	}

}
