package testes.myTests;

public class Common {
	//Classe usada para declarar modificadores de acesso
	
	public    int publicNumber    = 10;
	protected int protectedNumber = 20;
	          int defaultNumber   = 30;
	private   int privateNumber   = 40;

	public static void main(String[] args) {
		
		Common inst = new Common();
		
		//métodos
		inst.publicPrint();
		inst.protectedPrint();
		inst.defaultPrint();
		inst.privatePrint();
		

	}
	
	public void publicPrint() { //Acessível em qualquer lugar da aplicação
		System.out.println("public");
	}
	
	protected void protectedPrint() { //Acessível apenas nesta classe e no mesmo package
		System.out.println("protected");
	}
	
	void defaultPrint() { //Acessivel apenas nesta classe e no mesmo package
		System.out.println("default");
	}
	
	private void privatePrint() { //Acessivel apenas nesta classe
		System.out.println("private");
	}

}
