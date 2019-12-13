package part6.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteratingList {

	public static void main(String[] args) {
		
		// ------------------ Aula 8 - Iterating List Part 1 ---------------------
		
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(2);
		numbers.add(4);
		numbers.add(6);
		
		//for loop
		
		System.out.println("Using For Loop:");
		for(int i=0; i < numbers.size(); i++) {
			System.out.println(numbers.get(i));
			
//			if(i==0)numbers.remove(2); //permitido
//			if(i==0)numbers.add(2); //permitido
			
		}
		System.out.println();
		
		
		//for each loop
		
		System.out.println("Using For Each Loop:");
		for(Integer i : numbers) {
			System.out.println(i);
			//numbers.remove(2); //java.util.ConcurrentModificationException
		}
		System.out.println();
		
		
		//Using Iterator (cannot iterate from a certain index)
		
		System.out.println("Using Iterator:");
		for(Iterator<Integer> iterator = numbers.iterator(); iterator.hasNext(); ) {
			
			Integer number = iterator.next();
			System.out.println(number);
			iterator.remove(); //remove the current item
			
			
		}
		
		System.out.println("List after removing elements in Iterator:" + numbers );
		System.out.println();
		
		
		
		//Using List Iterator (has more options)
		
		
		System.out.println("Using Iterator (running backwards):");
		numbers.addAll(Arrays.asList(1, 2, 3, 4, 5, 6));
		for(ListIterator<Integer> listIterator = numbers.listIterator(3); listIterator.hasPrevious();  ) {
			System.out.println(listIterator.previous());
			//listIterator.add(3); //permitido
			//listIterator.remove();
		}
		
		System.out.println(numbers);
		
		
		// ------------------ Aula 9 - Iterating List Part 2 ---------------------
		
		//Class about performance of iteration methods. Will not be in the exam. Do it later.
		
		

	}

}
