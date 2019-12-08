package part2.operators;

public class ArithmeticOperators {

	public static void main(String[] args) {
		
		//------------------ Aula 2 - Arithmetic Operators  ---------------------
		
		System.out.println("Aula 2 - Arithmetic Operators: ");
		
		int result = 3 - 2 + 2 * 2 + 3;
		//3-2+4+3
		//1+4+3
		//8
		System.out.println("Resultado1: " + result);
		
		
		result = 4 / 2 + 1 - 4 * 2 + 10;
		//2 + 1 - 8 + 10
		//3 - 8 + 10
		//-5+10
		//5
		System.out.println("Resultado2: " + result);
		
		
		int a = 4;
		int b = 3 - 2 * --a; //pré-decremento
		//3 - 2 * 3
		//3 - 6
			//b = -3
			//a = 3
		System.out.println("a:" + a + " b:" + b);
		
		
		a = 4;
		b = 3 - 2 * a--; //pós-decremento
		//3 - 2 * 4
		//3 - 8
			//b = -5
			//a = 3
		System.out.println("a:" + a + " b:" + b);
		
		
		long c = 2;
		long d = 4 + 3 * c++;
		//4 + 3 * 2
		//4 + 6
			//d=10
			//c=3
		System.out.println("c:" + c + " d:" + d);
		
		
		result = 10 - 3 * (2+1) - 4 / (1+3);
		//10 - 3 * 3 - 4 / 4
		//10 - 9 - 1
		//1 - 1
		//0
		System.out.println("result:" + result);
		
		
		//Função resto
		int i = 10;
		int j = 3;
		
		int k = i % j; //1
		int e = 10 % 2; //0
		System.out.println("k:" + k + " e:" + e);
		
		int f = 12;
		int g = 5;
		int h = 2;
		int m = f / 2 - 10 % (4+3) - 2 * f % g - h * 3;
		//f / 2 - 10 % 7 - 2 * f % g - h * 3;
		//12 / 2 - 10 % 7 - 2 * 12 % 5 - 2 * 3
		//6 - 3 - 24 % 5 - 6
		//6 - 3 - 4 - 6
		//3 - 4 - 6
		//- 1 - 6
		//- 7
		System.out.println("m: " + m);

	}

}
