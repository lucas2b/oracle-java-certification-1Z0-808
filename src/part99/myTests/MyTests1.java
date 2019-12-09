package part99.myTests;

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
		

	}

}

class Teste{
	public String saudacao = "oi";
}
