/*3… Class A serves as a base class for the derived class B, which in turn
serves as a base class for the derived class C. (Which type Of Inheritance
explain with an example)*/


//answer : It's a Multilevel Inheritance.
//below is a example

package Lab15September;
//parent class  A
class A{
	static int a=10;//data member of class A
}
//subclass B of parent class A which can access data members of class A
class B extends A{
	static int b=20;//data member of class B
}
//subclass C of parent class B which can access data members of class B and A
public class C extends B{
	static int c=30;//data member of class C
	//method
	static void show() {
		System.out.println(a);//printing the data member of class A
		System.out.println(b);//printing the data member of class B
		System.out.println(c);//printing the data member of class C
	}

	public static void main(String[] args) {
		C.show();

	}

}
