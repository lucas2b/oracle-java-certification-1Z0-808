package part2.operators;

public class AssignemtOperators {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		//------------------ Aula 6 - Assignment Operators  ---------------------
		
		int   x = (int) 1.0;
		short y = (short)19812345;
		int   z = (int)9f;
		long  t = 123124124129873L;
		
		//overflow and underflow with byte (-128 to 127)
		byte myByte = 127;
		byte mySecondByte = -128;
		
		myByte = (byte) (myByte + 1); //overflow
		System.out.println("myByte: " + myByte);
		myByte++;
		System.out.println("myByte: " + myByte);
		
		mySecondByte--; //underflow
		System.out.println("mySecondByte: " + mySecondByte);
		
		
		short a = 10;
		short b = 20;
		short c = (short)(a * b);
		System.out.println("c: " + c);
		
		

	}

}
