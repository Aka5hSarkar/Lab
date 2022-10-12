/*Q.4 Create a student class having the following attributes
 1. Student No. (Data type int)
 2. Student Name. (Data type String)
 3. Student Mail Id. (Data type String)
 4. Student Address. (Data type String)
 This class should have 2 methods
 1. void fees (Int Student No.)
 2. void display (Int Student number)
 After the class, you need to create an array of Student having 5 Students
 assign different fees to each Student and also print the details of each
 Student with the array only.
 Now create a static method in the main class which will accept Student
 number and Student fees as parameter and if the fees are less than 2000
 then fees will increase by 10% of their current fees to that Student.
 Call the display method to print the updated details.*/

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
