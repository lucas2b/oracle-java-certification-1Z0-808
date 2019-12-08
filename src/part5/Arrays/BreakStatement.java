package part5.Arrays;

public class BreakStatement {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		//------------------ Aula 5 - Break Statement And Labels  ---------------------
		
//		myLabel:
//		int[] myArray = {1, 2, 3}; //does not compile
		
		myLabel: {
			int[] myArray = {1, 2, 3};
		
		}
	
		String[] animals = {"Dog", "Cat", "Lizard", "Bird", "Snake"};
		
		for(String animal: animals) {
			System.out.println(animal);
		}
		System.out.println();
		
		// ------- Using Label to break a loop
		
		MY_LOOP: for(String animal : animals) {
			
			if(animal.equals("Cat")) {
				break MY_LOOP;
			}
			
			System.out.println(animal);
		}
		System.out.println();
		
		
		animal: for(String animal : animals) {
			if(animal.equals("Cat")) {
				break animal;
			}
			
			System.out.println(animal);
		}
		System.out.println();
		
		
		for(String animal : animals) {
			if(animal.equals("Lizard")) {
				break;
			}
			
			System.out.println(animal);
		}
 
	}

}
