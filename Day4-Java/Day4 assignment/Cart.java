package com.coforge.day4.assignment;

import java.util.ArrayList;

public class Cart {
	ArrayList<Product> products = new ArrayList<>();

    void addProduct(Product p) {
        products.add(p);
        System.out.println("Product " + p.name + " Added");
    }

    void removeProduct(int productId) {
        for (Product p : products) {
            if (p.id == productId) {
                products.remove(p);
                System.out.println("Product " + p.name + " Removed");
                return;
            }
        }
        System.out.println("Product not found in cart");
    }

    void calculateTotal() {
        int total = 0;
        for (Product p : products) {
            total += p.price;
        }
        System.out.println("The total is : " + total);
    }
}
