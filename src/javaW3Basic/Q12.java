package javaW3Basic;

import java.util.Scanner;

public class Q12 {

	public static void main(String[] args) {
//		Write a Java program that takes three numbers as input to calculate
//		and print the average of the numbers. 

		Scanner scan=new Scanner(System.in);
		System.out.println("birinci sayiyi giriniz");
		int num1=scan.nextInt();
		System.out.println("ikinci sayiyi giriniz");
		int num2=scan.nextInt();
		System.out.println("ucuncu sayiyi giriniz");
		int num3=scan.nextInt();
		
		System.out.println((num1+num2+num3)/3);
		
		
	scan.close();	
	}

}
