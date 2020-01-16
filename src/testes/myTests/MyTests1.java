package testes.myTests;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import part9.DateAndTime.A;


public class MyTests1 extends A{
	
	String nome;
	int idade;
	
	void MyTests1() {
		MyTests1("lucas", 33); //instancia se perde no espaço
	}
	
	void MyTests1(String p1, int p2) {
		this.nome = p1;
		this.idade = p2;
		
	}
	
	public void print() {
		

		
		
		A obj = new A();
		System.out.println(obj.i1);
		//System.out.println(obj.i2);
		
		System.out.println(this.i2);
		System.out.println(super.i2);
		
	}

	public static void main(String[] args) {
		
		
		String fruta = "apple";
		
		switch (fruta) {
		
		default:
			System.out.println("default");
		case "apple":
			System.out.println("apple");
		}
		
		new MyTests1().print();
		System.out.println();
		
		
		MyTests1 myteste1 = new MyTests1();
		System.out.println(myteste1.idade + " : " + myteste1.nome);
		System.out.println();
		
		
		System.out.println(new StringBuilder("oi"));

		LocalDate ld = LocalDate.parse("1947-08-14");
		LocalTime lt = LocalTime.MAX;
		System.out.println(ld.atTime(lt));
		
		
		
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
