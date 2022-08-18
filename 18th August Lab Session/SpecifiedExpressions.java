//Q.1 Write a Java program to find the value of specified expression. 
package Lab18thAugust;

public class SpecifiedExpressions {

	public static void main(String[] args) {  //creating the main method
		String a="(25/3) =";
		System.out.println(a + 25/3);
		String b="(4.0e-5*1000.11) = ";
		System.out.println(b + 4.0e-5*1000.11);
		String c = "(true && true)= ";
		boolean bool1=true&&true;
		System.out.println(c + bool1);
		String d ="(false && true) = ";
		boolean bool2=false&&true;
		System.out.println(d + bool2);
		String e=("(false&&false)||(true&&true) = ");
		boolean bool3=(false&&false)||(true&&true);
		System.out.println(e + bool3);
		String f="(false||false)&&(true&&true) = ";
		boolean bool4=false||false&&(true&&true);
		System.out.println(f + bool4);
		
		
		

	}

}
