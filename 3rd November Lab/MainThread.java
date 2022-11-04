package lab3rdNovember;
//Problem statement 2 
class LoaderThread implements Runnable{
	ListLoader ls=new ListLoader();
	int startNumber;
	int lastNumber;
	LoaderThread(int startNumber,int lastNumber){
		this.startNumber=startNumber;
		this.lastNumber=lastNumber;
	}
	@Override
	public void run() {
		ls.loadList(startNumber, lastNumber);
	}
}
public class MainThread {
	public static void main(String[] args) {
		LoaderThread lt=new LoaderThread(0,5000000);
		LoaderThread lt2=new LoaderThread(5000000, 10000000);
		long a=System.currentTimeMillis();
		lt.run();
		lt2.run();
		long b=System.currentTimeMillis();
		System.out.println("Response Time : "+(b-a));
	}
}
