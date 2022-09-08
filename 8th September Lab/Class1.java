/*Q.4…. Can you create object of a class from inside the scope of
another class constructor.*/
 
//the answer is YES.Its done below

package Lab8September;

 class Class2{}//I've created a class named Class2

public class Class1 {//I've created another class named Class1
	Class1(){//I've created a constructor of Class1
		Class2 c2=new Class2();/*in the constructor I've created an object of 
		                          the previous class : Class2*/
	}
}
