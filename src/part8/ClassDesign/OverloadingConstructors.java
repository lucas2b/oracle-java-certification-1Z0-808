package part8.ClassDesign;

public class OverloadingConstructors {

	public static void main(String[] args) {
		
		Dog2 dog1 = new Dog2("Jimmy");
		dog1.print();
		
//		Dog2 dog2 = new Dog2("Anthony", "shepard");
//		dog2.print();
//		
//		Dog2 dog3 = new Dog2("Rex", "german shepard", 40);
//		dog3.print();
		

	}

}

class Dog2{
	
	private String name;
	private String breed;
	private double weight;
	
	public Dog2(String name) {
//		this.name = name;
//		breed = "husky";
//		weight = 30.0;
		
//		Dog2(name, "husky"); //does not compile		
//		new Dog2(name, "husky"); //creates another Dog
		
		this(name, "husky"); //funciona
		
		System.out.println("Constructor 1");
		
	}
	
	public Dog2(String name, String breed) {
		this.name = name;
		this.breed = breed;
		weight = 30.0;	
		
		System.out.println("Constructor 2");
	}
	
	public Dog2(String name, String breed, double weight) {
		this.name = name;
		this.breed = breed;
		this.weight = weight;
		
		System.out.println("Constructor 3");
	}
	
	public void print() {
		System.out.println(name + " " + breed + " " + weight);
	}
}
