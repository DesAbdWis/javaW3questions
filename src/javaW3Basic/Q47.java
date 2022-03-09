package javaW3Basic;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Q47 {

	public static void main(String[] args) {
//		 Write a Java program to display the current date time in specific format. Go to the editor
//		 Sample Output:
//
//		 Now: 2017/06/16 08:52:03.066 

		LocalDate date=LocalDate.now();
		System.out.println(date);
		
		System.out.print("Now: ");
		DateTimeFormatter dtf1=DateTimeFormatter.ofPattern("YYYY/MM/dd"+" ");
		System.out.print(date.format(dtf1));
		
		LocalTime time=LocalTime.now();
		DateTimeFormatter dtf2=DateTimeFormatter.ofPattern("HH:mm:ss.ms");
		System.out.println(time.format(dtf2));
	}

}
