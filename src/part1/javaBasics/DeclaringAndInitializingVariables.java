package part1.javaBasics;

public class DeclaringAndInitializingVariables {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		//------------------ Aula 11 - Declaring And Initializing Variables  ---------------------
		
		System.out.println("Aula 11 - Declaring And Initializing Variables: ");
		
		int myNumber; //declaration
		//System.out.println("myNumber=" + myNumber); //not allowed
		myNumber = 10;
		System.out.println("myNumber=" + myNumber);
		
		//--------- One line
		
		double myDouble = 7.50;
		System.out.println("myDouble=" + myDouble);
		
		float myFloat1, myFloat2, myFloat3;
		float myFloat4; float myFloat5;
		
		float myFloat6 = 5f, myFloat7= 10f, myFloat8;
		boolean b1, b2;
		
		//double d1, double d2; //does not compile
		
		int i1;
		int i2;
		//int i3; i4; //does not compile
		//int int;   //does not compile
		
		char Char;
		
		//--------- Allowed Symbols
		
		float okFloat;
		double $ok2Double1;
		double _a1toDouble;
		double myTest_;
		float __okButNotNice$123_;
		
		
		//--------- Illegal Examples
		
		//double 3DPoint;
		//double my@Street;
		
		
		
		

	}

}
