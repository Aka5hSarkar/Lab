
package Lab18thAugust;
import java.util.Scanner;
public class CalculatorInput {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("input 1st integer : ");
		int a=sc.nextInt();//taking input
		System.out.print("input 2nd integer : ");
		int b=sc.nextInt();
		int sum=a+b;
		int sub=a-b;
		int mul=a*b;
		int ave=(a+b)/2;
		System.out.println("Sum of two integers : "+sum);
		System.out.println("Difference of two integers : "+ sub);
		System.out.println("Product of two integers : "+mul);
		System.out.println("Average of two integers : "+ave);
		System.out.println("Distance of two integers : "+sub);
		if(a>b) {
			System.out.println("Max integer : " +a );
			System.out.println("Min integer : "+b);
		}
		else {
			System.out.println("Max integer : "+b);
			System.out.print("Min integer : "+a);
		}
		
	}

}
