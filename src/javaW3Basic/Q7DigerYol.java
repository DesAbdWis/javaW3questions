package javaW3Basic;

import java.util.Scanner;

public class Q7DigerYol {

	public static void main(String[] args) {
//		Write a Java program that takes a number as input and prints 
//		 its multiplication table upto 10. Go to the editor
//		 Test Data:
//		 Input a number: 8
//		 Expected Output :
//		 8 x 1 = 8
//		 8 x 2 = 16
//		 8 x 3 = 24
//		 ...
//		 8 x 10 = 80


		Scanner scan=new Scanner(System.in);
		System.out.println("Sayi giriniz");
		int num1=scan.nextInt();
		
		for (int i = 1; i < 11; i++) {
			System.out.println("8 x "+i+" = "+(8*i));
			scan.close();
		}
		
	}

}
