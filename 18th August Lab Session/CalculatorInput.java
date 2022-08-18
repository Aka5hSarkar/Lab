
package Lab18thAugust;
import java.util.Scanner;
public class CalculatorInput {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("input 1st integer : ");
		int a=sc.nextInt();//taking input and assigning it to a
		System.out.print("input 2nd integer : ");
		int b=sc.nextInt();//taking input and assigning it to b
		int sum=a+b;//addition 
		int sub=a-b;//substraction
		int mul=a*b;//multiplication
		int ave=(a+b)/2;//average
		System.out.println("Sum of two integers : "+sum);//printing sum
		System.out.println("Difference of two integers : "+ sub);//printing difference
		System.out.println("Product of two integers : "+mul);//printing product
		System.out.println("Average of two integers : "+ave);//printing average
		System.out.println("Distance of two integers : "+sub);//printing distance
		if(a>b) {                                             //if-else logic
			System.out.println("Max integer : " +a );
			System.out.println("Min integer : "+b);
		}
		else {
			System.out.println("Max integer : "+b);
			System.out.print("Min integer : "+a);
		}
		
	}

}
