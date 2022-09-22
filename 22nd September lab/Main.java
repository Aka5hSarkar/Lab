/*3.Movie Theater Management System, where you can create
	two classes one is main another one is movie, 
	movie class can have two methods setMovie, getMovie where you can create 
	movieName, movieStartTime, movieEndTime, MovieTicketPrice 
	as instance variables.*/

package lab22September;
import java.util.Scanner;
//parent class
class Movie {
	static private String movieName;
	static private String movieStartTime;
	static private String movieEndTime;
	static private String MovieTicketPrice;
	
	//setter method
	static void setMovie(String n,String st,String et,String m) {
		movieName=n;
		movieStartTime=st;
		movieEndTime=et;
		MovieTicketPrice=m;
	}
	//getter method
	
	static void getMovie() {
		System.out.println("Movie Name : "+movieName);
		System.out.println("Start Time : "+movieStartTime);
		System.out.println("End Time : "+movieEndTime);
		System.out.println("Ticket Price : "+MovieTicketPrice);
	}
}

public class Main extends Movie {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("set movie name : ");
		String name =sc.nextLine();
		System.out.println("set movie start time : ");
		String starttime=sc.nextLine();
		System.out.println("set movie end time : ");
		String endtime=sc.nextLine();
		System.out.println("set ticket price : ");
		String ticketprice=sc.nextLine();
		
		//setting the movie details
		setMovie(name, starttime, endtime, ticketprice);
		//getting the movie details
		System.out.println("getting details...");
		getMovie();
	}

}
