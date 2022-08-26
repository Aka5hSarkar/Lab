//WAP to check a number is prime or not
package Lab;
import java.util.Scanner;
public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your number : ");
		//taking input
		int a=sc.nextInt();
		//initializing count variable with 0
		int count=0;
		//for loop to divide the number by all its previous numbers
			for (int i=1;i<=a;i++) {
				//if condition to increase the count value by 1
				if(a%i==0) {
					count++;
				}}
			//prime number is divided by only 2 numbers so whenever count is 2 it will be prime number
			while (count!=2) {
				System.out.println("its not a prime number");
				break;
			}System.out.println("its a prime number");

	}

}
