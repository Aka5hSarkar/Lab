/*HashSet Activity : 
1.	Develop a java class with a instance variable Country  HashSet (H1)
  add a method storeCountryNames(String CountryName) , the method should add
   the passed country to a HashSet (H1) and return the added HashSet(H1).
2.	Develop a method retrieveCountry(String CountryName) which iterates through 
the HashSet and returns the country if exist else return null.

NOTE: You can test the methods using a main method.*/
package lab8thDec;
import java.util.HashSet;
import java.util.Scanner;

public class HashSetActivity {
	static HashSet<String> country=new HashSet<String>();//creating HashSet
	//method to store country names
	static HashSet<String> storeCountryNames(String CountryName) {
		country.add(CountryName);
		return country;
	}
	//method to display the country names
	static String retrieveCountry(String CountryName) {
		if(country.contains(CountryName)) {
			return CountryName;//returning country name if its present in the list
		}else {
			return null;//returning null if it does not present in the list
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("[1-->Store],[2-->Display]");
			int choice=sc.nextInt();//taking choice input
			if(choice==1) {
				System.out.println("How many country names you want to store : ");
				choice=sc.nextInt();//taking choice input
				for (int i=1;i<=choice;i++) {
					System.out.println("Enter name "+i+" : ");
					String name=sc.next();//taking choice input
					storeCountryNames(name);//calling the method and storing the name
				}System.out.println("Name stored successfully..."+
						"Country name list : "+country);//showing the list
			}else if(choice==2) {
				System.out.println("Enter the country name you want to search : ");
				String name=sc.next();//taking choice input
				System.out.println(retrieveCountry(name));//calling the method and displaying the data
			}
		}	
	}
}
