package javaW3Basic;

import java.util.Scanner;

public class Q55 {
	
	
	
	public static void main(String[] args) {
//		 Write a Java program to convert seconds to hour, minute and seconds. Go to the editor
//		 Sample Output:
//
//		 Input seconds: 86399                                                   
//		 23:59:59
		
		Scanner scan=new Scanner(System.in);
		System.out.println("saniye miktarini giriniz");
		int time=scan.nextInt();
		
		int saat=time/3600;
		int dakika=(time%3600)/60;
		int second=(time%3600)%60;
		System.out.println(saat +":"+dakika+":"+second);
		scan.close();
	}
	
	
}
