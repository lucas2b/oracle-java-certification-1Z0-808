package part9.DateAndTime;

import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class ExamQuestions {

	public static void main(String[] args) {
		
		//Question 1 (junho = 6)
			//D, F
		
		//Question 2
			//B. (errada)
			//D. (correta) pois Date não pode adiciona Hours (terceira linha)
		
		//Question 3
			//F
		
		//Question 4
			//B
		
		//Question 5
			//Resolução 
			LocalDateTime d = LocalDateTime.of(2015, 5, 10, 11, 22, 33);
										     //ano,mês,dia,hora,minuto,segundos
			Period p = Period.of(1, 2, 3);
							   //ano, mês, dia
			d = d.minus(p); //2014, 3, 8
						    //8 de Março de 2014
			DateTimeFormatter f = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT); //11.22.33 ou 11:22am
			System.out.println(d.format(f)); //11:22
		
			//E (correta)
			
		//Question 6
			//B.
		
	}

}
