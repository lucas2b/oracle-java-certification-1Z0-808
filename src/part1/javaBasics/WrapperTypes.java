package part1.javaBasics;

public class WrapperTypes {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		int 	myInt 	   = 10;
		Integer myInteger  = new Integer(10); //boxing
		Integer myInteger2 = 20; 			  //autoboxing
		Integer myInteger3 = Integer.valueOf(30);
		Integer myInteger4 = Integer.parseInt("12");
		Integer myInteger5 = null;
		
		System.out.println("myInt=" 	 + myInt);
		System.out.println("myInteger="  + myInteger);
		System.out.println("myInteger2=" + myInteger2);
		System.out.println("myInteger3=" + myInteger3);
		System.out.println("myInteger4=" + myInteger4);
		System.out.println("myInteger5=" + myInteger5);
		
		int myInt2 = myInteger; //unboxing
		//int myInt3 = myInteger5; //null pointer
		
		sum(10,10); //autoboxing

	}
	
	public static void sum(Integer value1, Integer value2) {
		System.out.println("Soma = " + (value1+value2));
	}

}
