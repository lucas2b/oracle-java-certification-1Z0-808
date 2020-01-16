package part92.LambdaExpressions;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class LambdaExpressions {

	public static void main(String[] args) {
		
		List<Animal> listOfAnimals = new ArrayList<Animal>();
		listOfAnimals.add(new Animal("Fish"  , false, true , false));
		listOfAnimals.add(new Animal("Rabbit", true , false, false ));
		listOfAnimals.add(new Animal("Dog"   , true , true , true));
		
		//------------ Versão de implementação de uma filtragem tradicional ------------
			
//		checkAnimalBehavior(listOfAnimals, new CheckAnimalBehaviorImpl()); //obrigatória a criação da impl
		
		//---------------- Lambda Expressions ----------------
		
			checkAnimalBehavior(listOfAnimals, animal -> !animal.canSwim());
			checkAnimalBehavior(listOfAnimals, animal -> (animal.eatMeat() || animal.canJump()) );
		
		
			checkAnimalBehavior(listOfAnimals, (Animal s) -> s.canJump() );
		
		
		//--------------- Exemplo 2 - sem listas ---------------
		
		Animal a1 = listOfAnimals.get(0);
		Animal a2 = listOfAnimals.get(1);
		
		checkAnimalBehavior(a1, a2, (animal1, animal2) -> animal1.canSwim() && animal2.canJump() );
		System.out.println();
		
		//--------------------- Predicates ----------------------
		
		List<String> names = new ArrayList<String>();
		names.add("Lucas");
		names.add("Maiara");
		names.add("Billy");
		names.add("Alexandre");
		
		System.out.println("names= " + names);
		
		names.removeIf(name -> name.charAt(0) == 'B'); //compact syntax
		
		//long syntax
		names.removeIf(str -> {
			return str.charAt(0) == 'B';
		});
		
		System.out.println("names= " + names);
		
		

	}
	
	private static void checkAnimalBehavior(List<Animal> listAnimals, Predicate<Animal> filter) {
		
		for(Animal animal : listAnimals) {
			System.out.println("animal: " + animal.getType());
			if(filter.test(animal))
				System.out.println(animal.getType());
		}
		System.out.println();
	}
	
	private static void checkAnimalBehavior(Animal a1, Animal a2, AnotherCheckInterface filter) {
		if(filter.check(a1, a2)) {
			System.out.println("Animal 1: " + a1.getType() + " pode nadar e animal 2: " + a2.getType() + " pode pular");
		}
	}

}

class Animal{
	
	private String type;
	private boolean canJump;
	private boolean canSwim;
	private boolean eatMeat;
	
	
	public Animal(String type, boolean canJump, boolean canSwim, boolean eatMeat) {
		super();
		this.type = type;
		this.canJump = canJump;
		this.canSwim = canSwim;
		this.eatMeat = eatMeat;
	}
	
	
	public boolean canJump() {
		return canJump;
	}
	
	public boolean canSwim() {
		return canSwim;
	}
	
	public String getType() {
		return type;
	}
	
	public boolean eatMeat() {
		return eatMeat;
	}
	
}

//interface CheckAnimalBehaviorIterface{
//	boolean checkBehavior(Animal animal);
//}

interface AnotherCheckInterface{
	boolean check(Animal first, Animal second);
}

//class CheckAnimalBehaviorImpl implements CheckAnimalBehaviorIterface {
//
//	@Override
//	public boolean checkBehavior(Animal animal) {
//		return false; //trecho que será substituito pela expressão lambda
//	}
//}