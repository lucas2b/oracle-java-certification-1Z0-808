package part3.basicControlFlow;

public class TernaryOperator {

	public static void main(String[] args) {
		
		//------------------ Aula 2 - Ternary Operator  ---------------------
		
		int x = 10;
		int y;
		
		if (x > 5) y = 2 * x;
		else y = 4 * x;
		
		System.out.println("y: " + y);
		
		
		//------ Ternary operator
		
		//y = (x > 5) ? 2 * x : 4 * x;
		y = (x > 5) ? (2 * x) : (4 * x);
		
		System.out.println("y: " + y);
		
		//not same data type example
		System.out.println(y > 5 ? 10 : "Test");
		
		//int myInt = y < 10 ? 5 : "Test"; //does not compile
		
		//Circuit-breaking in ternary operator
		
		//Example 1
		int a = 1;
		int b = 1;
		int c = a < 10 ? a++ : b++;
		System.out.println("a: " + a + ", b:" + b + ", c:" + c);
		
		
		//Example 2
		int d = 1;
		int e = 2;
		int f = 3;
		
		if(d<10) {
			f = d++ < 1 ? e++ : f++; //Atenção!
		} else {
			f = (d+e) < 2 ? d++ : e++;
		}
		
		//result: f=3, d=2, e=2
		System.out.println("f:" + f + ", d:" + d + ", e:" + e);
		
		
		//Meu teste - ATENÇÃO
		int g = 10;
		g = (true == true) ? g++ : 0; //g não recebe o incremento 
		System.out.println("g:" + g);
		System.out.println();
		
		//o mesmo acontece em 
		int i = 20;
		i = i--;
		System.out.println(i);
		
	}

}
