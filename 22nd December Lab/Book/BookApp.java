package com.Book;

import java.util.Scanner;

import com.Book.daoimpl.UserDaoImpl;

public class BookApp 
{
    public static void main( String[] args )
    {
        Scanner sc=new Scanner(System.in);
        UserDaoImpl ui=new UserDaoImpl();
        while(true) {
        	System.out.println("[1->Add New Book]\n[2->See Details]\n[0->Exit]");
        	int choice=sc.nextInt();
        	switch(choice) {
        	case 1:ui.addUser();break;
        	case 2:ui.readUser();break;
        	case 0:System.exit(0);break;
        	default:System.out.println("Invalid Choice :");
        	}
        }
    }
}
