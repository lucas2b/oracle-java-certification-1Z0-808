package part1.javaBasics;
import java.util.*;

public class UsingImports {

	public static void main(String[] args) {
		
		
		for(int i=0; i < args.length; i++) {
			System.out.println("Argumento " + i + ":" + args[i]);
		}
		
		Random rand = new Random();
		System.out.println("Aleatorio: " + rand.nextInt(10));
		
		
	}
}
