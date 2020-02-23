package part8.ClassDesign;

//Classe sobre métodos e classes abstrats

abstract class Def {

	 abstract protected void teste();
	
	public void chamadaDeImplementacao() {
		teste();
	}
}

class Implementation extends Def{

	@Override
	public void teste() {
		System.out.println("Implementação de teste em Implementation");
		
	}
	
	public void oi() {
		super.chamadaDeImplementacao();
	}
	
	
	
	public static void main(String[] args) {
		System.out.println("estou aqui");
		
		Implementation imp = new Implementation();
		imp.oi();
	}
	
}

class Implementation2 extends Def{

	@Override
	public void teste() {
		System.out.println("Implementação de teste em Implementation2");
		
	}
}
