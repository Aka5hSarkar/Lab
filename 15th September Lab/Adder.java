/*1… Write the following code:
1. A class named Arithmetic with a method named add that takes integers as parameters and
returns an integer denoting their sum.
2. A class named Adder that inherits from a superclass named Arithmetic*/

package Lab15September;
import java.util.Scanner;
//1
//creating parent class 
class Arithmatic{
	//creating a static method to calculate sum of two numbers
	static int add(int a,int b) {
		return a+b;//returning sum
	}
}

//2
//creating child class 
public class Adder extends Arithmatic{
    //main method
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter first number : ");
		int num1=sc.nextInt();//taking first number as input
		System.out.print("enter second number : ");
		int num2=sc.nextInt();//taking second number as input
		//printing the sum of two numbers using add method of parent class
		System.out.print("sum = "+Adder.add(num1,num2));

	}

}
