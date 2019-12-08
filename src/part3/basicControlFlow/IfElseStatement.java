package part3.basicControlFlow;

public class IfElseStatement {

	public static void main(String[] args) {
		
		//------------------ Aula 1 - If Else Statement  ---------------------
		
		int testScore  = 76;
		char grade;
		
		if(testScore >= 90) {
			grade = 'A';
		} else if(testScore >= 80) {
			grade = 'B';
		} else if (testScore >= 70) {
			grade = 'C';
		} else if (testScore >= 60) {
			grade = 'D';
		} else if (testScore >= 50) {
			grade = 'E';
		} else {
			grade = 'F';
		}
		
		System.out.println("grade: " + grade);
		System.out.println();
		
		//Example with bad formating
		
		int hoursOfDay = 10;
		if(hoursOfDay < 11) System.out.println("Morning");
		else if(hoursOfDay < 17) System.out.println("Evening");
		else
			System.out.println("Day"); hoursOfDay++;
			
		
		System.out.println(hoursOfDay);

	}

}
