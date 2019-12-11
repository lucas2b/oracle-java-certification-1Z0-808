package part1.javaBasics;

public class DefaultVariableInitialization {
	

	static boolean myBoolean;
	static byte    myByte;
	static short   myShort;
	static int     myInt;
	static long    myLong;
	static float   myFloat;
	static double  myDouble;
	static char    myChar;
	
	

	public static void main(String[] args) {
		
	
		//------------------ Aula 12 - Understanding Default Initialization Of Primitives  ---------------------
		
		System.out.println("Aula 12 - Understanding Default Initialization Of Primitives: ");
		
		int localInt;
		//System.out.println(localInt); //does not compile. not initializable
		
		System.out.println("myBoolean:" + myBoolean); //false
		System.out.println("myByte:"    + myByte);    //0
		System.out.println("myShort:"   + myShort );  //0
		System.out.println("myInt:"     + myInt);     //0
		System.out.println("myLong:"    + myLong);    //0
		System.out.println("myFloat:"   + myFloat);   //0.0
		System.out.println("myDouble:"  + myDouble);  //0.0
		System.out.println("myChar:"    + myChar);    //empty char
		

	}
	
	

}
