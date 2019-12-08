package part6.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListConversion {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		// ------------------ Aula 5 - ArrayList And Array Conversion ---------------------
		
		
		//------------------- LIST -> ARRAY -----------------------
		//List and Array are NOT linked
		
		List<String> names = new ArrayList<String>();
		names.add("Lucas");
		names.add("Maiara");
		names.add("Billy");
		
		System.out.println("Initial list: " + names);
		System.out.println();
		
		Object[] objectArray = names.toArray(); //not ideal
		
		String[] stringArray = names.toArray(new String[0]); //Array will be automatically size updated. Method used: copy
		System.out.println("  ->List converted to Array:" + Arrays.toString(stringArray));
		
		
		//Faster way of conversion
		String[] anotherStringArray = names.toArray(new String[names.size()]);
		System.out.println("->List converted to Array 2:" + Arrays.toString(anotherStringArray));
		System.out.println();
		
		
		//---------------------- ARRAY -> LIST -----------------------
		//Array and List are linked, a change in one reflects on another
		
		
		System.out.println("---------------------------------------------------------");
		String[] petsArray = new String[] {"dog", "cat", "parrot"};
		List<String> listOfPets = Arrays.asList(petsArray); //first way //(Attention!) Return fixed sized list
		
//		List<String> listOfPets = Arrays.asList("dog", "cat", "parrot"); //second way,
		
		System.out.println("Initial Array: " + Arrays.toString(petsArray));
		System.out.println();
		System.out.println("->     Array converted to List:" + listOfPets);
				
		listOfPets.set(0, "bird"); //Caution!!! This change reflects on the Array too!
		
		System.out.println("-> List with element 0 changed:" + listOfPets);
		System.out.println("->               Initial Array:" + Arrays.toString(petsArray));
		
		
		//Changing inicial array
		petsArray[0] = "Husky";
		System.out.println("->   Change in array reflected:" + listOfPets);
		
		
//		listOfPets.add("bird"); //Throws exception! fixed size list
//		listOfPets.remove(0); //Throws exception! Operation not supported

	}

}
