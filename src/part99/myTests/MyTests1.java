package part99.myTests;

import java.util.ArrayList;
import java.util.List;

import part8.ClassDesign.OrderOfInitializations;

public class MyTests1 {

	public static void main(String[] args) {
		
		//Testando se objetos são iguais no conteúdo
		
		Teste inst1 = new Teste();
		Teste inst2 = new Teste();
		
		System.out.println(inst1.equals(inst2));
		
		//Testando se o for sem chaves pode conter outro for abaixo
		for(int i=0; i <10; i++) 
			for(int j = 0; j < 10; j++) { //pode
				
			}
		
		//Teste de cache de números
		double b1 = 127;
		double b2 = 127;
		
		System.out.println(System.identityHashCode(b1));
		System.out.println(System.identityHashCode(b2));
		
		
		//testando construtor private package
		
//		OrderOfInitializations order = new Or //não consigo acessar o construtor fora do package dele
		
		
		//Testes de polimorfismo
		List<String> lista = new ArrayList<String>();
		lista.add("oi");

	}

}

class Teste{
	public String saudacao = "oi";
}
