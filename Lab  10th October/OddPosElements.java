/*Q.3 we need to print the elements of the array which are present in odd positions. This can
be accomplished by looping through the array and printing the elements of an array by
incrementing i by 2 till the end of the array is reached.*/


package array;
import java.util.Arrays;
import java.util.Scanner;
public class OddPosElements {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] arr=new int[5];
		System.out.println("enter 5 array elements : ");
		for (int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("the array is : "+Arrays.toString(arr));
		System.out.println("elements at odd positions of the array are : ");
		for (int i=0;i<arr.length;i+=2) {
			System.out.print(arr[i]+",");
		}
	}

}
