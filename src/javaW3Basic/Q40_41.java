package javaW3Basic;

import java.util.Scanner;

public class Q40_41 {

	public static void main(String[] args) {
//		Write a Java program to print the ascii value of a given character. Go to the editor
//		Expected Output
//
//		The ASCII value of Z is :90

		Scanner scan=new Scanner(System.in);
		System.out.println("ascii degerini girmek istediginiz karakteri giriniz");
		char ch=scan.next().charAt(0);
		int ascii=ch;
		System.out.println("The ASCII value of Z is :" +ascii);
		
		
	scan.close();	
	}

}
