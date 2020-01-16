package part91.Exceptions;

public class NestedExceptions {

	@SuppressWarnings("finally")
	public static void main(String[] args) {
		
		
		try {
			
			try {
				
			}catch (Exception e2) {
				throw new Exception(); //não precisa tratamento dentro de um try
			}finally {
				
				throw new Exception(); //não precisa tratamento dentro de um try
				
			}
			
			
						
		}catch (Exception e) {	
			
		}finally {
			System.out.println("Finally mais externo");
			
		}

	}

}
