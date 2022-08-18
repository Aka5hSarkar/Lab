//Q.2 Write a Java program to convert minutes into a number of years and days.
package Lab18thAugust;

public class MinutesDays {

	public static void main(String[] args) {
	
	 int min=6666666;//initialize minutes
	 System.out.println("The minute is : " +min);
	 int year=min/(60*24*365);//calculating years
	 int days=min/(60*24);//calculating days
	 System.out.println("There are "+year+" years and "+days+ " days" );
	}

}
