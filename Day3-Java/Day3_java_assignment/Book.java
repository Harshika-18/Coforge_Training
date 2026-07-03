package com.coforge.day3;

public class Book {
	
	private int BookId;
	private String title;
	private String author;
	private int price;
	
	public void displayDetails() {
		System.out.println("Book Id is : " + BookId);
		System.out.println("Title is : " + title);
		System.out.println("Author is : " + author);
		System.out.println("Price is : " + price);
	}

}
