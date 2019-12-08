package part1.javaBasics;


//importando estaticamente as classe Math e System.out (pois só contem membro estáticos)
import static java.lang.Math.*;
import static java.lang.System.out;

//utilizando classe personalizada
import static part1.javaBasics.StaticProperties.*;


public class StaticImports {

	public static void main(String[] args) {
		int minimo = min(10,15); //utilizando o static import
		
		out.println("mínimo: " + minimo);
		out.println("PI: " + PI);
		
		//utlizando classe personalizada
		printProperties();

	}

}
