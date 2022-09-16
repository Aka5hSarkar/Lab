/*4…Consider a scenario where Bank is a class that provides functionality to get the rate
of interest. However, the rate of interest varies according to banks. For example, SBI,
ICICI and AXIS banks could provide 8%, 7%, and 9% rate of interest*/

package Lab15September;

import java.util.Scanner;
class Bank{
	static float getRateOfInterest(float p) {
		return p;
	}
}
class  SBI extends Bank{
	static float getRateOfInterest(float p,int t) {
		return (p*t*8)/100;
	}
}
class ICICI extends Bank{
	static float getRateOfInterest(float p,int t) {
		return (p*t*7)/100;
	}
}
class Axis extends Bank{
	static float getRateOfInterest(float p,int t) {
		return (p*t*9)/100;
	}
}

public class Interest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter amount : ");
		float amount=sc.nextFloat();
		System.out.print("enetr number of years : ");
		int time=sc.nextInt();
		System.out.println("main amount : "+Bank.getRateOfInterest(amount));
		System.out.println("SBI interest : "+SBI.getRateOfInterest(amount,time));
		System.out.println("ICICI interest : "+ICICI.getRateOfInterest(amount,time));
		System.out.println("Axis interest : "+Axis.getRateOfInterest(amount,time));
	}
}
