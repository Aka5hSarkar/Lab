/*Problem: 1
You are given a piece of Java code. You have to complete the code by writing down the handlers
for exceptions thrown by the code. The exceptions the code may throw along with the handler
message are listed below:
Division by zero: Print "Invalid division".
String parsed to a numeric variable: Print "Format mismatch".
Accessing an invalid index in string: Print "Index is invalid".
Accessing an invalid index in array: Print "Array index is invalid".
MyException: This is a user defined Exception which you need to create. It takes a
parameter param. When an exception of this class is encountered, the handler should print "My
Exception[param]", here param is the parameter passed to the exception class.
Exceptions other than mentioned above: Any other exception except the above ones fall in this
category. Print "Exception encountered".
Finally, after the exception is handled, print "Exception Handling Completed".*/

package lab20thOctober;
import java.util.*;
class MyException extends Exception{//creating custom exceptions class
	MyException(String param){//constructor
		super(param);
	}
}
public class ExceptionExamples {
	public static void main(String[] args) throws MyException{
		Scanner sc=new Scanner(System.in);
		int a=20;
		String str="akash";
		int[] arr= {1,2,3,4,5};
		//handling the exceptions
		try {//try block
			System.out.println("Enter the number by which you want to divide "+a+" : ");
			int b=sc.nextInt();//input mismatch exception might occur
			System.out.println("Division is : "+a/b);//ArithmeticException might occur
			System.out.println("Enter the index number you want to access of : "+str);
			int charindex=sc.nextInt();//input mismatch might occur
			System.out.println("It is : "+str.charAt(charindex));//StringIndexOutOfBoundsException might occur
			System.out.println("Enter the index number you want to access of : "+Arrays.toString(arr));
			int arrindex=sc.nextInt();////input mismatch might occur
			System.out.println("It is : "+arr[arrindex]);//ArrayIndexOutOfBoundsException might occur
			System.out.println("Enter your age : ");
			int age=sc.nextInt();//input mismatch exception might occur
			if(age<18) {
				//if age is less than 18 it will the custom exception
				throw new MyException("My Exception[param]");
			}else {
				System.out.println(age +" is valid age");
			}
		}catch(ArithmeticException e) {//catch block for ArithmeticException
			System.out.println("Invalid division");	
		}catch(InputMismatchException i) {//catch block for InputMismatchException
			System.out.println("Format mismatch");
		}catch(StringIndexOutOfBoundsException s) {//catch block for StringIndexOutOfBoundsException
			System.out.println("Index is invalid");
		}catch (ArrayIndexOutOfBoundsException ar) {//catch block for ArrayIndexOutOfBoundsException
			System.out.println("Array index is invalid");
		}catch (MyException m) {//catch block for our custom exception
			System.out.println(m.getMessage());
		}catch(Exception e) {//catch block for any other exception not mentioned above
			System.out.println("Exception encountered");
		}
		finally {//finally block
			System.out.println("Exception Handling Completed");
		}
	}
}
