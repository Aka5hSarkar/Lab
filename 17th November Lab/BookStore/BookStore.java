package com.book;
import java.util.ArrayList;

public class BookStore {
	// Creating array list of type Book
	 ArrayList<Book> bookList = new ArrayList<>();

	//method to add books to the array list
	public void addBook(Book b) {
			bookList.add(b);
	}
	// method to search books by title
	public void searchByTitle(String title) {
		if(bookList.stream().anyMatch(b->{return title.equalsIgnoreCase(b.getTitle());})) {
			System.out.println(bookList);
		} else {
			System.out.println("Title not found!");
		}
	}
// method to search books by author name
public void searchByAuthor(String author) {
	if(bookList.stream().anyMatch(b->{return author.equalsIgnoreCase(b.getAuthor());})) {
		System.out.println(bookList);
	} else {
		System.out.println("Author not found!");
	}	
}
// method to print all book details
public void displayAll() {
	for(Book b : bookList) {
		System.out.println("Book-Id:- " + b.getBookId() + " Title:- " + b.getTitle() + " Author:- " + b.getAuthor()
		+ " Category:- " + b.getCategory() + " Price:- " + b.getPrice());
	}
}
}