package part8.ClassDesign;

public class Overriding {

	public static void main(String[] args) {
		
		Overriding instance = new Derived1();
		instance.baseMethod();

	}
	
	public void baseMethod() {
		
		System.out.println("Estou na classe Overriding");
		
	}

}

class Derived1 extends Overriding{
	
	
	@Override
	public void baseMethod() {
		
		// baseMethod(); //CUIDADO!! RECURSÃO!!
		
		System.out.println("Estou na classe Derived1");
		
		
	}
	
}
