package part2.operators;

public class UnaryOperatos {

	public static void main(String[] args) {
		
		//------------------ Aula 4 - Unary Operators - Part 1  ---------------------
		
		int x = +3; //sign is redundant
		System.out.println("x:" + x);
		
		int y = -x; //inverting the signal
		System.out.println("y:" + y);

		
		//boolean
		boolean a = true;
		boolean b = !a;
		System.out.println("a:" + a + " b:" + b);
		
		boolean c = !true; //compile
		//boolean d = -true; //does not compile
		
		//------------------ Aula 5 - Unary Operators - Part 2  ---------------------
		
		//Increment and Decrement operators
		int count = 0;
		System.out.println(count); //0
		System.out.println(++count); //1
		System.out.println(count); //1
		System.out.println(count--); //1
		System.out.println(count); //0
		System.out.println();
		
		
		//desafio 1
		int e = 3;
		int f = ++e * 5 / e-- + --e;
		//4 * 5 / e-- + --e, e=4
		//4 * 5 / 4 + --e, e=3
		//4 * 5 / 4 + 2, e=2
		//20 / 4 + 2
		//5 + 2
		//7
		
		System.out.println("f: " + f);
		
		//desafio 2
		int g = 6; //5, 6, 5
		int h = 2; //3, 3
		int i = ++h + --g * 3 + 2 * g++ - h-- % --g;
		//3 + 5 * 3 + 2 * 5 - 3 % 5 ------>>>> 3%5 = 3
		//3 + 15 + 10 - 3
		//25
		
		System.out.println("i: "+ i);
	}
	

}
