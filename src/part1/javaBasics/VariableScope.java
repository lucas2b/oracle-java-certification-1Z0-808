package part1.javaBasics;

public class VariableScope {
	
	static int myClassInt;

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		//------------------ Aula 13 - Variable Scope  ---------------------
		
		System.out.println("Aula 13 - Variable Scope: ");
		
		int myLocalInt = 10;
		
		{//scope1
			
			int myScope1Int = 20;
			System.out.println("myScope1Int: " + myScope1Int);
			
			{//scope2
				
				int myScope2Int = 30;	
			}
			
			//System.out.println("myScope2Int: " + myScope2Int); //does not access
			
		}
		
	}

}
