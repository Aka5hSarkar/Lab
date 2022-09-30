


/*Problem 2.
Banking Operations reate a class with customer private instance
variables as accountNumber,accountName,accountBalance and
create methods as
1. create account => accnumber,accname,accbal
2. setAmount=> add amount to accbal
3. getAmount=>print accbal and name account
4. withDrawAmount()=to withdraw amount from accBalance
create a main class to use customer and create atleast two
customers*/
import java.util.Scanner;

class Customer{
	private static   long accountNumber;
	private static  String accountName;
	private static  long accountBalance;
	//method for account creation
	  static void createaccount(long accnumber,String accname,long accbal) {
		accountNumber=accnumber;
		accountName=accname;
		accountBalance=accbal;
		System.out.println("account creation succesfull...");
	}
	 //method for adding amount
	 static void  setAmount(long amount) {
		accountBalance+=amount;
		System.out.println(amount+" rupees added");
	}
	 //method for withdrawing 
	 static void withDrawAmount(long withdraw) {
			accountBalance-=withdraw;
			System.out.println(withdraw+" rupess withdrawed");
		}
	 static void getamount() {//method for getting the account name and balance
		System.out.println("Account name : "+accountName+"\nAccount balance is :  "+accountBalance);
	}
	 
}

public class Bank extends Customer {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome!enter name : ");
		String name=sc.nextLine();
		System.out.println("Enter your account number : ");
		long accno=sc.nextLong();
		System.out.println("enter initial account balance :");
		long balance=sc.nextLong();
		createaccount(accno, name, balance);//creating account
		System.out.println("What would you like to do today?");
		System.out.println("Press 0 for deposit and 1 for withdrawal and 2 to see the balance");
		int choice=sc.nextInt();
		if(choice==0) {
			System.out.println("how much you want to deposit :");
			long dep=sc.nextLong();
			setAmount(dep);//depositing 
			getamount();//getting acc balance
		}else if (choice==1) {
			long withdraw=sc.nextLong();
			System.out.println("how much amount you want to withdraw?");
			withDrawAmount(withdraw);//withdrawing
			getamount();//getting acc balance
		}else
			getamount();//getting acc balance
	}}
