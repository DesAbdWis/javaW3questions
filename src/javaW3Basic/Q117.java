package javaW3Basic;

import java.util.Scanner;

public class Q117 {

	public static void main(String[] args) {
//		Write a Java program to compute the square root of an given integer. Go to the editor
//		Input a positive integer: 25
//		Square root of 25 is: 5

		
		Scanner scan=new Scanner(System.in);
		System.out.println("sayi giriniz");
		double num=scan.nextDouble();
		
		Math.sqrt(num);
		System.out.println(Math.sqrt(num));
	}

}
