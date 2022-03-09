package javaW3Basic;

import java.util.Scanner;

public class Polindrom {

	public static void main(String[] args) {
//		Write a Java program to check if a positive number is a palindrome or not. 
		
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("sayi giriniz");
		int num=scan.nextInt();
		
		
        int tersHali = 0;
        int kalan, orjinalSayi;
        orjinalSayi = num;

        while( num != 0 )
        {
        kalan = num % 10;
        tersHali = tersHali * 10 + kalan;
        num  /= 10;
        }
		
        if (orjinalSayi == tersHali)
            System.out.println(orjinalSayi + " palindrome.");
        else
            System.out.println(orjinalSayi + " palindrome degil.");

		
	}

}
