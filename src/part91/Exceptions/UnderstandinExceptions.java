package part91.Exceptions;


public class UnderstandinExceptions {

	public static void main(String[] args) {
		
		//Exemplos de Exceções UNCHECKED
			// Utiliza declaração "throws RuntimeException" no método
			// Compilador não obriga a tratar nem declarar "Throws" no método que está chamando
		
			
			   //int[] myArray = null;
			   //System.out.println(5/0); 		 //ArithmeticException
			   //System.out.println(myArray[1]); //NullPointerException 
		
//		meuMetodoExceptionUnchecked(); //não é necessário tratamento nenhum

		
		
		
		
		//Exemplo de Exceção CHECKED
	    	// Utiliza declaração "throws Exception" no método
	    	// Compilador obriga a tratar ou declarar "Throws" no método que está chamando
			
			try {
				//meuMetodoExceptionChecked();
				
			}catch(Exception e) {		
				//System.out.println(e.getMessage());
				
			}finally {
				System.out.println("Entrou no Finally");
			}
		
	}
	
	public static void meuMetodoExceptionChecked() throws Exception {
		throw new Exception("Falhou ao carregar");
	}
	
	public static void meuMetodoExceptionUnchecked() throws RuntimeException {
		throw new RuntimeException("runtime");
	}

}
