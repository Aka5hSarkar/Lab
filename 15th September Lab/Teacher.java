/*2… In this example, you have a base class Teacher and a sub class ITTeacher. Since
class ITTeacher extends the designation and college properties and work () method from
base class, we need not to declare these properties and method in sub class.
Here we have college Name, designation and work () method which are common to all the
teachers so we have declared them in the base class, this way the child classes like Math
Teacher, Music Teacher and PhysicsTeacher do not need to write this code and can be used
directly from base class.*/


package Lab15September;
//parent class teacher
class Teacher {
   String collegename="JLDEMC";
   String designation="Teacher";
   String work() {
	  return "Teaching";
  }
   void  show() {
		 System.out.print(" collegename : "+collegename+" , ");
		 System.out.print("designation : "+designation+" , ");
		 System.out.print("work : "+work()+" , ");
	 }}
//child class ITTeacher
class ITTeacher extends Teacher{
	 String subject="IT";
	 void  display() {
		 System.out.print("ITTacher : ");
		super.show();
		 System.out.println("subject : "+subject);
	 }}
class MathTeacher extends Teacher{
	String subject="Math";
	void  display() {
		System.out.print("Math Teacher : ");
		 super.show();
		 System.out.println("subject : "+subject);
	 }}
class MusicTeacher extends Teacher{
	String subject="Music";
	void  display() {
		 System.out.print("Music Teacher : ");
		 super.show();
		 System.out.println("subject : "+subject);
	 }}
class PhysicsTeacher extends Teacher{
	String subject="Physics";
	void  display() {
		 System.out.print("Physics Teacher : ");
		 super.show();
		 System.out.println("subject : "+subject);
	 }
  public static void main(String[] args) {
	  ITTeacher it=new ITTeacher();
	  MathTeacher math=new MathTeacher();
	  MusicTeacher music=new MusicTeacher();
	  PhysicsTeacher physics=new PhysicsTeacher();
	  it.display();
	  math.display();
	  music.display();
	  physics.display();  
}}
 