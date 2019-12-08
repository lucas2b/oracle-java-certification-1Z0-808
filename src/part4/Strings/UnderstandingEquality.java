package part4.Strings;

public class UnderstandingEquality {

	public static void main(String[] args) {
		
		//------------------ Aula 9 - Understanding Equality  ---------------------
		
		//Example 1
		
		java.lang.StringBuilder one   = new java.lang.StringBuilder();
		java.lang.StringBuilder two   = new java.lang.StringBuilder();
		java.lang.StringBuilder three = one.append("Java");
		
		System.out.println(one == two); //false
		System.out.println(one == three); //true
		System.out.println();
		
		
		//Example 2
		
		String x = "Java"; //String pool
		String y = "Java"; //String pool
		System.out.println("x == y: " + (x == y));
		
		String a = "Java";
		String b = " Java".trim();
		System.out.println("a == b: " + (a == b));
		System.out.println();
		
		//Example 3
		
		String c = "Java";
		String d = "Ja".trim() + "va"; //trim() returns a new String
		System.out.println("c == d: "+ (c == d));
		
		
	}

}
