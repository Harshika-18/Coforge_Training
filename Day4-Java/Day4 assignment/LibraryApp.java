package com.coforge.day4.assignment;

public class LibraryApp {

	public static void main(String[] args) {
        Library library = new Library(5);

        Book b1 = new Book(1, "1984", "George Orwell");
        Book b2 = new Book(2, "The Hobbit", "J.R.R. Tolkien");

        library.addBook(b1);
        library.addBook(b2);

        Member m1 = new Member(101, "Alice");

        library.issueBook(1, m1);   
        library.issueBook(1, m1);  
        
        library.searchBook("The Hobbit");   
        library.searchBook("Unknown");     

        library.returnBook(1);   
        library.returnBook(1);   
	}

}
