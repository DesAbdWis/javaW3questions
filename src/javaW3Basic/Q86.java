package javaW3Basic;

import java.util.Scanner;

public class Q86 {

	public static void main(String[] args) {
//		Write a Java program start with an integer n,
//		divide n by 2 if n is even or multiply by 3 and add 1 if n is odd, 
//		repeat the process until n = 1. 
//		Go to the editor

		int ctr = 0;
		Scanner in = new Scanner(System.in);
		System.out.println("n gir");
		int n = in.nextInt();
		while (n != 1) {
//		    System.out.println(n);
			if (n % 2 == 0) {
				n = n / 2;
				ctr += 1;
			}
			else {
				n = (3 * n + 1) / 2;
			}
		}ctr += 1;

		System.out.println(ctr);
		in.close();
	}

}
