package part3.basicControlFlow;

import java.util.Random;

public class SwitchStatement {

	public static void main(String[] args) {
		
		//------------------ Aula 3 - Switch Statement  ---------------------
		
		int dayOfWeek = 1;
		String dayOfWeekWord = null;
		
		switch (dayOfWeek) {
		case 0:
			dayOfWeekWord = "Monday";
			break;
		case 1:
			dayOfWeekWord = "Tuesday";
			break;
		case 2:
			dayOfWeekWord = "Wednesday";
			break;
		case 3:
			dayOfWeekWord = "Thursday";
			break;
		case 4:
			dayOfWeekWord = "Friday";
			break;
		default:
			break;
		}
		
		if(dayOfWeekWord != null)
			System.out.println(dayOfWeekWord);
		else
			System.out.println("Não associado");
		
		
		//Identificador de vogais
		
		Random random = new Random();
		int rand = random.nextInt(26) + 'a';
		
		System.out.println("letra:" + (char) rand + ", número:" + rand);
		
		switch(rand){
			case 'a': //switch-case accept letters
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				System.out.println("Vogal");
				break;
			default:
				System.out.println("Consoante");
		}
		
		
		//Examples that does not compile
		
		Integer inteiro = new Integer(3);
		switch(inteiro) {
			//case 'a':
		}
		
		System.out.println();
		
		//Teste com String
		
		String nome = "Lucas";
		switch (nome) {
			default:
				System.out.println("caiu no default");
			case "lucas":
				System.out.println("String é lucas");
			case "joao":
				System.out.println("String é joao");
			case "paulo":
				System.out.println("String é paulo");
				break;
		}
		
		System.out.println();
		
		String fruit = "mango";
        switch (fruit) {
            default:
                System.out.println("ANY FRUIT WILL DO");
            case "Apple":
                System.out.println("APPLE");
            case "Mango":
                System.out.println("MANGO");
            case "Banana":
                System.out.println("BANANA");
                break;
        }
        
        
        //Testando variavel final
        
        final byte b1 = 10;
        final Byte b2 = 10;
        
        
        final short s1 = 20;
        final Short s2 = 20;
        
        
        final int i1 = 30;
        final Integer i2 = 30;
        
        final Integer i3 = 30;
        
        final char c1 = 'a';
        
        final long l1 = 40;
        
        final String string = "a";
        
        
        // questao simulado
        byte var = 100;
        switch(var) {
            case 100:
                System.out.println("var is 100");
                break;
//            case 200:
//               System.out.println("var is 200");
//               break;
            default:
                System.out.println("In default");
        }

	}

}
