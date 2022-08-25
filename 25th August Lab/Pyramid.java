//Q.3.WAP to draw the pyramid pattern 
package Lab;
import java.util.Scanner;
public class Pyramid {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter number of rows : ");
		int r=sc.nextInt();//taking input from user about how many rows the pyramid will have 
		for (int i=1;i<=r;i++) { //outer for loop condition for rows 
			for (int j=5;j>i;j--) { //inner for loop to print the spaces
				System.out.print(" ");
			}
			for (int n=1;n<=i;n++) { //inner for loop to print the st
				System.out.print("* ");
			}System.out.println();
		}}}
