//Q.1.WAP to find factorial of any number
package Lab;
import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter number : ");
		int fact=1;
		int n=sc.nextInt();
		for (int i=1;i<=n;i++) {
			fact=fact*i;
		}System.out.println("the factoral is : "+fact);

	}

}
