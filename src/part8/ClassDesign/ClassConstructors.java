package part8.ClassDesign;

public class ClassConstructors {
	
	public static void main(String[] args) {

		Dog dog = new Dog("Brown");
		dog.printDogColor();
		
		Cat cat = new Cat(10, 15);
		cat.printInfo();
		
	}

}


class Dog{
	
	private String color;
	
	public Dog(String color) {
		this.color = color;
		
//		color = color //param = param
		
	}
	
	
	//public dog() {} //does not compile - método normal porém sem tipo de retorno
	
	public void Dog() {} //not constructor since it has return type
	
	
	public void printDogColor() {
		System.out.println(this.color);
	}
}

class Cat{
	private String color;
	private int height;
	private int length;
	
	public Cat(int length, int theHeight) {
			this.length = length;
			this.height = theHeight;
			this.color = "white";
	}
	
	public void printInfo() {
		System.out.println("cat lentgh:" + length + " height:" + height + " color:" + color);
	}
	
}
