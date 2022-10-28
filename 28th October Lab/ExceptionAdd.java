/*Problem code 3: 
Write a method called addTwoPositive that takes two int 
parameters, and if either value is not positive, throw an 
ArithmeticException, passing the string "Non-positive 
integer sent". to the constructor of the exception.if the
values are both positive, then return the sum of them. 
Under what circumstances will the finally code block be 
executed in a try/catch/finally segments.*/

package lab28thOctober;
import java.util.Scanner;
public class ExceptionAdd {
	static void addTwoIntegers(int a,int b) throws ArithmeticException{
		try {
			if(a<0 || b<0) {
				throw new ArithmeticException("Non-positive integers sent");
			}else {
				System.out.println("sum : "+(a+b));
			}
		}catch (Exception e) {
				System.out.println(e.getMessage());
			}
		finally {
			System.out.println("Finally block will execute in all cases.");
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number : ");
		int a=sc.nextInt();
		System.out.println("Enter second number : ");
		int b=sc.nextInt();
		addTwoIntegers(a, b);
	}

}
