//Problem Statement 4:Write a Java program to compare two array lists.
package lab17November;
import java.util.*;
public class ArrayListCompare {
	public static void main(String[] args) {
		ArrayList<String> list1=new ArrayList<String>(5);//list 1
		//adding elements
		list1.add("Red");
		list1.add("Green");
		list1.add("Black");
		list1.add("White");
		list1.add("Pink");
		System.out.println("List 1 : "+list1);
		ArrayList<String> list2=new ArrayList<String>(5);//list 2
		//adding elements
		list2.add("Red");
		list2.add("Green");
		list2.add("Black");
		list2.add("Pink");
		System.out.println("List 2 : "+list2);
		//checking if the ArrayLists are equal or not
		for(String s:list1) { //traversing through the list 1 and checking for elements
			if(list2.contains(s)) {
				System.out.println("Yes");
			}else {
				System.out.println("No");
			}
		}}}
