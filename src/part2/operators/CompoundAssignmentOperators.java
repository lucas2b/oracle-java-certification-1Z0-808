package part2.operators;

public class CompoundAssignmentOperators {

	public static void main(String[] args) {
		
		//------------------ Aula 7 - Compound Assignment Operators  ---------------------
		
		int x = 10;
		int y = 5;
		
		x *= y;
		System.out.println("x: " + x);
		
		//int z +=5; //does not compile
		
		
		//Expressions
		
		long c = 4;
		long d = (c = 2); //por transitividade todos recebem "2"
		System.out.println("d:" + d);
		
		long e = 3;
		long f = 2;
		long h = 1;
		
		long i = e + 3 * (f=3) - (h-=2); 
		//3 + 3 * 3 - (-1)
		//3 + 9 + 1
		//13
		System.out.println("i:" + i);

	}

}
