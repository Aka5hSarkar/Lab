// HashMap activity : 
package lab8thDec;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class HashMapActivity {
	static HashMap<String, String> countryMap=new HashMap<>();//creating 1st HashMap
	static HashMap<String, String> map2=new HashMap<>();//creating 2nd HashMap
	static ArrayList<String> arrList=new ArrayList<>();//ArrayList
	//method to store data into 1st HashMap
	static HashMap<String, String> storeCountryCapital(String CountryName, String capital) {
		countryMap.putIfAbsent(CountryName, capital);//storing country and capital name into the HashMap
		return countryMap;//returning the HashMap
	}
	//method to search capital name using country name as parameter
	static String retrieveCapital(String CountryName) {
		if(countryMap.containsKey(CountryName)) {
			//returning the country name if it is present in the HashMap
			return "The Capital of "+CountryName+" is "+countryMap.get(CountryName);
		}else {
			//If the country is not present in the HashMap it will display this message
			return "The country name does not exist in the list";
		}
	}
	//method to search country name using capital as parameter 
	static String retrieveCountry(String capitalName) {
		String country="";//local variable to store the search result
		if(countryMap.containsValue(capitalName)) {//checking if the capital is present in the HashMap
			for(Map.Entry m: countryMap.entrySet()) {//iterating through the HashMap
				if(m.getValue().equals(capitalName)) {
					country = (String) m.getKey();//storing the result
					break;//breaking the for loop
				}
			}return "The Capital "+capitalName+" belongs to "+country;//returning the country name if it is found
		}else {
			return "The capital name does not exist in the list";//otherwise returning this message
		}
	}
	//method to store the keys as values and values as keys in the 2nd HashMap
	static HashMap<String, String> storeDataMap2(){
		
		for(Map.Entry m:countryMap.entrySet()) {//iterating through the 1st HashMap
			//storing capitals as keys and countries as values in the new HashMap
			map2.put((String)m.getValue(),(String)m.getKey());
		}
		return map2;//returning the HashMap
	}
	//method to store the country names into an ArrayList
	static ArrayList<String> mapToArray(){
		for(Map.Entry m:countryMap.entrySet()) {//iterating through the 1st HashMap
			arrList.add((String)m.getKey());//adding country names into the ArrayList
		}return arrList;//returning the ArrayList
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String country,capital;
		//taking inputs and calling the methods
		System.out.println("How many times you want to entry datas?");
		int choice=sc.nextInt();
		System.out.println("Enter country and its capital's name : ");
		for(int i=1;i<=choice;i++) {
			System.out.println("Country : ");
			country=sc.next();
			System.out.println("Capital : ");
			capital=sc.next();
			storeCountryCapital(country, capital);
		}
		for(Map.Entry m:countryMap.entrySet()) {
			System.out.println("Country(Key) : "+m.getKey()+",Capital(Value) : "+m.getValue());
		}
		System.out.println("You want to search the capital of which country ?");
		country=sc.next();
		System.out.println(retrieveCapital(country));
		System.out.println("You want to search the country of which capital ?");
		capital=sc.next();
		System.out.println(retrieveCountry(capital));
		storeDataMap2();
		System.out.println("2nd HashMap List : ");
		for(Map.Entry m:map2.entrySet()) {
			System.out.println("Capital(Key) : "+m.getKey()+",Country(Value) : "+m.getValue());
		}
		System.out.println("The Arraylist with countrynames is : "+mapToArray());
	}
}
