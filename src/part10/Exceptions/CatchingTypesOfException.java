package part10.Exceptions;

public class CatchingTypesOfException {

	public static void main(String[] args) {
		
		try {
			
			throw new MuseumClosedForLunch("ocorreu exceção personalizada");
			
		}catch(MuseumClosedForLunch e) {
			
			System.out.println("Caiu no catch MuseumClosedForLunch");
			
		}catch(MuseumClosed e) {
			
			System.out.println("Caiu no catch MuseumClosed");
			
		}catch (RuntimeException e) {
			
		}catch (Exception e) {
			
		}
		
		
		try {
			
			throw new ArithmeticException();
			
		}catch(ArithmeticException e) {
		
		}catch(RuntimeException e) {
			
		}catch(Exception e) {
			
		}
		
		// Pai > Filha > Filha
		//Exception > RuntimeException > ArithmeticException
		
		//Regra de ordem:
			//Primeiro a exceção de nome igual
			//depois a filha superior
			//depois o pai
		
		
		//Exception > RuntimeException > MuseumClosed > MuseumClosedForLunch
		
		
	}

}

class MuseumClosed extends RuntimeException{
	
	public MuseumClosed(String msg) {
		super(msg);
	}
	
}

class MuseumClosedForLunch extends MuseumClosed{
	
	public MuseumClosedForLunch(String msg) {
		super(msg);
	}
	
}
