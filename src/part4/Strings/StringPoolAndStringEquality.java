package part4.Strings;

public class StringPoolAndStringEquality {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		//------------------ Aula 3 - String Pool and String Equality  ---------------------
		
		//String Equality
		String name 	   = "John";
		String anotherName = "John";
		String john	   	   = "Jo" +  "hn"; //using the pool
		String newName 	   = new String("John");
		
		//references
		System.out.println("references:");
		System.out.println("name == anotherName -> " + (name == anotherName));
		System.out.println("name == john 	    -> " + (name == john));
		System.out.println("name == newName     -> " + (name == newName));
		System.out.println();
		
		
		//equals
		System.out.println("equals:");
		System.out.println("name.equals(anotherName) -> " + name.equals(anotherName));
		System.out.println("name.equals(john)        -> " + name.equals(john));
		System.out.println("name.equals(newName)     -> " + name.equals(newName));
		System.out.println();
		
		//hashcode
		System.out.println("hashcode:");
		System.out.println("name        -> identityHashCode -> " + System.identityHashCode(name));
		System.out.println("anotherName -> identityHashCode -> " + System.identityHashCode(anotherName));
		System.out.println("john        -> identityHashCode -> " + System.identityHashCode(john));
		System.out.println("newName     -> identityHashCode -> " + System.identityHashCode(newName));
		System.out.println();
		
		//Tricky question
		String str1 = "abc";
		String str2 = "ab";
		String str3 = str2 + "c"; //Attention!
		
		System.out.println(str3);
		System.out.println(str1 == str3);
		System.out.println();
		
		System.out.println("System.identityHashCode(str1) -> " + System.identityHashCode(str1));
		System.out.println("System.identityHashCode(str2) -> " + System.identityHashCode(str2));
		System.out.println("System.identityHashCode(str3) -> " + System.identityHashCode(str3));

	}

}
