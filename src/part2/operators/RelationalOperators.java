package part2.operators;

public class RelationalOperators {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		//------------------ Aula 8 - Relational Operators  ---------------------
		int x = 10;
		int y = 20;
		int z = 10;
		
		boolean b = x < y;
		System.out.println("b:" + b);
		
		//Comparation with diferent types
		
		int    a = 10;
		long   l = 5L;
		double c = 7.5;
		
		System.out.println("a < b: " + (a < l) ); //false
		System.out.println("a > c: " + (a > c) ); //true
		
		int    d = 12;
		long   e = 15L;
		double f = 14.5;
		System.out.println( (d < e ) + "  " + ( e > f) ); //true , true

	}

}
