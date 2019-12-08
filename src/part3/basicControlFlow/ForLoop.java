package part3.basicControlFlow;

public class ForLoop {

	public static void main(String[] args) {
		
		//------------------ Aula 6 - For Loop  ---------------------
		
		for(int i=0; i < 10; i++) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		int a;
		for(a = 0; a < 10; a++) {
			System.out.print(a + " ");
		}
		
		System.out.println();
		System.out.println("Variable a after the For Loop: " + a);
		System.out.println();
		
		//Multiple initialization, tests and update statement
		int x = 0;
		for(int y = 0, z = 4; x < 5 && y < 10; x++, y++) {
			
			System.out.println("y = " + y);
			
		}
		
		System.out.println("x = " + x);
		
		//Does not compile example
		
//		int d = 0;
//		int e;
//		for(int e = 0, d = 10; ; ) {
//			
//		}
		
		//Does not compile - diferent types initialized
//		for(long l = 0, int f = 0; ; ) {
//			
//		}

	}

}
