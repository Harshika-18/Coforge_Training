package com.coforge.day4.assignment;

public class Library {
	Book[] books;
	int noOfBooks;
	
	public Library(int capacity) {
		books = new Book[capacity];
	}
	
	void addBook(Book book) {
		if(noOfBooks<books.length) {
			books[noOfBooks]=book;
			noOfBooks++;
		}
		else {
			System.out.println("Library is full.");
		}
	}
	
	void issueBook(int bookId, Member member) {
		for(int i=0;i< noOfBooks;i++) {
			if(books[i].id==bookId && !books[i].isIssued ) {
				books[i].isIssued=true;
				System.out.println(books[i].title + " issued to " + member.name);
				return;
			}
		}
		System.out.println("Book not Available");
	}
	
    void returnBook(int bookId) {
        for (int i = 0; i < noOfBooks; i++) {
            if (books[i].id == bookId && books[i].isIssued) {
                books[i].isIssued = false;
                System.out.println(books[i].title + " returned.");
                return;
            }
        }
    }

    void searchBook(String title) {
        for (int i = 0; i < noOfBooks; i++) {
            if (books[i].title.equalsIgnoreCase(title)) {
                System.out.println("Book Found: " + books[i].title);
                return;
            }
        }
        System.out.println("Book not found.");
    }
}	