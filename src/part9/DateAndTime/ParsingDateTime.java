package part9.DateAndTime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class ParsingDateTime {

	public static void main(String[] args) {
		
		//String -> Date and Time
		//Conversão de String para Date/Time
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MM yyyy");
		LocalDate date = LocalDate.parse("15 02 2015", formatter); //Utilizando String com Formatter como PARSER
		
		LocalTime time = LocalTime.parse("11:33"); //Utilizando String com Formatter padrão como PARSER
		
		System.out.println(date);
		System.out.println(time);
		
		
		//Jogo do vai e vem
		
		//Date -> String
		String dataParseadaEFormatada = formatter.format(date); //Utilizando Formatter personalizado como MÁSCARA
		System.out.println(dataParseadaEFormatada);
		
		//String -> Date
		LocalDate parsedDate = LocalDate.parse(dataParseadaEFormatada, formatter); //Utilizando String com Formatter como PARSER
		System.out.println(parsedDate);
		System.out.println();
		
		//Mais exemplos do tipo Exam
		
		
		//Date -> String
		LocalDate myDate = LocalDate.of(2010, Month.MAY, 5);
		String myDateString = formatter.format(myDate);
		System.out.println(myDateString);
		
		//String -> Date
		LocalDate anotherDate = LocalDate.parse(myDateString, formatter);
		anotherDate.plusMonths(5).plusDays(5);
		System.out.println(formatter.format(anotherDate));
		

	}

}
