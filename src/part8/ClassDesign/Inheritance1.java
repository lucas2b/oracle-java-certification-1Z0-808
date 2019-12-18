package part8.ClassDesign;

public class Inheritance1 {

	public static void main(String[] args) {
		
		Shihtzuh shihtzu = new Shihtzuh(null);
		
		//shihtzu.nomeAnimal

	}

}

class Animal{
	
	public String nomeAnimal;
	
	public Animal() {
		System.out.println("Animal Constructor vazio");
	}
	
	public Animal(String param) {
		System.out.println("Animal constructor com parametro");
	}
	
	public void barulhoAnimal() {
		
	}
	
}

class Cachorro extends Animal{
	
	
	public String racaCachorro = nomeAnimal;
	
	public Cachorro() {
		super();
		//this("oi");
		
		
		
		System.out.println("Constructor de Cachorro");
		
		String recebendoPropSuperior = super.nomeAnimal;
		
		super.barulhoAnimal();
		
	}
	
	public Cachorro(String arg) {
		
	}
	
	public void cachorrinhos() {
		super.barulhoAnimal();
		
	}
	
}

class Shihtzuh extends Cachorro{
	
	public String nomeDoShihtzu;
	
//	public Shihtzuh() {
//		super();
//		System.out.println("Constructor de Shihtzuh");
//	}
	
	public Shihtzuh(String dummy) {
		
	}
	

	
//	public void latir() {
//		super(); //does not compile
//	}
	
	
}

class Gato extends Animal{
	
	public Gato() {
		System.out.println("Contructor de Gato");
	}
}
