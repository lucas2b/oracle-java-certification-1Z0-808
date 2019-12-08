package part2.operators;

public class EqualityOperators {

	public static void main(String[] args) {
		
		//------------------ Aula 10 - Equality Operators  ---------------------
		
		int a = 5;
		int b = 3;
		boolean c = (a == b); //false
		boolean d = (a != b); //true
		
		System.out.println("c:" + c + ", d:" + d);
		
		//boolean g = (true == 0); //does not compile
		//boolean h = (false != "test"); //does not compile
		
		boolean x = true;
		boolean y = false;
		boolean z1 = (y = true) == (x = false);
					//TRUE == FALSE -> FALSE
		
		boolean z2 = (y != true) == (x = false);
		//TRUE == TRUE -> TRUE
		
		System.out.println();
		System.out.println(z1);
		System.out.println(z2);
		

	}

}
