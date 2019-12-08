package part5.Arrays;

import java.util.Arrays;

public class UnderstandingArrays {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		//------------------ Aula 1 - Understanding Arrays  ---------------------
		
		//Declaration
		
		int[] firstArray     = new int[3];          //first  way
		int   secondArray[]  = new int[2];          //second way
		int   thirdArray[]   = new int[]{1,2,3};    //third  way
		int[] fourthArray    = new int[3 * 5 / 2]; //fourth  way - round to 7
		
		int[] fifthArray     = {4,2,6,2};		    //fifth way - anonymous array
		int[] sixthArray	 = {};					//sixth way - anonymous array with size 0
		
//		double[] arrayDeDoubles = new double[2.5d]; //does not compile
		
		int x = 4;
		int y = 4;
		int[] c = new int[ x * y ]; //expression allowed
		
		int[] ids, types;   //creates 2 arrays
		int   ids2[], types2; //create array and int
		
		
		//References
		
		String[] animals = {"Parrot", "Dog", "Cat"};
		String[] myAnimals = animals;
		String[] otherAnimals = {"Parrot", "Dog", "Cat"};
		
		System.out.println("animals.equals(myAnimals): " + animals.equals(myAnimals));
		System.out.println("animals == myAnimals     : " + (animals == myAnimals));
		System.out.println();
		
		System.out.println("animals == otherAnimals             : " + (animals == otherAnimals) );//false
		System.out.println("animals.equals(otherAnimals)        : " + animals.equals(otherAnimals)); //false
		System.out.println("Arrays.equals(animals, otherAnimals): " + Arrays.equals(animals, otherAnimals)); //true
		System.out.println();
		
		
		System.out.println(animals);
		System.out.println(animals.toString());
		System.out.println(animals instanceof Object);
		System.out.println();
		
		//Printing arrays
		System.out.println("Animals: " + Arrays.toString(animals));

	}

}
