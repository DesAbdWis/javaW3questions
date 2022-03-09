package javaW3Basic;

import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {
//		 Write a Java program that takes a number as input and prints 
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
		
		System.out.println("8 x 1 = " +num1*1);
		System.out.println("8 x 2 = " +num1*2);
		System.out.println("8 x 3 = " +num1*3);
		System.out.println("8 x 4 = " +num1*4);
		System.out.println("8 x 5 = " +num1*5);
		System.out.println("8 x 6 = " +num1*6);
		System.out.println("8 x 7 = " +num1*7);
		System.out.println("8 x 8 = " +num1*8);
		System.out.println("8 x 9 = " +num1*9);
		System.out.println("8 x 10 = " +num1*10);

		
		scan.close();
	}

}
