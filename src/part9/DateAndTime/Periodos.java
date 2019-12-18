package part9.DateAndTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;

public class Periodos {

	public static void main(String[] args) {
		
		LocalDate start = LocalDate.of(2019, Month.JANUARY, 1);
		LocalDate end = LocalDate.of(2019, Month.APRIL, 1);
		
		
		cleanAnimalCagePeriod(start, end); 
		System.out.println();
		
		//período
		
		Period period = Period.ofWeeks(1); //período de 1 semana
		System.out.println("Período de 1 semana: " + start.plus(period));
		System.out.println("LocalDateTime acrescido de 1 semana: " + LocalDateTime.now().plus(period));
		
		
		//ATENÇÃO! EXCEÇÃO
//		System.out.println(LocalTime.now().plus(period)); //tentativa de soma de 1 semana em uma "hora"
		
		
		//Utilizando período personalizado
		System.out.println();
		System.out.println("period: ");
		cleanAnimalCagePersonalizedPeriod(start, end, period);
		
		//chaining methods wrong way
		System.out.println();
		Period yearAndMonth = Period.ofYears(1).ofMonths(1); //considera apenas o último método
		System.out.println(yearAndMonth);
		System.out.println();
		
		//chaining methods correct way
		Period yearAndMonth2 = Period.of(1, 1, 1);
		System.out.println(yearAndMonth2);
		
		
		
		

	}
	
	
	public static void cleanAnimalCagePeriod(LocalDate startDate, LocalDate endDate) {
		
		while(startDate.isBefore(endDate)) {
			System.out.println("Need to clean the cage on date : " + startDate);
			startDate = startDate.plusMonths(1); //retorna um novo LocalDate, portanto startDate não é alterado
		}
		
	}
	
	
public static void cleanAnimalCagePersonalizedPeriod(LocalDate startDate, LocalDate endDate, Period period) {
		
		while(startDate.isBefore(endDate)) {
			System.out.println("Need to clean the cage on date : " + startDate);
			startDate = startDate.plus(period); //retorna um novo LocalDate, portanto startDate não é alterado
		}
		
	}

}
