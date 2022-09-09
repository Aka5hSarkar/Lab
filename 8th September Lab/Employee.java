/*java program to create employee object without using new keyword
take 5 input as id & name*/

package Lab;

public class Employee {
 static String emp1Name="A";
 static String emp2Name="B";
 static String emp3Name="C";
 static String emp4Name="D";
 static String emp5Name="E";
 static long emp1Id=1;
 static long emp2Id=2;
 static long emp3Id=3;
 static long emp4Id=4;
 static long emp5Id=5;
 static void print() {
	 System.out.println("Employee 1 name : "+emp1Name+" "+"Employee 1 Id : "+emp1Id);
	 System.out.println("Employee 2 name : "+emp2Name+" "+"Employee 2 Id : "+emp2Id);
	 System.out.println("Employee 3 name : "+emp3Name+" "+"Employee 3 Id : "+emp3Id);
	 System.out.println("Employee 4 name : "+emp4Name+" "+"Employee 4 Id : "+emp4Id);
	 System.out.println("Employee 5 name : "+emp5Name+" "+"Employee 5 Id : "+emp5Id);
 }
}
class EmployeeObject{
	public static void main (String[] args) {
		Employee.print();
	}
}
