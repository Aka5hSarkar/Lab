//1
package com.book;
//creating custom exception class
class InvalidBookException extends Exception {
	public InvalidBookException(String s) {
		super(s);
	}
}
public class Book {
	private String bookId;
	private String title;
	private String author;
	private String category;
	private float price;
	// Declaring parameterized constructor
	public Book(String bookId, String title, String author, String category, float price) {
		super();
		this.bookId = bookId;
		this.title = title;
		this.author = author;
		this.category = category;
		this.price = price;
	}
	// creating getters and setters getters and setters for storing and fetching the data
	public String getBookId() {
		return bookId;
	}
	public String getTitle() {
		return title;
	}
	public String getAuthor() {
		return author;
	}
	public String getCategory() {
		return category;
	}

	public float getPrice() {
		return price;
	}

	//method for validation of exception scenarios	
	public boolean validation() throws Exception {
		if(category == "Science" || category == "Fiction" || category == "Technology" || category == "Others" && price > 0 &&
				bookId.startsWith("B") && bookId.length() <= 4) {
			return true;
		} else {
			
			throw new InvalidBookException("Invalid Data...");
		}
		
	}
	
}
