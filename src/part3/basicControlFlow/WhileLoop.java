package part3.basicControlFlow;

public class WhileLoop {

	public static void main(String[] args) {
		//------------------ Aula 4 - While Loop  ---------------------
		
		int spaceOnHdd = 5;
		
		while(spaceOnHdd > 0) {
			spaceOnHdd--;
			System.out.println("Space on HDD= " + spaceOnHdd);
		}
		
		int a = 5;
		int b = 7;
		
		while(a>6) {
			b+=2;
			a++;
		}
		
		a = a > 6 ? a++ : b--;
		//b=6
		//a=7
		
		System.out.println("a:" + a + ", b:" + b);

	}

}
