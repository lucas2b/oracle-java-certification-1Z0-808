package part2.operators;

public class NumericPromotion {

	public static void main(String[] args) {
		
		//------------------ Aula 3 - Numeric Promotion And Casting  ---------------------
		
		//------------- Promotion -> "Smaller" to "bigger"
		int x = 5;
		double y = 10.55;
		
		double soma1 = x + y; //int é promovido para double
		System.out.println("soma1:" + soma1); 
		
		
		
		
		//-------------- Casting -> "Bigger" to "Smaller"
		double myDouble = 5.55;
		int myInt = 4 + (int)myDouble;
		System.out.println("soma2:" + myInt);
		
		int anotherInt = 125;
		byte myByte = 15; //byte = 127 max
		
		byte byteResult = (byte)(anotherInt + myByte);
		System.out.println("soma3:" + byteResult); //overflow
		
		
		//---------------- TESTES --------------------
		
		//teste1
		double d1 = 44.25;
		//float y1 = 3.35; //does not compile
		
		//teste2
		short s1 = 14;
		short s2 = 6;
		
		int res1 = s1/s2; //promotion
		
		//teste3
		byte b1 = 10;
		byte b2 = 15;
		int res2 = b1 + b2; //upcasting
		
		//teste4
		long l1 = 100;
		long l2 = 200;
		long res3 = l1 + l2; //plain
		
		//teste5
		int i1 = 130;
		int i2 = 150;
		byte res4 = (byte)(i1 + i2); //downcasting
		
		//teste6
		short s3 = 14;
		float f1 = 13f;
		double d2 = 30.2;
		
		double res5 = s3 * f1 / d2; //upcasting
		
		//teste 7
		char c1 = 'a';
		char c2 = 'b';
		int soma = c1 + c2;
		
		//teste8
		float f4 = 1.3f;
		float f5 = 1.3f;
		
		float result = f4+f5;
		
		//teste 9
		byte   b4 	   = 3;
		short  sh3 	   = 40;
		int    inteiro = 149;
		double duplo   = 342.42;
		float  fl      = 43.12f;
		
		double result1 = b4 + sh3 + inteiro + duplo + fl; 
		
		
		

	}

}
