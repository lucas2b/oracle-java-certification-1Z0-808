package part7.Methods;

public class StaticMethodsAndFields {

	public static void main(String[] args) {
		Dog husky = null;
		System.out.println("Initial husky.count: " + husky.count); //warning
		System.out.println("Initial Dog.count  : " + Dog.count);
		
		Dog anotherDog = new Dog();
		anotherDog.incrementCounter(); //warning
		Dog.incrementCounter();
		
		System.out.println("Dog.count após 2 incrementos: " + Dog.count);
		
		
		husky = null;
		anotherDog = null;
		System.out.println();

		
		System.out.println();
		System.out.println("Dog.count        : " + Dog.count);
		System.out.println("husky.count      : " + husky.count);
		System.out.println("anotherDog.count : " + anotherDog.count);
		
		

	}

}

class Dog{
	
	 public static int count = 0;
	 
	 public static void incrementCounter() {
		 count++;
	 }
	
}
