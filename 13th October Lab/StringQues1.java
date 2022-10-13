//Q1
package lab13October;
import java.util.StringTokenizer;
public class StringQues1 {
	public static void main(String[] args) {
//Problem Statement 1:
		String s1="Welcome to Java World";
		//5th position character
		System.out.println("Chararcter at 5th index is : "+s1.charAt(5));
		//comparing lexicographically with Welcome
		System.out.println("After comparing lexicographically the result is : "+s1.compareToIgnoreCase("Welcome"));
		//Concatenating
		s1=s1+"- Let us learn";
		System.out.println("After concatenating the string is : "+s1);
		//position of first occurrence of "a"
		System.out.println("The index of first occurrence of \"a\" is : "+s1.indexOf("a"));
		//after replacing 'a' to 'e'
		System.out.println("after replacing 'a' to 'e' : "+s1.replace('a', 'e'));
		//string between 4th index and 10th index 
		System.out.println("string between 4th index and 10th index : "+s1.substring(4, 10));
		//lowercase of string
		System.out.println("lowercase of string : "+s1.toLowerCase());
//Problem Statement 2:
		StringBuffer s2=new StringBuffer("This is StringBuffer");
		//replacing
		System.out.println("After replacing : "+s2.replace(14, 20, "Builder"));
		//appending string
		System.out.println("adding new string : "+s2.append("- This is a sample program"));
		//inserting
		System.out.println("after inserting at 21st index : "+s2.insert(21, "Object"));
		//reversing
		System.out.println("after reversing : "+s2.reverse());
//Problem Statement 3:
		StringTokenizer st=new StringTokenizer("C:\\IBM\\DB2\\PROGRAM\\DB2COPY1.EXE");
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken("\\"));
		}
	}
}
