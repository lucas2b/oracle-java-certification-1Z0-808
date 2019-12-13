package part6.ArrayList;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SearchingInArrayList {

	public static void main(String[] args) {
		
		// ------------------ Aula 7 - Searching ArrayList ---------------------
		
		//Sorting String
		
		List<String> numsList = Arrays.asList("500", "10", "9", "50", "40");
		System.out.println(numsList);
		
		int index = Collections.binarySearch(numsList, "10");
		System.out.println("index: " + index + ", num: 10"); //-1 = not sorted
		System.out.println();
		
		Collections.sort(numsList);
		System.out.println("Sorted list: " + numsList);
		
		index = Collections.binarySearch(numsList, "10");
		System.out.println("index: " + index + ", num: 10");
		System.out.println("-------------------------//------------------------------");
		System.out.println();
		
		
		//Sorting Integers
		
		List<Integer> integerList = Arrays.asList(5, 4, 8, 10, 11, 7, 3);
		System.out.println("Unsorted integerList: "  + integerList);
		Collections.sort(integerList);
		System.out.println("  Sorted integerList: " + integerList);
		
		int index2 = Collections.binarySearch(integerList, 8);
		System.out.println("index: " + index2 + ", num: 8");
		
		int index3 = Collections.binarySearch(integerList, 2);
		System.out.println("index: " + index3 + ", num: 2");
		
		

	}

}
