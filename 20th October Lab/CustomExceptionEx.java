//Problem: 3:Write a program to create custom exception in java.

package exception;
class InvalidAgeException extends Exception{//custom exception class
	InvalidAgeException(String str){//parameterized constructor
		super(str);
	}
} 
public class CustomExceptionEx {//another class which throws the custom exception
	//method which throw the custom exception
	static void checkAge(int age) throws InvalidAgeException{
		if (age<18) {
			//throwing InvaliAgeException if age<18
			throw new InvalidAgeException("Custom Exception occured : InvalidAge");
		}else
			System.out.println(age);
	}
	public static void main(String[] args){//main method
		//handling the exception
		try {//try block
			checkAge(12);//calling the method with age=12
		}catch (Exception e) {//catch block
			System.out.println(e);
		}	
	}
}
