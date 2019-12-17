package part8.ClassDesign;

public interface FirstInterface {
	
	int VAR_DEFAULT = 2;

	
	void metodoTeste(String param1);
}

interface SecondInterface {
	
	int VAR_DEFAULT2 = 2;

	
	void metodoTeste2(String param1);
}

class ImplementacaoDeInterface implements FirstInterface{

	int recebeVar = VAR_DEFAULT;
	
	@Override
	public void metodoTeste(String param1) {
		System.out.println("Implementação em classe ImplementacaoDeInterface");
		int x = VAR_DEFAULT;
		
	}

	
}

class ImplementacaoDeInterface2 extends ImplementacaoDeInterface implements SecondInterface{


	@Override
	public void metodoTeste(String param1) {
		System.out.println("Implementação em classe ImplementacaoDeInterface2");
		int x = VAR_DEFAULT;
		
	}

	@Override
	public void metodoTeste2(String param1) {
		// TODO Auto-generated method stub
		
	}
	
}
