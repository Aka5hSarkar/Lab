package com.bookutil;
import java.util.Scanner;

import com.book.Book;
import com.book.BookStore;

public class BookUtil {

	public static void main(String[] args) {
		// creating BookStore objects
				BookStore bstore = new BookStore();
				//adding datas
				bstore.addBook(new Book("B001", "MySQL", "Akash", "DBMS", 250));
				bstore.addBook(new Book("B002", "java", "Arnab", "Programming", 520));
				bstore.addBook(new Book("B003", "JDBC", "Dev", "Programming", 430));
				//searching by authors name
				bstore.searchByAuthor("Akash");
				//searching by title name
				bstore.searchByTitle("Java");
				//displaying data
				bstore.displayAll();
			}
		}