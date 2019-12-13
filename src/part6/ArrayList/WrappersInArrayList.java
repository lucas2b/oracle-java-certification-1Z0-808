package part6.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WrappersInArrayList {

	public static void main(String[] args) {
		
		// ------------------ Aula 4 - Using Wrapper Classes With ArrayList ---------------------
		
		List<Double> doubleList = new ArrayList();
		doubleList.add(66.6); //autoboxing
		doubleList.add(new Double(55.10));
		
		System.out.println(doubleList);
		System.out.println("Removendo 55.10....");
		
		doubleList.remove(55.10); //autoboxing
		
		System.out.println(doubleList);
		
		double getFirst = doubleList.get(0); //unboxing to primitive
		System.out.println("Primeiro elemento: " + getFirst);
		System.out.println();
		
		//----> Case that throws and exception
		
		List<Integer> listaInteiros = new ArrayList();
		listaInteiros.add(null);
//		int itemDaLista = listaInteiros.get(0); //Throws an exception
		
		
		//----> Tricky question with remove option and Integer
		List<Integer> nums = new ArrayList<>();
		nums.add(1); //index 0
		nums.add(2); //index 1
		nums.add(3); //index 2
		
		System.out.println(nums);
		
		System.out.println("Removendo index 1...");
		nums.remove(1);
		
		System.out.println(nums);
		
		System.out.println("Removendo o VALOR 1...");
		nums.remove(new Integer(1));
		
		System.out.println(nums);
		System.out.println();
		

	}

}
