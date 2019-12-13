package part5.Arrays;

import java.util.Arrays;

public class SearchingArrays {

	public static void main(String[] args) {
		
		//------------------ Aula 8 - Searching Arrays  ---------------------
		
		
		//SORTED NUMBERS
		
		int[] sortedNumbers = {1, 3, 5, 6, 7};
							 //0, 1, 2, 3, 4
		System.out.println("Array de inteiros ordenados: " + Arrays.toString(sortedNumbers));
		System.out.println("Posição do num 2: " + Arrays.binarySearch(sortedNumbers, 2)); //-2 = 2 should be at index "1"
		System.out.println("Posição do num 5: " + Arrays.binarySearch(sortedNumbers, 5)); // 2 = index 2
		System.out.println("Posição do num 7: " + Arrays.binarySearch(sortedNumbers, 7)); // 4 = index 4
		System.out.println("Posição do num 1: " + Arrays.binarySearch(sortedNumbers, 1)); // 0 = index 0
		System.out.println("Posição do num 3: " + Arrays.binarySearch(sortedNumbers, 3)); // 1 = index 1
		System.out.println("Posição do num 6: " + Arrays.binarySearch(sortedNumbers, 6)); // 3 = index 3
		System.out.println("Posição do num 4: " + Arrays.binarySearch(sortedNumbers, 4)); //-3 = 4 should be at index "2"
		System.out.println();
		
		
		//Testando busca com byte e short - NÃO FUNCIONA
		
		byte[] arrayByte = {4,6,2,4,8,1,32,4,51,34};
		Arrays.sort(arrayByte); //ordenação ok
		//Arrays.binarySearch(arrayByte, 4); //não funciona com byte, short
		
		//Testando busca com float -  FUNCIONA
		
		float[] arrayFloat = {43.2f, 13.2f, 64.23f, 12.3f, 83.4f};
		Arrays.sort(arrayFloat); //ordenação ok
		System.out.println("Array de float ordenado:" + Arrays.toString(arrayFloat));
		System.out.println("Posição do 64.23f: " + Arrays.binarySearch(arrayFloat, 64.23f));
		System.out.println();
		
		
		//Testando busca com double - FUNCIONA
		
		double[] arrayDouble = {8.43, 5.31, 32, 47, 73.12, 3.45, 7.42};
		Arrays.sort(arrayDouble); //ordenação ok
		System.out.println("Array de double ordenado:" + Arrays.toString(arrayDouble));
		System.out.println("Posição do 73.12: " + Arrays.binarySearch(arrayDouble, 73.12));
		System.out.println();
		
		
		// ------------- NOT SORTED NUMBERS -----------
		
		System.out.println("-----------------------//-----------------------");
		System.out.println("Not Sorted Arrays:");
		
		int[] notSortedNumbers = {5, 4, 10, 8, 6};
								//0, 1, 2,  3, 4
		
		System.out.println(Arrays.toString(notSortedNumbers));
		System.out.println(Arrays.binarySearch(notSortedNumbers, 6)); //Unpredictable result = not sorted (even if it exists)
		System.out.println(Arrays.binarySearch(notSortedNumbers, 8)); //Unpredictable result = not sorted (even if it exists)
		System.out.println();
		
		Arrays.sort(notSortedNumbers);
		
		System.out.println("Sorted:");
		System.out.println(Arrays.toString(notSortedNumbers));
		System.out.println(Arrays.binarySearch(notSortedNumbers, 5)); //Index 1
		System.out.println(Arrays.binarySearch(notSortedNumbers, 8)); //Index 3
		System.out.println();
		
		// NOT SORTED STRINGS
		System.out.println("Not Sorted Strings:");
		String[] unsortedLetras = {"g", "d", "a"};
		System.out.println(Arrays.toString(unsortedLetras));
		System.out.println(Arrays.binarySearch(unsortedLetras, "a")); //Unpredictable result = not sorted (even if it exists)
		

	}

}
