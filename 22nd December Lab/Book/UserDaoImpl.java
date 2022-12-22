package com.Book.daoimpl;

import java.util.Scanner;
import org.hibernate.Session;
import org.hibernate.Transaction;
import com.Book.dao.UserDao;
import com.Book.entity.UserClass;
import com.Book.util.UserUtil;

public class UserDaoImpl implements UserDao{
	long bookId;
	String bookName,author;
	double price;
	Scanner sc=new Scanner(System.in);
	public void addUser() {
		Session s=UserUtil.getSessionFactory().openSession();
		Transaction t=s.beginTransaction();
		System.out.println("Enter Book Id : ");
		bookId=sc.nextLong();
		System.out.println("Enter Book Name :");
		bookName=sc.next();
		System.out.println("Enter Book Author :");
		author=sc.next();
		System.out.println("Enter Price :");
		price=sc.nextDouble();
		UserClass u=new UserClass();
		u.setBookId(bookId);
		u.setBookName(bookName);
		u.setAuthor(author);
		u.setPrice(price);
		s.save(u);
		t.commit();
		System.out.println("Details inserted successfully...");
		s.close();
	}
	public void readUser() {
		Session s=UserUtil.getSessionFactory().openSession();
		System.out.println("Enter Book Id :");
		bookId=sc.nextLong();
		UserClass u=s.get(UserClass.class,bookId);
		System.out.println("Book Id : "+u.getBookId()+"\nName : "+u.getBookName()
		+"\nAuthor : "+u.getAuthor()+"\nPrice : "+u.getPrice());
		s.close();
	}
}
