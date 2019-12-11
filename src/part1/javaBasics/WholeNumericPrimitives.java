package part1.javaBasics;

public class WholeNumericPrimitives {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		//------------------ Aula 8 - Whole Numeric Primitives -----------------
		
		System.out.println("Aula 8 - Whole Numeric Primitives: ");
		long max = 32_123_456_789L;
		long n = 2_300;
		
		//octal (0-7)
		int oct = 07;
		int firstOct = 010; //8 in decimal
		int secondOct = 022; //18 in decimal
		
		int sumOct = firstOct + secondOct;
		System.out.println("->firstOct= " + firstOct + " secondOct= " + secondOct);
		System.out.println("decimal sumOct= " + sumOct);
		
		//hexadecimal (0-9 and A-F)
		int firstHex  = 0xF;   //15 decimal
		int secondHex = 0x1E; //30 decimal
		int sumHex = firstHex + secondHex;
		System.out.println("->firstHex= " + firstHex + " secondHex= " + secondHex);
		System.out.println("decimal sum= " + sumHex);
		
		//binary (0-1)
		int firstBin = 0b1001; //9 in decimal
		int secondBin = 0b0111; //7 in decimal
		int sumBin = firstBin + secondBin;
		System.out.println("->firstBin= " + firstBin + " secondBin= " + secondBin);
		System.out.println("sumBin= " + sumBin);
		System.out.println();
		
		
		
		
		//------------------ Aula 9 - Decimal Numeric Primitives (float and double) ----------------
		
		System.out.println("Aula 9 - Decimal Numeric Primitives (float and double): ");
		float myNumber = 25.4f; //25.4 is by default double
		
		//errors with underline
		//double before = 10_.25; //does not compile
		//double after  = 10._25; //does not compile
		//double first  = _10.25; //does not compile
		//double last   = 10.25_; //does not compile
		
		double myDouble = 2.54;
		double myDouble2 = 2.54F; //float to double
		double anotherDouble = 2.54D; //D is not necessary, by default all decimals are double
		
		double scientific = 5.000125E03; // 5.125
		double myDouble3 = 5000.125;
		double scientific2 = 5.000125E3;
		float scientific3 = 5.000125E3F;
		System.out.println("scientific=" + scientific + " myDouble3=" + myDouble3 + " scientific2=" + scientific2);
		
		double hexPi = 0x1.91eb851eb851fp1; //p = floating point portion
		System.out.println("hexPi="+hexPi);
		System.out.println();
		
		
		
		
		//------------------ Aula 10 - Primitive char and boolean  ---------------------
		
		System.out.println("Aula 10 - Primitive char and boolean: ");
		char ch = 'a';
		//char ch2 = 'ab'; //does not compile
		char ch3 = '1';
		char uniChar= '\u03A9'; //uppercase greek omega character
		char uniRoman = '\u216C'; //roman 50 number
		
		System.out.println("uniChar="+uniChar + " uniRoman="+uniRoman);
		
		boolean myBoolean = true;
		boolean myFalseBoolean = false;
		
		System.out.println("myBoolean=" + myBoolean + " myFalseBoolean=" + myFalseBoolean);

	}

}
