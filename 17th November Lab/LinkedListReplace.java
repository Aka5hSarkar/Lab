//Problem Statement 6:
//Write a Java program to replace an element in a linked list.
package lab17November;
import java.util.*;
public class LinkedListReplace {

	public static void main(String[] args) {
		LinkedList<Integer> ll=new LinkedList<Integer>();//creating new LinkedList
		//adding elements into the list
		ll.add(1);
		ll.add(2);
		ll.add(3);
		System.out.println("Before : "+ll);//printing the LinkedList
		ll.set(1, 5);//replacing the 1st index element with 5
		System.out.println("After : "+ll);
	}

}
