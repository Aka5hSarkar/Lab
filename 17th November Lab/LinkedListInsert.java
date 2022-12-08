
//Write a Java program to insert the specified element at the front of a linked list
package lab17November;
import java.util.*;
public class LinkedListInsert {

	public static void main(String[] args) {
		LinkedList<Integer> ll=new LinkedList<Integer>();//creating new LinkedList
		//adding elements into the list
		ll.add(1);
		ll.add(2);
		ll.add(3);
		System.out.println("Before : "+ll);//printing the LinkedList
		ll.addFirst(5);//adding 5 at the first of the LinkedList
		System.out.println("After : "+ll);
		System.out.println();
	}
}
