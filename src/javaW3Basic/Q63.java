package javaW3Basic;

import java.util.Scanner;

public class Q63 {

	public static void main(String[] args) {
//		Write a Java program that accepts two integer values from the user and return the larger values.
//				However if the two values are the same, return 0 
//				and return the smaller value if the two values have the same remainder when divided by 6. 
//				Go to the editor
//				Sample Output:
//
//				Input the first number : 12                                            
//				Input the second number: 13                                            
//				Result: 13
		Scanner scan=new Scanner(System.in);
		System.out.println("sayi giriniz");
		int num1=scan.nextInt();
		System.out.println("sayi giriniz");
		int num2=scan.nextInt();
		
			 if(num1==num2) {
				System.out.println("0");
			}else if(num1%6==num2%6) {
					if (num1>num2) {
					System.out.println(num1);
					}else {
					System.out.println(num2);
				}
			}else {
				System.out.println(num2);
			}
		
		
		
		
	}

}
