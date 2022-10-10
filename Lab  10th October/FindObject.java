//Q.1 Write a Java program to test if an array contains a specific value

package array;
import java.util.Arrays;
import java.util.Scanner;
public class FindObject {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] arr=new int[5];
		System.out.println("enter 5 array elements : ");
		for (int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		//printing the array
		System.out.println("the array is : "+Arrays.toString(arr));
		//finding the element
		System.out.println("enter the element you want to find : ");
		int num=sc.nextInt();
		System.out.println(search(arr,num));
	}
	//method to search element
	static boolean search(int[] a,int n) {
		for (int i=0;i<a.length;i++) {
			if(a[i]==n) {
				return true;
			}
		}return false;
}}
