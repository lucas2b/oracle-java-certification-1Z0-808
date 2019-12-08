package part1.javaBasics;

public class UnderstandingNull {
	
	static Object myClassObject = new Object();
	static Object myOtherClassObject;
	
	static String myString;

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		//------------------ Aula 15 - Understanding Null  ---------------------
		
		System.out.println("Aula 15 - Understanding Null: ");
		
		Object myLocalObject = new Object();
		Object anotherLocalObject; //not initialized
		
		String name = "Java";
		String anotherName = null;
		
		System.out.println("myClassObject=" + myClassObject);
		System.out.println("myOtherClassObject=" + myOtherClassObject);
		
		System.out.println("myLocalObject=" + myLocalObject);
		//System.out.println("anotherLocalObject=" + anotherLocalObject);
		
		System.out.println("name=" + name);
		System.out.println("anotherName=" + anotherName);
		
		
		System.out.println("myString=" + myString);
		myString.toLowerCase();
		System.out.println("myString=" + myString);

	}

}
