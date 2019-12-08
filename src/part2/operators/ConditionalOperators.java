package part2.operators;

public class ConditionalOperators {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		//------------------ Aula 9 - Conditional Operators  ---------------------
		boolean a = true;
		boolean b = false;
		boolean c = true;
		
		boolean d = a && b; //AND, FALSE
		boolean e = a || b; //OR, TRUE
		
		System.out.println("d:" + d + " ,e:" + e);
		
		
		//Example1
		int f=4; //3
		boolean g = false && (f++ < 4); //FALSE, (f++ <4) is never executed (short-circuit)
		boolean h = (f-- == 4) && !g;
		//TRUE && TRUE = TRUE
		
		System.out.println("f:" + f); //3
		System.out.println("g:" + g); //FALSE
		System.out.println("h:" + h); //TRUE
		
		//Example2
		int myInt = 3;
		int anotherInt = 4;
		boolean myBoolean = (myInt <= 3) && (anotherInt-- == 4) || (myInt++ == 4);
						  //TRUE && TRUE || FALSE
						  //TRUE || FALSE
						  //TRUE
		
		System.out.println("myBoolean:" + myBoolean);
		
		//Example3
		boolean x = true, z = false;
		int y = 20;
		x = (y != 10) ^ (z = false);
		   //TRUE ^ FALSE
		   //TRUE
		
		System.out.println("x: " + x);

	}

}
