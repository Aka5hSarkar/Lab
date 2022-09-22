//1.write a java program to print sum of odd numbers up to N?


package lab22September;
import java.util.Scanner;
public class SumOdd {

public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("enter number : ");
	int N=sc.nextInt();
	int sum=0;
	for (int i=1;i<=N;i++) {//logic
		if (i%2!=0) {
			sum+=i;
		}
}System.out.println("the sum of the odd numbers from 1 to "+N+" is "+sum);
}
}
