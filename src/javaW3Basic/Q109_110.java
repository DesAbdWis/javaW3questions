package javaW3Basic;

import java.util.Scanner;

public class Q109_110 {

	public static void main(String[] args) {
//		Write a Java program to check whether an given integer is a power of 4 or not.

		Scanner scan=new Scanner(System.in);
		System.out.println("sayi giriniz");
		int num=scan.nextInt();
		
 		System.out.println(num%4==0);
		
	}

}
