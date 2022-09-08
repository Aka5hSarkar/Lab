/*Q.3... Develop a public java class and make sure nobody can create
any object of this class from outside the class*/

package Lab8September;
//creating public class
public class Test {
	//creating a private constructor
  private Test() {
  }
}
class Test1{
	public static void main(String[] args) {
	Test t=new Test();/*The default constructor of the test class 
	                    is not visible from this class 
	                    because its private constructor*/
}}