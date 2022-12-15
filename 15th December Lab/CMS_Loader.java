package com.cms;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;
import java.util.regex.Pattern;
import com.bms.Helper;
//creating custom exception for duplicate password 
class DuplicatePasswordException extends Exception{
	DuplicatePasswordException(String str){
		super(str);
	}
}
//this class contains all the crud operation methods
public class CMS_Loader {
	//creating instance variables and scanner object for taking input 
	static Scanner sc= new Scanner(System.in);
	static long reg_id;
	static String password;
	//this method creates a new account for user
	public static void register() throws Exception {
		Connection conn=Helper.con();//creating connection with the MySQL database using helper class
		Statement stmt=conn.createStatement();//creating statement to execute quaries
		reg_id=new Random().longs(10000000,99999999).findFirst().getAsLong();//generating 8 digit random number as registration id using Random class
		ResultSet rs1=stmt.executeQuery("select reg_id from register where reg_id="+reg_id);//checking if the id is already present in the database
		while(rs1.next()) {
			reg_id=new Random().longs(10000000,99999999).findFirst().getAsLong();//if its already present then creating another id
		}
		System.out.println("Welcome to ABC College");
		System.out.println("Please create a password for your new profile"
				+ "\n(Note : you must follow these rules while creating the password : "
				+ "\nIt should be six characters."
				+ "\nIt should contain at least one digit."
				+ "\nIt should contain at least one upper case alphabet."
				+ "\nIt should contain at least one lower case alphabet."
				+ "\nIt should contain at least one special character."
				+ "\nIt shouldn't contain any white space.)");
		password=sc.next();//taking password input
		while(!Pattern.matches("^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{6}$", password)) {//checking if the password matches the conditions 
			System.out.println("Your password doesn't match the validations."
					+"\n Try again : ");
			password=sc.next();//if the conditions are not matched then input again
		}
		System.out.println("Re-enter the password to confirm : ");
		String confirmPassword=sc.next();//condfirming password
		while(!password.equals(confirmPassword)) {//checking if the re entered password is same as the previous one
			System.out.println("Passwords doesn't match."
					+ "\nTry again : ");
			confirmPassword=sc.next();
		}
		rs1=stmt.executeQuery("select password from register where password='"+password+"'");//checking if the password is already present in the database
		if(rs1.next()) {
			throw new DuplicatePasswordException("Duplicate Password not allowed.");//if its already present throwing DuplicatePasswordException
		}else {
			PreparedStatement pstmt=conn.prepareStatement("insert into register values(?,?)");//storing datas using preparedstatement 
			pstmt.setLong(1, reg_id);pstmt.setString(2, confirmPassword);
			pstmt.executeUpdate();
			System.out.println("Account created successfully..."
					+ "\nThis is your Registration Id : "+reg_id
					+"\nKeep it safe.It will be needed while logging into your account.");
		}
	}
	
}
