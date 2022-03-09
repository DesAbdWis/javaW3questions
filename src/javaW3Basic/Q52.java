package javaW3Basic;

import java.util.Scanner;

public class Q52 {

	public static void main(String[] args) {
		
//		Write a Java program 
//		to calculate the sum of two integers and return true if the sum is equal to a third integer.
//		Go to the editor
//		Sample Output:
//
//				Input the first number : 5                                             
//				Input the second number: 10                                            
//				Input the third number : 15                                            
//				The result is: true

		Scanner scan=new Scanner(System.in);
		System.out.println("uc numara giriniz");
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		int num3=scan.nextInt();

		if ((num1+num2)==num3) {
			System.out.println("True");
		}else {
			System.out.println("False");

		}
		
		
		scan.close();
	}

}
