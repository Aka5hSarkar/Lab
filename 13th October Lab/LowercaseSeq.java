//Q3.Write a Java program to find sequences of lowercase letters joined with a underscore

package lab13October;

import java.util.Scanner;
import java.util.regex.Pattern;

public class LowercaseSeq {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string : ");
		String str=sc.next();
		sc.close();
		if(Pattern.matches("[a-z]+_[a-z]+", str)) {
			System.out.println("Found a match.");
		}else {
			System.out.println("Not matched.");
		}
	}

}
