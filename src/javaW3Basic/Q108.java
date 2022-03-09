package javaW3Basic;

import java.util.Scanner;

public class Q108 {

	public static void main(String[] args) {
//		Write a Java program to add all the digits of a given positive integer until the result has a single digit.

		Scanner scan=new Scanner(System.in);
		System.out.println("sayi giriniz");
		int num=scan.nextInt();
		
		int num1=num%10;
		int num2=num/10;
		int result=num1+num2;
		if (result>9) {
			System.out.println("sayiyi kucult");
		}else if (result<=0) {
			System.out.println("sayiyi buyuk giriniz");
		}else {
			System.out.println("sayi tamam;rakamlaritoplami = "+result);
			System.out.println("sayinin kendisi; tamam = "+num);

		}
		
		
	}

}
