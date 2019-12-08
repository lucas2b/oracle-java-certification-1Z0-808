package part5.Arrays;

import java.util.Arrays;

public class SortingArrays {

	public static void main(String[] args) {
		
		//------------------ Aula 7 - Sorting Arrays  ---------------------
		
		int[] numbers = {5, 10, 2};
		
		System.out.println("Before sorting: " + Arrays.toString(numbers));
		
		Arrays.sort(numbers);
		
		System.out.println("After sorting:  " + Arrays.toString(numbers));
		System.out.println();
		
		//------- Sorting Strings
		
		String[] nomes = {"Joao", "Maria", "José", "Pedro", "Lucia", "Ana"};
		
		System.out.println("Before sorting: " + Arrays.toString(nomes));
		
		Arrays.sort(nomes);
		
		System.out.println("Before sorting: " + Arrays.toString(nomes));
		System.out.println();
		
		//------ Sorting objects?
		
		Teste inst1 = new Teste();
		inst1.cidade = "Porto Alegre";
		
		Teste inst2 = new Teste();
		inst2.cidade = "Florianópolis";
		
		Teste inst3 = new Teste();
		inst3.cidade = "Curitiba";
		
		Teste inst4 = new Teste();
		inst4.cidade = "São Paulo";
		
		Teste[] cidades = {inst1, inst2, inst3, inst4};
		for(Teste cidade : cidades) {
			System.out.println(cidade.cidade);
		}
		
		Arrays.sort(cidades); //Teste cannot be cast to java.lang.Comparable - Exception
		
		System.out.println();
		for(Teste cidade : cidades) {
			System.out.println(cidade.cidade);
		}

	}

}

class Teste{
	public String cidade;
}