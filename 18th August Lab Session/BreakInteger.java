package Lab18thAugust;
import java.util.Scanner;

public class BreakInteger {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("input a six digit number : ");
		int n=sc.nextInt();
		int n1=n/100000%10;
		int n2=n/10000%10;
		int n3=n/1000%10;
		int n4=n/100%10;
		int n5=n/10%10;
		int n6=n%10;
				
		System.out.println(n1 +" "+n2+" "+n3+" "+n4+" "+n5+" "+n6);

	}

}
