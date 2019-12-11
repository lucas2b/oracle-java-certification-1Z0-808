package part4.Strings;

public class StringMethods {

	public static void main(String[] args) {
		
		//------------------ Aula 4 - String methods Part 1  ---------------------
		
		String str = "java is fun";
		
		//length
		
		System.out.println("length = " + str.length());
		System.out.println();
		
		//charAt
		
		System.out.println(str.charAt(0));
		System.out.println(str.charAt(2));
		System.out.println(str.charAt(6));
		System.out.println(str.charAt(10));
		System.out.println();
		
		//indexOf
		
		System.out.println(str.indexOf('a'));       //returns the first found
		System.out.println(str.indexOf('a', 2));    //letter a from the index 2
		System.out.println(str.indexOf("fun"));     //start of the string
		System.out.println(str.indexOf("fun", 10)); //start of the string at some position
		System.out.println();
		
		//substring
		
		System.out.println(str.substring(1,3));  //begin end
		System.out.println(str.substring(3));    //end only
		System.out.println(str.substring(5, 5)); //empty string
//		System.out.println(str.substring(4, 2)); //string exception out of range
//		System.out.println(str.substring(1,20)); //string exception out of range
		System.out.println();
		
		//toLowerCase toUpperCase
		
		System.out.println("ABCD".toLowerCase());
		System.out.println(str.toUpperCase());
		System.out.println(str);
		
		String dog = "Lucky";
		dog.toUpperCase();
		System.out.println(dog); //unchanged string
		System.out.println();
		
		//------------------ Aula 5 - String methods Part 2  ---------------------
		
		//equals
		
		String str2 = "java";
		String str3 = "Java";
		String str4 = "ja";
		
		System.out.println(str2.equals(str3));
		System.out.println(str2.equalsIgnoreCase(str3));
		System.out.println("abc".equalsIgnoreCase("ABC"));
		System.out.println();
		
		//startsWith endsWith
		
		System.out.println(str2.startsWith("j"));
		System.out.println(str2.startsWith(str4));
		System.out.println(str2.startsWith("J".toLowerCase()));
		System.out.println(str2.endsWith("va"));
		System.out.println();
		
		//c - return boolean
		
		System.out.println(str2.contains(str4));
		System.out.println(str2.contains("av"));
		System.out.println("Java".contains("j".toUpperCase()));
		System.out.println();
		
		//replace - does a simple search and replace content
		
		String str5 = "Java" + " " + "is" + " " + "cool";
		System.out.println(str5.replace('a', 'A'));
		System.out.println(str5.replace(' ', '_'));
		System.out.println(str5.replace("is", "_"));
		System.out.println(str5);
		System.out.println();
		
		//trim - remove blank spaces from beginning and end
		
		System.out.println(" Java ".trim());
		
		
		

	}

}
