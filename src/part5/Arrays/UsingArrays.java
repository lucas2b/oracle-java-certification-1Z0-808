package part5.Arrays;

import java.util.Arrays;

public class UsingArrays {

	public static void main(String[] args) {
		
		//------------------ Aula 2 - Using Arrays  ---------------------
		
		String[] pets = {"parrot", "cat", "dog"};
		
		System.out.println(pets[0]);
		System.out.println(pets[1]);
		System.out.println(pets[2]);
//		System.out.println(pets[3]);
		
		pets[0] = "bird";
		
		System.out.println(Arrays.toString(pets));
		System.out.println();
		
		int[] numbers = new int[5];
		System.out.println(Arrays.toString(numbers));
		
		String[] carros = new String[5];
		System.out.println(Arrays.toString(carros));
		

	}

}
