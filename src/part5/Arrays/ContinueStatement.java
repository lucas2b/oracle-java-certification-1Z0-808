package part5.Arrays;

public class ContinueStatement {

	public static void main(String[] args) {
		
		//------------------ Aula 6 - Continue Statement  ---------------------
		
		String[] animals = {"Dog", "Cat", "Lizard", "Bird", "Snake"};
		
		System.out.println("Normal for each loop:");
		
		for(String animal : animals) {
			System.out.println(animal);
		}
		
		System.out.println();
		
		System.out.println("For each loop with continue:");
		MY_LOOP: for(String animal : animals) {
			
			if(animal.equals("Lizard")) {
				continue MY_LOOP;
			}
			
			System.out.println(animal);
		}
		
		//---> Continue statement can generate a infinite loop...
		
		int index = 0;
		while(index < animals.length) {
			
			String animal = animals[index];
			
			index++;
			
			if(animal.equals("Lizard")) {
				System.out.println("skipped");
				continue;
			}
			
		}

	}

}