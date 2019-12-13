package part7.Methods;

public class StaticInitialization {
	
	 static final int SIZE;
	private static final int linha;
	private static final int coluna;
	
	private static final int outroInt;
	
	static {
		
		System.out.println("Primeiro static");
		
		int x = 4;
		int y = 5;
		
		linha  = x;
		coluna = y;
		
		SIZE = x * y;
	}
	
	static {
		
		System.out.println("Segundo static");
		
		outroInt = 666;
	}
	
	

	public static void main(String[] args) {
		
		//Qualquer INICIALIZAÇÃO da Classe vai rodar os statics (não vale o apontamento = null)

	}

}
