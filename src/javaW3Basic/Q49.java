package javaW3Basic;

import java.util.Scanner;

public class Q49 {

	public static void main(String[] args) {
//		Write a Java program to accept a number and check the number is even or not. 
//		Prints 1 if the number is even or 0 if the number is odd. Go to the editor
//		Sample Output:
//		Input a number: 20                                                     
//		1

		Scanner scan=new Scanner(System.in);
		System.out.println("sayi giriniz");
		int num=scan.nextInt();
		
		if (num%2==0) {
			System.out.println("1");
		}else {
			System.out.println("0");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	scan.close();	
	}

}
