package part6.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMethods {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		
		// ------------------ Aula 2 - ArrayList Methods Part 1 ---------------------
		
		//add(), remove(), set()
				
		//------ ADD
		
		List<String> pets = new ArrayList<>();
		pets.add("dog");
		System.out.println(pets);
		
		pets.add(0, "cat"); //passing index
		System.out.println(pets);
		
		//cat, dog
		pets.add(1, "parrot"); //adding on index 1
		
		//cat, parrot, dog
		System.out.println(pets);
		
		pets.add(1, "mice"); //adding on index 1
		
		//cat, mice, parrot, dog (the rest was moved to right)
		System.out.println(pets);
		
		
		pets.add(0, "husky");
		
		//husky, cat, mice, parrot, dog
		System.out.println(pets);
		
		pets.add(0, "bird");
		
		//bird, husky, cat, mice, parrot, dog
		System.out.println(pets);
		
//		pets.add(7, "teste"); //-> Throws exception, size is six.

		//------- REMOVE
		
		pets.remove("parrot");
		
		//bird, husky, cat, mice, dog
		System.out.println(pets);
		
		pets.remove(2);
		
		//bird, husky, mice, dog
		System.out.println(pets);
		
//		pets.remove(10); //-> throws exception
		
		//------- SET : Change the element of an index
		
		pets.set(0, "alterado");
		
		//alterado, husky, mice, dog
		System.out.println(pets);
		System.out.println();
		
//		pets.set(10, "oi"); //-> Throws exception
		
		
		// ------------------ Aula 3 - ArrayList Methods Part 2 ---------------------
		
		//isEmpty(), size(), clear(), contains(), equals()
		
		
		//--- ISEMPTY
		
		List<String> pets2 = new ArrayList<>();
		
		System.out.println(pets2.isEmpty());
		System.out.println(pets2.size());
		
		if(pets2.isEmpty())
			System.out.println("No pets (isEmpty)");
		
		if(pets2.size() == 0)
			System.out.println("No pets (size == 0)");
			System.out.println();
		
		pets2.add("cat");
		System.out.println(pets2.isEmpty());
		System.out.println(pets2.size());
		System.out.println();
		
		
		//---- CLEAR
		
		pets2.clear();
		System.out.println(pets2.size()); //0
		
		pets2.add("dog");
		System.out.println(pets2.contains("cat")); //false
		System.out.println(pets2.contains("dog")); //true
		
		//---- EQUALS - Verify the Same elements in the same order
		
		List<String> newPets = new ArrayList();
		newPets.add("dog");
		
		System.out.println("pets2.equals(newPets):" + pets2.equals(newPets));
		
	}

}
