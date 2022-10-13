//Write a class called MyRegex which will contain a string pattern.
//You need to write a regular expression and assign it to the pattern
//such that it can be used to validate an IP address. 
//Use the following definition of an IP address:
//IP address is a string in the form "A.B.C.D", where the value of A, B, C, and D 
//may range from 0 to 255. Leading zeros are allowed. The length of A, B, C, or D can't be greater than 3.
package lab13October;

import java.util.regex.Pattern;

public class MyRegex {

	public static void main(String[] args) {
		//creating regular expression
		String str="[0-9]{1,3}+\\.[0-9]{1,3}+\\.[0-9]{1,3}+\\.[0-9]{1,3}";
		//results
		System.out.println("000.12.12.034 : "+Pattern.matches(str, "000.12.12.034"));
		System.out.println("121.234.12.12 : "+Pattern.matches(str, "121.234.12.12"));
		System.out.println("23.45.12.56 : "+Pattern.matches(str, "23.45.12.56"));
		System.out.println("00.12.123.123123.123 : "+Pattern.matches(str, "00.12.123.123123.123"));
		System.out.println("122.23 : "+Pattern.matches(str, "122.23"));
		System.out.println("Hello.IP : "+Pattern.matches(str, "Hello.IP"));

	}

}
