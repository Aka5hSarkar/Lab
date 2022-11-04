package lab3rdNovember;

public class Student {
	//problem statement 1
	void calculateFeesStructure(Long studentId,Character studentGrade,Double monthlyFees,Boolean isScholarshipEligible) {
		int fees;
		if(studentId!=0) {
			if(studentGrade=='A' && isScholarshipEligible==true) {
				fees=(int) (monthlyFees-((monthlyFees*10)/100));
				System.out.println("10% of fees is exempted, the calculated fees is "+fees );
			}else if(studentGrade=='B'&& isScholarshipEligible==true) {
				fees=(int)(monthlyFees-((monthlyFees*8)/100));
				System.out.println("8% of fees is exempted, the calculated fees is "+fees);
			}else if(studentGrade=='C'&& isScholarshipEligible==true) {
				fees=(int)(monthlyFees-((monthlyFees*6)/100));
				System.out.println("6% of fees is exempted, the calculated fees is "+fees);
			}else if(studentGrade=='D'&&isScholarshipEligible==true) {
				fees=(int)(monthlyFees-((monthlyFees*4)/100));
				System.out.println("4% of fees is exempted, the calculated fees is "+fees);
			}else {
				System.out.println("Not Eligible for Exemption");
			}
		}
	}
	//problem statement 2
	void compareMarks(Long maths,Double english) {
		
		Integer mathnum=(int) maths.longValue();
		Integer engnum=(int) english.doubleValue();
		if(mathnum==engnum) {
			System.out.println("Both Are Equal");
		}else if(mathnum>engnum) {
			System.out.println("Maths mark is higher than English");
		}else {
			System.out.println("English mark is higher than Maths");
		}
		
	}
	//problem statement 3
	void validateFees(Double fees) {
		if (fees.isInfinite()) {
			System.out.println("Fees is infinite");
		}else {
			System.out.println("Fees is not infinite");
			System.out.println(fees.byteValue());
		}
	}
	public static void main(String[] args) {
		Student std=new Student();
		//problem statement 1
		std.calculateFeesStructure(234l, 'C', 600d, true);//test case 1
		std.calculateFeesStructure(115l, 'B', 909.50d, true);//test case 2
		std.calculateFeesStructure(980l, 'G', 1810d, false);//test case 3
		//problem statement 2
		std.compareMarks(65l, 85d);//test case 1
		std.compareMarks(98l, 56d);//test case 2
		std.compareMarks(84l, 84d);//test case 3
		//problem statement 3
		std.validateFees(1023d);//test case
	}
}
