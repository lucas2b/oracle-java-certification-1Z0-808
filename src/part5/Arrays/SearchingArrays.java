package part5.Arrays;

import java.util.Arrays;

public class SearchingArrays {

	public static void main(String[] args) {
		
		//------------------ Aula 8 - Searching Arrays  ---------------------
		
		
		//SORTED NUMBERS
		
		int[] sortedNumbers = {1, 3, 5, 6, 7};
							 //0, 1, 2, 3, 4
		
		System.out.println(Arrays.binarySearch(sortedNumbers, 2)); //-2 = 2 should be at index "1"
		System.out.println(Arrays.binarySearch(sortedNumbers, 5)); // 2 = index 2
		System.out.println(Arrays.binarySearch(sortedNumbers, 7)); // 4 = index 4
		System.out.println(Arrays.binarySearch(sortedNumbers, 1)); // 0 = index 0
		System.out.println(Arrays.binarySearch(sortedNumbers, 3)); // 1 = index 1
		System.out.println(Arrays.binarySearch(sortedNumbers, 6)); // 3 = index 3
		System.out.println(Arrays.binarySearch(sortedNumbers, 4)); //-3 = 4 should be at index "2"
		System.out.println();
		
		
		// NOT SORTED NUMBERS
		
		
		int[] notSortedNumbers = {5, 4, 10, 8, 6};
								//0, 1, 2,  3, 4
		
		System.out.println(Arrays.toString(notSortedNumbers));
		System.out.println(Arrays.binarySearch(notSortedNumbers, 6)); //Unpredictable result = not sorted (even if it exists)
		System.out.println(Arrays.binarySearch(notSortedNumbers, 8)); //Unpredictable result = not sorted (even if it exists)
		System.out.println();
		
		Arrays.sort(notSortedNumbers);
		
		System.out.println(Arrays.toString(notSortedNumbers));
		System.out.println(Arrays.binarySearch(notSortedNumbers, 5)); //Index 1
		System.out.println(Arrays.binarySearch(notSortedNumbers, 8)); //Index 3
		System.out.println();
		
		// NOT SORTED STRINGS
		
		String[] unsortedLetras = {"g", "d", "a"};
		System.out.println(Arrays.toString(unsortedLetras));
		System.out.println(Arrays.binarySearch(unsortedLetras, "a")); //Unpredictable result = not sorted (even if it exists)
		

	}

}
