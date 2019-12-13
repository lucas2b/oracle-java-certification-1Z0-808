package part5.Arrays;

import java.util.Arrays;

public class MultidimensionalArrays {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		// ------------------ Aula 10 - Multidimensional Arrays ---------------------

		// 1D array

		int[] myArray = new int[2];
		myArray[0] = 1;
		myArray[1] = 2;

		// 2D array symmetrical

		int[][] array2d = new int[2][4]; // 2 rows and 4 columns
		int another2dArray[][] = new int[2][4];

		int[] other2dArray[] = new int[2][4]; // Valid 2 dimensional array

		// 2D Asymmetrical array declaration

		String[][] myAsymmetricalAray = new String[][] { 
			    { "One", "Two" }, 				     // 1st row 2 columns
				{ "Three", "Four", "Five" }, 		 // 2nd row 3 columns
				{ "Six", "Seven", "Eight", "Nine" }, // 3rd row with 4 columns
				null

		};

		// Para cada primeira dimensão, existe um número variável para a segunda
		// dimensão
		// Isso não seria possível iniciando o array da forma fixa tradicional

		// [0] -> 2 colunas
		// [1] -> 3 colunas
		// [2] -> 4 colunas

		System.out.print(myAsymmetricalAray[0][0] + " ");
		System.out.print(myAsymmetricalAray[0][1] + " ");
		System.out.println();

		System.out.print(myAsymmetricalAray[1][0] + " ");
		System.out.print(myAsymmetricalAray[1][1] + " ");
		System.out.print(myAsymmetricalAray[1][2] + " ");
		System.out.println();

		System.out.print(myAsymmetricalAray[2][0] + " ");
		System.out.print(myAsymmetricalAray[2][1] + " ");
		System.out.print(myAsymmetricalAray[2][2] + " ");
		System.out.print(myAsymmetricalAray[2][2] + " ");

		// 3D Array
		int[][][] array3D = new int[3][3][3];
		int oneMorearray3D[][][] = new int[3][3][3];
		

		int[] oneMorearray3D2[][] = new int[3][3][3]; // very confusing but legal declaration

		// Initialization
		int[][][] threeDArray = { 
				{ { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } }, 			//Page 1
				{ { 10, 11, 12 }, { 13, 14, 15 }, { 16, 17, 18 } }, //Page 2
				{ { 19, 20, 21 }, { 22, 23, 24 }, { 25, 26, 27 } }  //Page 3
				
		};

	}

}
