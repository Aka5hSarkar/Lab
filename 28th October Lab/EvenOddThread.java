/*1. Create two threads to print even numbers and odd numbers from 1 to 100?
note: after printing of all even numbers only odd numbers should print*/

package lab28thOctober;
//to find even numbers
class EvenNumber extends Thread{
	public void run() {
		for (int i=1;i<=100;i++) {
			if(i%2==0) {
				System.out.print(i+" ");
			}
		}
	}
}
//to find odd numbers
class OddNumbers extends Thread{
	public void run() {
		for (int i=1;i<=100;i++) {
			if (i%2!=0) {
				System.out.print(i+" ");
			}	
		}
	}
}
public class EvenOddThread {

	public static void main(String[] args) {
		//creating objects
		EvenNumber e=new EvenNumber();
		OddNumbers o=new OddNumbers();
		//setting priorities
		e.setPriority(Thread.MAX_PRIORITY);//even numbers with maximum priority
		o.setPriority(Thread.MIN_PRIORITY);//odd numbers with minimum priority
		e.start();
		//handling exception with try catch block
		try {
			e.sleep(1);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		o.start();
	}

}
