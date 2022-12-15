package com.cms;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;
import java.util.regex.Pattern;
import com.bms.Helper;
class DuplicatePasswordException extends Exception{
	DuplicatePasswordException(String str){
		super(str);
	}
}
public class CMS_Loader {
	static Scanner sc= new Scanner(System.in);
	static long reg_id;
	static String password;
	public static void register() throws Exception {
		Connection conn=Helper.con();
		Statement stmt=conn.createStatement();
		reg_id=new Random().longs(10000000,99999999).findFirst().getAsLong();
		ResultSet rs1=stmt.executeQuery("select reg_id from register where reg_id="+reg_id);
		while(rs1.next()) {
			reg_id=new Random().longs(10000000,99999999).findFirst().getAsLong();
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
		password=sc.next();
		while(!Pattern.matches("^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{6}$", password)) {
			System.out.println("Your password doesn't match the validations."
					+"\n Try again : ");
			password=sc.next();
		}
		System.out.println("Re-enter the password to confirm : ");
		String confirmPassword=sc.next();
		while(!password.equals(confirmPassword)) {
			System.out.println("Passwords doesn't match."
					+ "\nTry again : ");
			confirmPassword=sc.next();
		}
		rs1=stmt.executeQuery("select password from register where password='"+password+"'");
		if(rs1.next()) {
			throw new DuplicatePasswordException("Duplicate Password not allowed.");
		}else {
			PreparedStatement pstmt=conn.prepareStatement("insert into register values(?,?)");
			pstmt.setLong(1, reg_id);pstmt.setString(2, confirmPassword);
			pstmt.executeUpdate();
			System.out.println("Account created successfully..."
					+ "\nThis is your Registration Id : "+reg_id
					+"\nKeep it safe.It will be needed while logging into your account.");
		}
	}
	
}
