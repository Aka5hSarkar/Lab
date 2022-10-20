/*Problem: 4
Create a class MyCalculator which consists of a single method long power(int, int).
This method takes two integers, n and p, as parameters and finds n^p . If either n or
p is negative, then the method must throw an exception which says "n or p should
not be negative.". Also, if both n and p are zero, then the method must throw an
exception which says "n and p should not be zero."*/

package lab20thOctober;
//creating class 
public class MyCalculator {
	//method to find power
	static void power(int n,int p) {
		//handling exception
		try { //try block
			if(n<0 ||p<0) { //condition
				//throwing exception if n or p is negative
				throw new Exception("n or p should not be negative.");
			}else if (n==0 &&p==0) { //condition
				//throwing exception if n and p both are zero
				throw new Exception("n and p should not be zero.");
			}else {
				//result
				System.out.println("n^p is : "+(long)Math.pow(n, p));
			}
		}catch(Exception e) {//catch block
			System.out.println(e);
		}
	}
	public static void main(String[] args) {
		//Test Case 1 :
		power(12,2);//input 1
		power(2, 10);//input 2
		power(0, 0);//input 3
		power(2, -1);//input 4
	}
}
