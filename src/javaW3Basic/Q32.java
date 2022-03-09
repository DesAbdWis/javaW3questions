package javaW3Basic;

import java.util.Scanner;

public class Q32 {

	public static void main(String[] args) {
//		Write a Java program to compare two numbers. Go to the editor
//		Input Data:
//		Input first integer: 25
//		Input second integer: 39
//		Expected Output
//
//		25 != 39                                                                          
//		25 < 39                                                                           
//		25 <= 39

		Scanner scan=new Scanner(System.in);
		System.out.println("ilk sayiyi giriniz");
		int num1=scan.nextInt();
		System.out.println("ikinci sayiyi giriniz");
		int num2=scan.nextInt();
		
		if (num1!=num2) {
			System.out.println("25 != 39");
		}if (num1<num2) {
			System.out.println("25 < 39" );
		}if(25 <= 39){
			System.out.println("25 <= 39");
		}
		
	scan.close();
	}

}
