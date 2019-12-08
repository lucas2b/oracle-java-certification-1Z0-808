package part6.ArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ArrayListExample {

	@SuppressWarnings({ "unused", "rawtypes", "unchecked" })
	public static void main(String[] args) {
		
		// ------------------ Aula 1 - Understanding ArrayList ---------------------
		
		Collection myList = new ArrayList(); //same as ArrayList<Object>
		
		myList.add("oi");
		myList.add(1);
		myList.add(2.5);
		
		for(Object i : myList) {
			
			if(i instanceof Integer) {
				System.out.println("temos um integer: " + i);
			} else if(i instanceof Double) {
				System.out.println("temos um double: " + i);
			} else if(i instanceof String) {
				System.out.println("temos uma string: " + i);
			}
		}
		
		//--------------------------- // --------------------------
		
		ArrayList<String> stringList  = new ArrayList<String>();
		ArrayList<String> stringList2 = new ArrayList<>(); //doesn't need type on diamond
		
		//Setting initial capacity
		List<String> stringList3 = new ArrayList<String>(20); //Initial capacity of 20
		

	}

}
