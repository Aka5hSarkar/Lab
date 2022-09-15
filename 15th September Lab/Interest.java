/*4…Consider a scenario where Bank is a class that provides functionality to get the rate
of interest. However, the rate of interest varies according to banks. For example, SBI,
ICICI and AXIS banks could provide 8%, 7%, and 9% rate of interest*/

package Lab15September;


class Bank{
	static float getRateOfInterest() {
		return 0f;
	}
}
class  SBI extends Bank{
	static float getRateOfInterest() {
		return 8f;
	}
}
class ICICI extends Bank{
	static float getRateOfInterest() {
		return 7f;
	}
}
class Axis extends Bank{
	static float getRateOfInterest() {
		return 9f;
	}
}

public class Interest {

	public static void main(String[] args) {
		System.out.println("main rate of interest : "+Bank.getRateOfInterest()+"%");
		System.out.println("SBI rate of interest : "+SBI.getRateOfInterest()+"%");
		System.out.println("ICICI rate of interest : "+ICICI.getRateOfInterest()+"%");
		System.out.println("Axis rate of interest : "+Axis.getRateOfInterest()+"%");

	}

}
