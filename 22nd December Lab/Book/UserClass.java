package com.Book.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="book_details")
public class UserClass {
	@Id
	private long bookId;
	private String bookName,author;
	private double price;
}
