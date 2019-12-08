package part6.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingArrayList {

	public static void main(String[] args) {
		
		// ------------------ Aula 6 - Sorting ArrayList ---------------------
		
		List<String> listaDeStringsNumericas = new ArrayList<String>();
		listaDeStringsNumericas.add("500");
		listaDeStringsNumericas.add("10");
		listaDeStringsNumericas.add("9");
		listaDeStringsNumericas.add("50");
		listaDeStringsNumericas.add("40");
		
		System.out.println(listaDeStringsNumericas);
		Collections.sort(listaDeStringsNumericas);
		System.out.println(listaDeStringsNumericas); //Ordena por ordem alfabética (primeira letra/número)
		System.out.println();
		
		List<Integer> listaDeIntegers = Arrays.asList(5, 3, 40, 180, 420, 31, 3, 194);
		System.out.println(listaDeIntegers);
		Collections.sort(listaDeIntegers); //Ordena por ordem numérica
		System.out.println(listaDeIntegers);
		

	}

}
