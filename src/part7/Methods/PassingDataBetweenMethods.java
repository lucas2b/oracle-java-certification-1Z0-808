package part7.Methods;

public class PassingDataBetweenMethods {

	public static void main(String[] args) {
		
		//copy-value
		String stringTeste = "String inicial";
		System.out.println(stringTeste);
		alteraString(stringTeste);
		System.out.println(stringTeste);
		System.out.println();
		
		
		//by-reference
		StringBuilder sb = new StringBuilder("Nova StringBuider");
		System.out.println(sb);
		
		alteraSb(sb); 
		
		System.out.println(sb); //valor alterado
		System.out.println();
		
		//teste tentando alterar a referência do obj passado
		
		Testando testando = new Testando();
		testando.nome = "lucas";
		System.out.println(testando.nome); //lucas
		alteraTestando(testando);
		System.out.println(testando.nome); //lucas
		
		
				
		
		

	}
	
	
	public static void alteraString(String param) {
		param = "String alterada";
	}
	
	public static void alteraSb(StringBuilder sb) {
		sb.append(" ---alterada");
	}
	
	public static void alteraTestando(Testando param) {
		param = null; //não altera o objeto do parâmetro
		param = new Testando(); //não altera o objeto do parâmetro
		param.nome = "caguei tudo"; //não altera o objeto do parâmetro
		
		//as operações que tentem mudar a referência do objeto passado (re-instanciação por ex) não afetam
		//o objeto original
	}

}

class Testando{
	public String nome;
}
