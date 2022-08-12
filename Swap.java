//Q.2 Java Swapping two variables

class Swap
{
public static void main(String []args)
{
int a=10;//initializing the first number
int b=20;//initializing the second number
System.out.println("The two numbers are :" + a + " and " + b);
int temp=a;//putting the value of a in temp 
a=b;//putting the value of b in a
b=temp;//putting the value of temp in b
System.out.println("After swapping the two numbers are :" + a + " and " + b);
}
}