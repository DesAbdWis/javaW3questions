package javaW3Basic;

import java.util.Scanner;

public class Q62 {

	public static void main(String[] args) {
//		Write a Java program that 
//		accepts three integer values and 
//		return true if one of them is 20 or more 
//		and less than the substractions of others.
//				
//		Go to the editor
//				Sample Output:
//				Input the first number : 15                                            
//				Input the second number: 20                                            
//				Input the third number : 25                                            
//				false
		Scanner scan=new Scanner(System.in);
		System.out.println("sayi giriniz");
		int num1=scan.nextInt();
		System.out.println("sayi giriniz");
		int num2=scan.nextInt();
		System.out.println("sayi giriniz");
		int num3=scan.nextInt();
		
		if (num1>=20 && num1<num2-num3) {
			System.out.println("true");
		}else if (num2>=20 && num2<num1-num3) {
			System.out.println("true");
		}else if (num3>=20 && num3<num1-num2) {
			System.out.println("true");
		}else {
			System.out.println("false");

		}
		
		
	}

}
