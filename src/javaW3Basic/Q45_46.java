package javaW3Basic;


import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;


public class Q45_46 {


	public static void main(String[] args) {
//		Write a Java program to display the system time. Go to the editor
//		Sample Output:
//
//		Current Date time: Fri Jun 16 14:17:40 IST 2017 
		
//        System.out.println(LocalDate.now());
//        System.out.println(LocalDateTime.now());
//        System.out.println(LocalTime.now());
		
		LocalDate date=LocalDate.now();
		System.out.println(date);
		System.out.println(date.minusMonths(10));
		System.out.println(date.plusDays(10));
		System.out.println(date.minusDays(4));
		System.out.println(date.ofYearDay(2020, 300));
		
		LocalTime time= LocalTime.now();
		System.out.println(time + " burdaki zaman");
		System.out.println(date.plusDays(1));
		
		LocalTime zaman= LocalTime.now();
		DateTimeFormatter dtf2=DateTimeFormatter.ofPattern("SS-------mm---------HH");
		System.out.println(zaman.format(dtf2));
		
		LocalDate tarih=LocalDate.now();
		DateTimeFormatter dtf3 =DateTimeFormatter.ofPattern("YYYY===MM====dd");
 		System.out.println(tarih.format(dtf3));

		

		
	}

}
