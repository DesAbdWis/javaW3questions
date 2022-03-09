package javaW3Basic;

import java.util.Scanner;

public class Q72 {

	public static void main(String[] args) {
//		Write a Java program to create a new string taking first three characters from a given string. 
//		If the length of the given string is less than 3 use "#" as substitute characters. Go to the editor
//		Test Data: Str1 = " "
//		Sample Output:
//
//		###

		Scanner scan=new Scanner(System.in);
		System.out.println("kelime giriniz");
		String str=scan.next();
		
		int length=str.length();
		
			if (length>=3) {
				System.out.println(str.substring(0));
			}else if (length==1) {
				System.out.println(str.substring(0,1)+"##");
			}else if (length==2) {
				System.out.println(str.substring(0,2)+"#");
			}else {
				System.out.println("###");
			}
		
	scan.close();	
	}

}
