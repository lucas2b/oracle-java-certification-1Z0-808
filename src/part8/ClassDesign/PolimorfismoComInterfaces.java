package part8.ClassDesign;

public class PolimorfismoComInterfaces {

	public static void main(String[] args) {
		
		Interface1 inst = new Implementation1();
		inst.metodo1();
		
		
		

		
	}
}

interface gaga{
	
}

class gugu{
	
}

interface Interface1 extends gaga{
	
	int teste =2;
	
	public static final int varTesteQuestion7 = 666; 
	
	void metodo1();
	
	public static void eatPlant() {
		//permitido desde que tenha corpo
	}
	
}

class Implementation1 implements Interface1{
	

	@Override
	public void metodo1() {
		System.out.println("método 1 implementado");
		
		
	}
	
}
