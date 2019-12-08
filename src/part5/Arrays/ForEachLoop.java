package part5.Arrays;

public class ForEachLoop {

	public static void main(String[] args) {
		
		//------------------ Aula 4 - For Each Loop  ---------------------
		
		String[] names = {"Lucas", "Maiara", "Billy", "Juliane", "Andrei"};
		
		for(String name : names) {
			System.out.println("name = " + name);
		}
		
		//---------- Trying to access local variable
		
		for(String name : names) {
			name = "alterado"; //changeable
			System.out.println(name);
		}
		System.out.println();
		
		//---------- Trying to change variable inside for each loop
		
		StringBuilder[] sb = {
				new StringBuilder("For"),
				new StringBuilder("Loop")
		};
		
		for(StringBuilder localSb : sb) {
			localSb.append(" -ref alterada");
		}
		
		for(StringBuilder localSb : sb) {
			System.out.println(localSb.toString());
		}
		System.out.println();
		
		//--------- Trying to iterate over a int array = possible
		
		int[] numeros = {1,2,3,4};
		for(int num : numeros) {
			System.out.println(num);
		}
		System.out.println();
		
		//--------- Cannot iterate over a String
		String pet = "Dog";
//		for(String item : pet) { //does not compile
//			
//		}
		
		//...but can iterate over charArray
		for(char c : pet.toCharArray()) {
			System.out.println(c);
		}
 
	}

}
