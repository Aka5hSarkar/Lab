//Q.1 Write a Java program to find the value of specified expression. 
package Lab18thAugust;

public class SpecifiedExpressions {

	public static void main(String[] args) {  //creating the main method
		String a="(25/3) =";//declaring a string and assigning it to a 
		System.out.println(a + 25/3);//printing the result
		String b="(4.0e-5*1000.11) = ";//declaring a string and assigning it to b
		System.out.println(b + 4.0e-5*1000.11);//printing the result
		String c = "(true && true)= ";//declaring a string and assigning it to c
		boolean bool1=true&&true;//declaring a boolean data type and assigning it to bool1
		System.out.println(c + bool1);//printing the result
		String d ="(false && true) = ";//declaring a string and assigning it to d
		boolean bool2=false&&true;//declaring a boolean data type and assigning it to bool2
		System.out.println(d + bool2);//printing the result
		String e=("(false&&false)||(true&&true) = ");//declaring a string and assigning it to e
		boolean bool3=(false&&false)||(true&&true);//declaring a boolean data type and assigning it to bool3
		System.out.println(e + bool3);//printing the result
		String f="(false||false)&&(true&&true) = ";//declaring a string and assigning it to f
		boolean bool4=false||false&&(true&&true);//declaring a boolean data type and assigning it to bool4
		System.out.println(f + bool4);//printing the result
		
		
		

	}

}
