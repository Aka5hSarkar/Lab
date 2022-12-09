/*ArrayList Activity :
1. Develop a java class with a method storeEvenNumbers(int N) using ArrayList to store
even numbers from 2 to N, where N is a integer which is passed as a parameter to the
method storeEvenNumbers(). The method should return the ArrayList (A1) created.
2. In the same class create a method printEvenNumbers()which iterates through the
arrayList A1 in step 1, and It should multiply each number with 2 and display it in format
4,8,12….2*N. and add these numbers in a new ArrayList (A2). The new ArrayList (A2)
created needs to be returned.
3. Create a method retrieveEvenNumber(int N) parameter is a number N. This method
should search the arrayList (A1) for the existence of the number ‘N’ passed. If exists it
should return the Number else return zero.
Hint: Use instance variable for storing the ArrayList A1 and A2.
NOTE: You can test the methods using a main method.*/
package lab17November;
import java.util.*;
public class ArrayListClass {
	static ArrayList<Integer> arr1=new ArrayList<Integer>();//List 1
	static ArrayList<Integer> arr2=new ArrayList<Integer>();//List 2
	//method to store even numbers in arr1
	static ArrayList<Integer> storeEvenNumbers(int N) {
		for(int i=2;i<=N;i++) {
			if(i%2==0) {
				arr1.add(i);
			}
		}return arr1;
	}
	//method to multiply even numbers with 2 and store in arr2
	static ArrayList<Integer>  printEvenNumbers(){
		for(int i=0;i<arr1.size();i++) {
			arr2.add(arr1.get(i)*2);
		}return arr2;
	}
	//method to search a specific number
	static int  retrieveEvenNumber(int N) {
		if(arr1.contains(N)) {
			return N;
		}else {
			return 0;
		}
	}
	public static void main(String[] args) {
		//test case
		System.out.println("1st ArrayList : "+storeEvenNumbers(10));
		System.out.println("2nd ArrayList : "+printEvenNumbers());
		System.out.println("Search Result : "+retrieveEvenNumber(6));
	}
}
