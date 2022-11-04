package lab3rdNovember;
//Thread Activity
//Problem Statement 1
import java.util.ArrayList;
class ListLoader {
	ArrayList<Integer> L=new ArrayList<Integer>();
	void loadList(Integer startNumber,Integer lastNumber) {
		for (int i=startNumber;i<=lastNumber;i++) {
			L.add(i);
		}
	}
}
class Thread1 extends Thread{
	ListLoader ls;
	Thread1(ListLoader ls){
		this.ls=ls;
	}
	@Override
	public void run() {
		ls.loadList(0, 5000000);
	}
}
class Thread2 extends Thread{
	ListLoader ls;
	Thread2(ListLoader ls){
		this.ls=ls;
	}
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
		System.out.println("Time taken without multithreading : "+(b-a)+" miliseconds");
		Thread1 t1=new Thread1(ls);
		Thread2 t2=new Thread2(ls);
		long c=System.currentTimeMillis();
		t1.start();
		t2.start();
		long d=System.currentTimeMillis();
		System.out.println("Time taken with multithreading : "+(d-c));
	}
}