package part4.Strings;

public class StringConcatenation {

	public static void main(String[] args) {
		
		//------------------ Aula 1 - Creating Strings And Concatenation  ---------------------
		String text = "Hello";
		String anotherText = "Hello";
		
		System.out.println(1 + 2 + "b"); //3b
		System.out.println(1 + "b" + 2); //1b2
		
		int three = 3;
		String four = "4";
		System.out.println(1 + 2 + three + four); // 64
		
		int number = 10;
		int anotherNumber = 20;
		System.out.println("result= " + number + anotherNumber); //result=1020
		
		//Append
		
		String str = "";
		for(int i=0; i<10; i++) {
			str += i +  " ";
			
		}
		
		System.out.println(str);
		System.out.println();
		
		String hello = new String("hello");
		String world = new String("world");
		String helloWorld = hello + world;
		System.out.println(helloWorld);
		
		System.out.println();
		
		String str1 = "str1";
		String str2 = "str2";
		String str3 = str1 + str2;
		System.out.println(str3);

	}

}
