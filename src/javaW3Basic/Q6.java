package javaW3Basic;

import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
//		Write a Java program to print the sum (addition), multiply,
//		subtract, divide and remainder of two numbers. Go to the editor
//		Test Data:
//		Input first number: 125
//		Input second number: 24
//		Expected Output :
//		125 + 24 = 149
//		125 - 24 = 101
//		125 x 24 = 3000
//		125 / 24 = 5
//		125 mod 24 = 5

		Scanner scan=new Scanner(System.in);
		System.out.println("ilk numarayi giriniz");
		int num1=scan.nextInt();
		System.out.println("ikinci numarayi giriniz");
		int num2=scan.nextInt();
		System.out.println("125 + 24 = "+ (num1+num2));
		System.out.println("125 - 24 = "+ (num1-num2));
		System.out.println("125 * 24 = "+ num1*num2);
		System.out.println("125 / 24 = "+ num1/num2);
		System.out.println("125 mod 24 = "+ num1%num2);

		
		scan.close();
	}

}
