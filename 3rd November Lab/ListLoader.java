package lab3rdNovember;
//Thread Activity
//Problem Statement 1
import java.util.ArrayList;
class ListLoader {
	ArrayList<Integer> L=new ArrayList<Integer>();//creating array list
	//method to add elements in the array list
	void loadList(Integer startNumber,Integer lastNumber) {
		for (int i=startNumber;i<=lastNumber;i++) {
			L.add(i);
		}
	}
}
//Thread1 class which extends the Thread class
class Thread1 extends Thread{
	ListLoader ls;//reference of listloader class
	//constructor to store the listloader object in the reference variable
	Thread1(ListLoader ls){
		this.ls=ls;
	}
	//overriding run method from Thread class
	@Override
	public void run() {
		ls.loadList(0, 5000000);
	}
}
//Thread2 class which extends the Thread class
class Thread2 extends Thread{
	ListLoader ls;//reference of listloader class
	//constructor to store the listloader object in the reference variable
	Thread2(ListLoader ls){
		this.ls=ls;
	}
	//overriding run method from Thread class
	@Override
	public void run() {
		ls.loadList(0, 5000000);
	}
}
class Main{
	public static void main(String[] args) {
		ListLoader ls=new ListLoader();
		long a=System.currentTimeMillis();
		ls.loadList(0, 10000000);
		long b=System.currentTimeMillis();
		System.out.println("Time taken without multithreading : "+(b-a)+" miliseconds");//calculating response time after calling the loadlist method
		Thread1 t1=new Thread1(ls);//creating new thread
		Thread2 t2=new Thread2(ls);//creating new thread
		long c=System.currentTimeMillis();
		t1.start();//starting the thread
		t2.start();//starting the thread
		long d=System.currentTimeMillis();
		System.out.println("Time taken with multithreading : "+(d-c));//response time with multithreading
	}
}
