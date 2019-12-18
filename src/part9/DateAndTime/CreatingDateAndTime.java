package part9.DateAndTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class CreatingDateAndTime {

	public static void main(String[] args) {
		
		
		System.out.println("Local Date: " + LocalDate.now());
		System.out.println("Local Time: " + LocalTime.now());
		System.out.println("Local Date and Time: " +  LocalDateTime.now());
		System.out.println();
		
		//Criando Data (apenas)
		
		LocalDate localDate = LocalDate.of(1994, Month.AUGUST, 12);
		System.out.println("localDate: " + localDate);
		
		
		//Criando Hora
		
		LocalTime localTime = LocalTime.of(23, 30);
		System.out.println("localTime: " + localTime);
		
		//Junção da Data com Hora
		LocalDateTime localDateTime = LocalDateTime.of(localDate, localTime);
		System.out.println("localDateTime: " + localDateTime);

	}

}
