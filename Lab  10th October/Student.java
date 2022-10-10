package array;

public class Student {
	 int studentNo;
	 long fees;
	 String  studentName,studentMailId,studentAddress;
	Student(int studentNo,String studentName,String studentMailId,String studentAddress,long fees){
		this.studentNo=studentNo;
		this.studentName=studentName;
		this.studentMailId=studentMailId;
		this.studentAddress=studentAddress;
		this.fees=fees;
	}
	void fees (int studentNo,long fees) {
		if (fees<2000) {
			fees=fees+((fees*10)/100);
		}
		System.out.println("New Fees : "+fees);
	}
	void display(int studentNumber) {
		System.out.println("Student No. : "+studentNumber);
		System.out.println("Student name : "+studentName);
		System.out.println("Student Mail : "+studentMailId);
		System.out.println("Address : "+studentAddress);
		System.out.println("Old fees : "+fees);
		fees(studentNumber,fees);
	}
	
}
class StudentDetails{
	public static void main(String[] args) {
		Student[] st= {new Student(1, "akash", "abc@g", "xyz",1500),new Student(2, "bikash", "bcd@g", "wxy",2330),
					   new Student(3, "ram","def@g", "jhgbg",1978),new Student(4, "shyam", "ahgs@g", "kfgt",2000),
					   new Student(5, "sagar", "sgv@g", "fjj",2318)};
		for (int i=0;i<st.length;i++) {
			st[i].display(st[i].studentNo);;
		}
		
}}