/* 2. Write a java program to illustrate Calculator class with addition,
 subtraction, multiplication methods that can take any number of parameters 
to perform the operation, without using method/constructor overloading.
 */


package lab22September;

import java.util.Scanner;

class Operations{
	//methods
	static float getAddition(float a,float b) {
		return a+b;	
	}
	static float getSubstraction(float a,float b) {
		return a-b;
	}
	static float getMultiplication(float a,float b) {
		return a*b;
	}
	static float getDivision(float a,float b) {
		return a/b;
	}
}

public class Calculator extends Operations {

public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println(" enter first number : ");
	float num1=sc.nextFloat();
	System.out.println("enter second number : ");
	float num2=sc.nextFloat();
	System.out.println("getting results...");
	System.out.println("sum : "+getAddition(num1, num2));
	System.out.println("substraction : "+getSubstraction(num1, num2));
	System.out.println("multiplication : "+getMultiplication(num1, num2));
	System.out.println("division : "+getDivision(num1, num2));
}}
