package javaW3Basic;

import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
//		 Write a Java program that takes two numbers as input 
//		 and display the product of two numbers. Go to the editor
//		 Test Data:
//		 Input first number: 25
//		 Input second number: 5
//		 Expected Output :
//		 25 x 5 = 125

		Scanner scan=new Scanner(System.in);
		System.out.println("ilk numarayi giriniz.");
		int num1=scan.nextInt();
		System.out.println("ikinci numarayi giriniz.");
		int num2=scan.nextInt();
		int result=num1*num2;
		System.out.println("25 x 5 = " +result);


	scan.close();	
	}

}
