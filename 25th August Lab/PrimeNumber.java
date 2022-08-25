//WAP to check a number is prime or not
package Lab;
import java.util.Scanner;
public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number : ");
		int n=sc.nextInt();
		if (n==0 || n==1) {
			System.out.println("it is not a prime number");
		}else if(n%n==0 && n%1==0){
			System.out.println("it is a prime number");
		}else {
			System.out.println("it is not a prime number");
		}

	}

}
