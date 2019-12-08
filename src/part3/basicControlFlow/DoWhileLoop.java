package part3.basicControlFlow;

public class DoWhileLoop {

	public static void main(String[] args) {
		
		//------------------ Aula 5 - Do While Loop  ---------------------

		int a = 0;
		
		do {
			a++;
		} while(false);
		
		System.out.println(a);
		
//		while(false) { //does not compile
//			a++;
//		}
		
		//Ex1
		int x = 20;
		while(x > 10) 
			x--;
			System.out.println("x: " + x);
			
		//Ex2	
		int x2 = 20;
		do x2--;
		while(x2 > 10);
		
		System.out.println("x2: " + x2);
		
		//Ex3
		int y = 10;
		int z = 5;
		while(y<20)
			y++;
			z+=2;
			y+=10;
			
		//y = 20
		//z = 7
		//y = 30
		System.out.println("y:" + y + ", z:" + z);
		//y:30, z:7
		
		//Ex4
		int number = 10;
		
		while(number > 10) { //not executed
			number--;
		}
		
		do {
			number--; //9
			
			while(number > 5) {
				number += 1; //infinite loop
			}
			
		}while(number < 10);
		
		System.out.println("number:" + number);
		
		
		
	
	}

}
