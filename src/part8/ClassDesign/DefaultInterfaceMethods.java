package part8.ClassDesign;

public interface DefaultInterfaceMethods {
	
	default int metodoPadrao() {
		return 5;
	}
	
	int metodoSemCorpo();
	

}

interface DefaultInterfaceMethods2 {
	
//	default int metodoPadrao() {
//		return 5;
//	}

	
	int metodoSemCorpo();

}

class TesteMetodoDefault implements DefaultInterfaceMethods, DefaultInterfaceMethods2{
	
	public void vi() {
		metodoPadrao(); //vai chamar o método desta classe
	}
	
	@Override
	public int metodoPadrao() {
		return DefaultInterfaceMethods.super.metodoPadrao(); //vai chamar implementação padrão
	}
	
	public static void main(String[] args) {
		TesteMetodoDefault testeMetodoDefault = new TesteMetodoDefault();
		testeMetodoDefault.vi();
	}

	
	//implementação obrigatória
	
	@Override
	public int metodoSemCorpo() {
		return 3;
		
	}
	
}
