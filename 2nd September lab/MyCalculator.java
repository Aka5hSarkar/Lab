/*1… You are given a class AdvancedArithmetic which contains a method signature int
divisor_sum(int n). You need to write another class called MyCalculator which implements the
method.
divisorSum method just takes an integer as input and return the sum of all its divisors. For
example divisors of 6 are 1, 2, 3 and 6, so divisor_sum should return 12. The value of n will be at
most 1000..*/
package lab2ndSeptember;
import java.util.Scanner;
class AdvancedArithmetic {

int divisor_sum(int n){//creating the method to calculate the sum
	
	int sum=0;//initializing sum=0
	if (n>1000) {
		System.out.println("invalid");
	}else {
		for (int i=1;i<=n;i++) {
			if (n%i==0) {
			sum=sum+i;//finding the sum of divisors
		    }
	    }System.out.println(sum);//printing the sum
    }
	return sum;}}//returning the sum
class MyCalculator{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enetr number : ");
	int num=sc.nextInt();//taking input
	AdvancedArithmetic calculator=new AdvancedArithmetic();//creating the object of previous class
	calculator.divisor_sum(num);
	
}
}
