package part2.operators;

public class NumericPromotion {

	public static void main(String[] args) {
		
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
		
		int res1 = s1/s2; //upcasting
		
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
		
		
		

	}

}
