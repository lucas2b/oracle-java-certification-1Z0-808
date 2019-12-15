package part8.ClassDesign;


class Example {
	
	private String name = "dog";
	
	//instance initializer
	{
		System.out.println("name: " + name);
	}
	
	
	public static int COUNT = 5;
	
	static {
		System.out.println("COUNT in static initializer: " + COUNT);
	}
	
	{
		COUNT +=10;
		System.out.println("COUNT in instance initializer: " + COUNT);
	}
	
	public Example() {
		System.out.println("Construtor of example");
		
	}
	
	
}

class ComplexExample {
	
	static {
		add(2);
	}
	
	static void add(int number) {
		System.out.print(number +  " ");
	}
	
	ComplexExample(){
		add(5);
	}
	
	static {
		add(4);
	}
	
	{
		add(6);
	}
	
	static {
		
		new ComplexExample();  
		
		//quando esse inicializador é invocado, o que tinha para inicializar
		//estaticamente já foi inicializado, por isso esses trechos (estáticos)
		//não são chamados novamente
	}
	
	{
		add(8);
	}
	
	
	//ordem:
	//Primeiro: tudo que é estático:
	//2, 4, 
	
}



public class OrderOfInitializations {
	
	
	public static void main(String[] args) {
		
//		Example example = null;
//		System.out.println("Static things:");
//		System.out.println(example.COUNT);
//		System.out.println();
//		
//		
//		System.out.println("Instance things:");
//		example = new Example();
		
		new ComplexExample();
		

	}
	
	
	//private package constructor
	OrderOfInitializations() {
		
	}

}
