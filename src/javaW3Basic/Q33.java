package javaW3Basic;

import java.util.Scanner;

public class Q33 {

	public static void main(String[] args) {
//		Write a Java program and compute the sum of the digits of an integer. Go to the editor
//		Input Data:
//		Input an integer: 25
//		Expected Output
//
//		The sum of the digits is: 7

		Scanner scan=new Scanner(System.in);
		System.out.println("bir sayi giriniz");
		int num=scan.nextInt();
		
		int sum=num%10 + num/10;
		System.out.println("The sum of the digits is: "+sum);
	
		scan.close();
		
	}

}
