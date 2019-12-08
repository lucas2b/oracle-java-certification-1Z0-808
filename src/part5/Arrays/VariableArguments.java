package part5.Arrays;

import java.util.Arrays;

public class VariableArguments {

//	public static void main(String[] args) {
//
//	}
	
	public static void main(String... args) { //Valid main method args
		
		//------------------ Aula 9 - Variable Arguments  ---------------------
		
		print("Um", "Dois", "Três", "Quatro"); //This kind of argument only match with "String..." style
		
		print(new String[] {"Teste1", "Teste2"}); //Can use anonymous declaration too
		
		
	}
	
	private static void print(String... arguments) {
		System.out.println(Arrays.toString(arguments));
	}
	
	
	

}
