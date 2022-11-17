//Problem Statement 2:Write a Java program to extract a portion of an array list.
package lab17November;
import java.util.*;
public class ExtractArrayList {
	public static void main(String[] args) {
		ArrayList<String> list1=new ArrayList<String>();//list 1
		//adding elements
		list1.add("Red");
		list1.add("Green");
		list1.add("Orange");
		list1.add("White");
		list1.add("Black");
		System.out.println("List 1 : "+list1);
		//creating another list where the extracted elements will be stored
		ArrayList<String> list2=new ArrayList<String>();//list 2
		//extracting the elements until 2nd index and storing them in list 2
		for(int i=0;i<3;i++) {
			list2.add(list1.get(i));
		}
		System.out.println("List 2 : "+list2);
	}
}
