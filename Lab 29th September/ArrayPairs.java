/*Problem 4.
a Java program to find all pairs of elements in an array whose sum is
equal to a specified number*/

import java.util.Arrays;
import java.util.Scanner;
public class ArrayPairs {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int[] a=new int[5];
		System.out.println("enter 5 numbers : ");
		for (int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("your array : "+Arrays.toString(a));
		//sorting the array in ascending order
		Arrays.sort(a);
		System.out.println("enter the sum : ");
		int num=sc.nextInt();
		System.out.println("the number pairs which add to the sum are : ");
		for (int i=0;i<a.length;i++) {//finding the pairs
			for (int j=i+1;j<a.length;j++) {
				if(a[i]+a[j]==num) {
					System.out.println(+a[i]+" & "+a[j]);
				}
			}
		}
	}

}
