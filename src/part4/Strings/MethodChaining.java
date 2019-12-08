package part4.Strings;

public class MethodChaining {

	public static void main(String[] args) {
		
		//------------------ Aula 6 - Method Chaining  ---------------------
		
		String start = "  Java  ";
		System.out.println("Original:" + start);
		
		String trimmed = start.trim();
		System.out.println("trimmed:" + trimmed);
		
		String lowerCase = trimmed.toLowerCase();
		System.out.println("lowerCase:" + lowerCase);
		
		String result = lowerCase.replace('j', 'J');
		System.out.println("result:" + result);
		System.out.println();
		
		String anotherResult = "  Java  ".trim().toLowerCase().replace('j', 'J');
		System.out.println("anotherResult: " + anotherResult);
		
		System.out.println("result.equals(anotherResult): " + (result.equals(anotherResult)));
		System.out.println();
		
		//Example 2
		
		String a = "abc"; //abc
		String b = a.toUpperCase(); //ABC
		String c = b.replace('B', 'b').replace('C', 'c'); //Abc
		
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		System.out.println("c: " + c);
		System.out.println();
		
		
		if(a.equalsIgnoreCase(b)) {
			System.out.println("Strings are equal");
		}
		
		if(a.toLowerCase().trim().equals(b.toLowerCase().trim())) {
			System.out.println("Equal");
		}
		

	}

}
