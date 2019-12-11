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

	}

}
