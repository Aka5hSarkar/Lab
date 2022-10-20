//Problem: 2 Write a program in Java to create a file in Java using Exception Handling.

package lab20thOctober;
import java.io.File;//importing file class
import java.util.Scanner;//importing Scanner class
public class CreateFile {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the file name you want to create : ");
		//handling exception
		try {//try block
			String fileName=sc.next();//input
		//initializing new File object and passing the file path as parameter
			File newFile=new File("C:\\Users\\Badal\\Desktop\\New Files\\"+fileName);
			boolean fileCreation=newFile.createNewFile();//creating file using createNewFile method
			if (fileCreation) {
				//if file created successfully then printing the file location
				System.out.println("File is Created at location : "+newFile.getAbsolutePath());
			}else {
				//if same file already exists at the location it will print the location
				System.out.println("File already exists at loaction : "+newFile.getAbsolutePath());
			}
		}catch(Exception e) {//catch block
			System.out.println(e);//print exception if any
		}
	}}
