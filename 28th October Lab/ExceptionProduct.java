/*Problem 2 :
Take two numbers x and y. Throw the exception if the two numbers are negative else print the 

Product of x and y.
Input Format
The only line of input consist of two integers, x and y.
Constraints
-20<= x, y <=20
Output Format
Print the product if both are positive else print the output as below:

java.lang.Exception: x and y should not be zero.*/

package lab28thOctober;
import java.util.*;
public class ExceptionProduct {

	public static void main(String[] args) throws Exception{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number : ");
		int x=sc.nextInt();
		System.out.println("Enter second number");
		int y=sc.nextInt();
		if (x>=-20 && y<=20) {
			try {
				if (x<0 || y<0) {
					throw new Exception(" x and y should not be less than zero");
				}else {
					System.out.println("Product of the numbers : "+x*y);
				}
			}catch (Exception e) {
				System.out.println(e);
			}
		}else {
			System.out.println("First and second number should be >= -20 and <= 20 respectively.");
		}
	}

}
