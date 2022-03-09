package javaW3Basic;

import java.util.Scanner;

public class Q53 {

	public static void main(String[] args) {

//Write a Java program that 
//accepts three integers from the user and 
//return true 
//		if the second number is greater than first number and
//		third number is greater than second number.
//		If "abc" is true second number does not need to be greater than first number.
//		Go to the editor
//				
//				Sample Output:
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
		
		if (num2>num1 && num3>num2) {
			
		}
		
		
		
		
		
		
		scan.close();
	}

}
