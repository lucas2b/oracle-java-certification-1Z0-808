package part8.ClassDesign;

public class PolimorfismoComInterfaces {

	public static void main(String[] args) {
		
		Interface1 inst = new Implementation1();
		inst.metodo1();
		

		
	}
}

interface Interface1{
	
	int teste =2;
	
	void metodo1();
	
}

class Implementation1 implements Interface1{

	@Override
	public void metodo1() {
		System.out.println("método 1 implementado");
		
	}
	
}
