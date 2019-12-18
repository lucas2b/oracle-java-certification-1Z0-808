package part9.DateAndTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class FormattingDayAndTime {

	public static void main(String[] args) {
		
		LocalDate 		  date = LocalDate.of(2010, Month.APRIL, 15);
		LocalTime 		  time = LocalTime.of(11, 22, 33);
		LocalDateTime dateTime = LocalDateTime.of(date, time);
		
		
		//Formatadores pré-definidos
		System.out.println("Formatadores DateTime:");
		System.out.println(dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE)); //Data
		System.out.println(dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME)); //DataTHora
		System.out.println(dateTime.format(DateTimeFormatter.ISO_LOCAL_TIME)); //Hora
		System.out.println();
		
		//Troca a máscara da data
		DateTimeFormatter shortFomatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
		DateTimeFormatter mediumFomatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
		
		System.out.println("Formatadores de máscara:");
		System.out.println("short: " + shortFomatter.format(dateTime));
		System.out.println("medium: " + mediumFomatter.format(dateTime));
		
//		System.out.println("exceção: " + mediumFomatter.format(time)); //o Formatter é para Localized Date, não Time
		
		
		

	}

}
