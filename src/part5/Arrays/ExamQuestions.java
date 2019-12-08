package part5.Arrays;

public class ExamQuestions {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		// Question 1
		int count = 0;
		ROW_LOOP: for(int row = 1; row <= 3; row++) {
			
			for(int col=1; col <= 2; col++) {
				if(row * col % 2 == 0) 
					continue ROW_LOOP;
				
				count++;
			}
			
		}
		
		
		//count = 1, 2
			
		System.out.println(count); //2
		System.out.println();
		//B. 2
		
		// Question 2
		int[][] scores = new int[5][]; //Allowed!!!, second index is null
		//C, E, F
		
		// Question 3
		//C
		
		// Question 4
		//D
		
		// Question 5
		//E. Compilation Error arr1 cannot point to arr3 because it's char type
		
		//Question 6
		int[][] arr1 = { {1,2}, {}, {1,2,3,4,5} };
		//A, D
		
		//Question 7
		//C.
		
		//Question 8
		//A.
		
		//Question 9
		//C. The enhanced for loop "CAN" be used within a do-while loop
		
		//Question 10
		//D. Compilation error (the compiler calculates the value of the case)
		

	}

}
