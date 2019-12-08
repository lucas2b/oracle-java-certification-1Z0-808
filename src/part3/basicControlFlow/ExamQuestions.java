package part3.basicControlFlow;

public class ExamQuestions {

	public static void main(String[] args) {
		
		//Question 1
		
		int m=9, n=1, x=0;
		
		while(m > n) {
			m--;
			n += 2;
			x += m + n;
		}
		
		System.out.println(x);	
		
		//m=9, n=1
			//m=8, n=3, x=11
		//m=8, n=3
			//m=7, n=5, x=11+12=23
		//m=7, n=5
			//m=6, n=7, x=13+23=36
		//m=6, n=7
		//x=36;
		
		//Question 2
		
		int x2 = 4;
		long y = x * 4 - x2--;
		if(y<10) System.out.println("Too Low");
		else System.out.println("Just Right");
		//else System.out.println("Too High"); //Not allowed Else statement
		
		//Question 3
		
		int x3 = 5;
		System.out.println(x3 > 2 ? x3 < 4 ? 10 : 8 : 7);
		//8
		
		//Question 4
		
		for(int i = 0; i < 10; ) {
			i = i++; //"i" is never updated
			System.out.println("Hello world");
		}
		//infinite loop and never terminate
		
		//Question 5
		
		int x4=50, x5=75;
		boolean b = x4 >= x5;
		if(b=true) System.out.println("Success");
		else System.out.println("Failure");
		
		//Question 6
		
		int x6=1, y1=15;
		//while x < 10 //does not compile
		y1--;
		x6++;
		System.out.println(x + ", " + y);
		//E. The code will not compile because of line 4.
		
		// Question 7
		
//		do {
//			int y2=1;
//			System.out.println(y2++ + " ");
//		} while(y2 <= 10); //Have no access to y2
		
		//D. The code will not compile because of line 6
			
			
		// Question 8
		
		final char a='A', d='D';
		char grade = 'B';
		switch(grade) {
			case a:
			case 'B': System.out.print("great");
			case 'C': System.out.print("good"); break;
			case d:
			case 'F': System.out.println("not good");
		
		}
		//B.greatgood

	}

}
