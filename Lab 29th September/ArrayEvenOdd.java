/*Problem 1.
Write a Java method to check whether every digit of a given integer
is even. Return true if every digit is odd otherwise false?*/

package array;
import java.util.Scanner;
public class ArrayEvenOdd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("how many integers you want to enter ? ");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the numbers : ");
		for (int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println(evenOdd(arr));
	}
	/*creating a method which takes a integer type of array as parameter
	and check for the even elements and return true if all the elements are odd*/ 
	 static boolean evenOdd(int a[]){
		 int evenCount=0;
		 for (int i=0;i<a.length;i++) {
			 if(a[i]%2==0) {
				 evenCount++;
			 }
		 }
		 if (evenCount==0) {/*if there is no even number then all the numbers are odd
			 					so returning true*/ 
			 return true;
		 }else {
			 return false;
		 }
		
	 }

}
