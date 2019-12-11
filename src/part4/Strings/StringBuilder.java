package part4.Strings;

public class StringBuilder {

	public static void main(String[] args) {
		
		//------------------ Aula 8 - Using String Builder class  ---------------------
		
		String myString = "";
		for(char c = 'a'; c <= 'z'; c++) {
			myString += c + " "; //every iteration will create a String object
		}
		
		System.out.println(myString);
		
		//Using StringBuilder
		
		java.lang.StringBuilder sb = new java.lang.StringBuilder();
		
		for(char c = 'a'; c <= 'z'; c++) {
			sb.append(c);
			sb.append(" ");
		}
		
		System.out.println(sb.toString());
		System.out.println();
		
		// ---------------------------------- // ---------------------------------
		
		java.lang.StringBuilder builder = new java.lang.StringBuilder("start");
		builder.append("-middle");
		
		
		java.lang.StringBuilder anotherBuilder = builder.append("-end");
		
		System.out.println("builder        : " + builder);
		System.out.println("anotherBuilder : " + anotherBuilder);
		System.out.println();
		System.out.println("builder == anotherBuilder              : " + (builder == anotherBuilder)); //same reference
		System.out.println("System.identityHashCode(builder)       : " + System.identityHashCode(builder));
		System.out.println("System.identityHashCode(anotherBuilder): " + System.identityHashCode(anotherBuilder));
		System.out.println();
		
		
		builder.append("-lucas"); //Apending on the first one
		System.out.println(anotherBuilder); //printing the second one that holds reference to first one
		System.out.println();
		
		// ---------------------------------- // ---------------------------------
		
		java.lang.StringBuilder myBuilder = new java.lang.StringBuilder();
		System.out.println("size    : " + myBuilder.length());
		System.out.println("capacity: " + myBuilder.capacity());
		
		myBuilder = new java.lang.StringBuilder(100);
		System.out.println("size    : " + myBuilder.length());
		System.out.println("capacity: " + myBuilder.capacity());
		
		myBuilder.append("MyNewTest");
		System.out.println("size    : " + myBuilder.length());
		System.out.println("capacity: " + myBuilder.capacity());
		System.out.println();
		
		// ---------------------------------- // ---------------------------------
		
		// Example of exam
		
		java.lang.StringBuilder a = new java.lang.StringBuilder("This ");
		java.lang.StringBuilder b = a.append("Java ");
		
		b = b.append("is").append(" so ").append(" cool");
		System.out.println(a);
		System.out.println(b);
		System.out.println();
		
		//---------------------------------- // ---------------------------------
		
		java.lang.StringBuilder b1 = new java.lang.StringBuilder("rumble");
		b1.append(4).deleteCharAt(3);
		System.out.println(b1);
		System.out.println(b1.length());
		sb.delete(3, sb.length()-1);
		
		//rumble4
		//0123456
		//rumle4
		//012345 = length 6
		//rum
		
		
		
	}

}
