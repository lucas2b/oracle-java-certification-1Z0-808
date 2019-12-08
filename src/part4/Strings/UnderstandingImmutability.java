package part4.Strings;

public class UnderstandingImmutability {

	public static void main(String[] args) {
		
		//------------------ Aula 2 - Understanding Immutability  ---------------------
		
		String hello = "hello";
		String str = hello; //passagem por cópia do conteúdo de hello
		
		System.out.println(str);
		hello = "hello alterada";
		System.out.println(str);
		System.out.println();
		
		//Teste com referência a objetos
		
		Teste inst1 = new Teste();
		System.out.println(inst1.propriedade);
		
		Teste inst2 = inst1; //aponta para referencia de inst1
		
		inst1.propriedade = "propriedade alterada"; //alterando prop de inst1
		System.out.println(inst2.propriedade); //reflete em inst2
		
		//Continuação...
		hello.toUpperCase();
		System.out.println(hello);
		
		//Concat
		String s1 = "1";
		String s2 = s1.concat("2"); //re-assigned
		s2.concat("3"); //not re-assigned
		
		System.out.println(s2); //12
		

	}
	
	

}

class Teste{
	public String propriedade = "propiedade original";
}
