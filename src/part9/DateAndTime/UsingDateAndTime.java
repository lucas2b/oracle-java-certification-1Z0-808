package part9.DateAndTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class UsingDateAndTime {

	public static void main(String[] args) {
		
		//changing Date
		
		LocalDate date = LocalDate.of(2030, Month.JANUARY, 10);
		System.out.println("date: " + date);
		
		date = date.plusDays(5).plusMonths(2);
		System.out.println("date re-assigned: " + date);
		System.out.println();
		
		//changing Time
		
		LocalTime time = LocalTime.of(15, 15);
		System.out.println("time: " + time);
		
		
		time = time.plusHours(1).plusMinutes(15);
		System.out.println("time re-assigned: " + time);
		System.out.println();
		
		//chaging LocalDateTime
		
		LocalDateTime dateTime = LocalDateTime.of(date, time);
		System.out.println("dateTime: " + dateTime);
		
		dateTime = dateTime.plusDays(10).plusMonths(1).plusHours(4).plusYears(10);
		System.out.println("dateTime re-assigned: " + dateTime);
		System.out.println();
		
		
		//Exam tricks
		LocalDate ld = LocalDate.of(2010, Month.APRIL, 1);
		ld.plusDays(40); //não re-assinalada
		System.out.println(ld);
		
//		ld.plusMinutes(10); //ficar esperto, não existe esse método para "Date"
		
		//Other Trick
		LocalTime lt = LocalTime.of(10, 10);
//		lt.plusDays(5); //ficar esperto, não existe esse método para "Time"
		
		

	}

}
