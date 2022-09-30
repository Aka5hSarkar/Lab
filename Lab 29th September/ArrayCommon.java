/*Problem 5.
Write a Java program to find common elements from three sorted (in
non-decreasing order) arrays.*/
import java.util.Arrays;


public class ArrayCommon {

	public static void main(String[] args) {
		int a[]= {1,2,4,6};
		int b[]= {1,3,4,7};
		int c[]= {5,2,1,4};
		//sorting the arrays
		Arrays.sort(a);
		Arrays.sort(b);
		Arrays.sort(c);
		System.out.println("common elements are : ");
		//logic of common elements
		for (int i=0;i<a.length;i++) {
			for (int j=0;j<b.length;j++) {
				for (int k=0;k<c.length;k++) {
					if (a[i]==b[j] && b[j]==c[k] && a[i]==c[k]) {
						System.out.print(a[i]+" ");
					}
				}
			}
		}}}
