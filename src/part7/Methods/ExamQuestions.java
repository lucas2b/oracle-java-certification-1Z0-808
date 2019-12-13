package part7.Methods;

public class ExamQuestions {

	public static void main(String[] args) {
		
		//Question 1
			//B, C
		
		//Question 2
			//A, D
		
		//Question 3
			//A, C, D
		
		//Question 4
			//A, B, G
		
		//Question 5
			//D, G
		
		//Question 6
			print(true); //auto-boxing para Boolean
			print(6.432); //auto-boxing para Double
			//E
			
		//Question 7
			//B (atenção), E
		
		//Question 8
			//E. 4
			
		//Question 9
			//B. import static java.util.Collections.*
			
		//Question 10
			//B. 9

	}
	
	
	//teste sobre a questão 5
	public static int count(boolean b, boolean... b2) {
		return b2.length;
	}
	
	public static void print(Object x) {
		
		if(x instanceof Double) {
			System.out.println("Double");
		}else if(x instanceof Boolean) {
			System.out.println("Boolean");
		}
		
	}
	
	//não utilizado
	public static void print(float f) {
		System.out.println("float");
	}
	
	

}
