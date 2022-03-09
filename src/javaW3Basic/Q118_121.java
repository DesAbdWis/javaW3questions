package javaW3Basic;

import java.util.Arrays;

public class Q118_121 {

	public static void main(String[] args) {
//		Write a Java program to check if a given string has all unique characters.
		
		String str="abzttrb";
		char[]arr=str.toCharArray();
		Arrays.sort(arr);
		
		for (int i = 1; i < arr.length; ++i) {
			if (arr[i]!=arr[i-1]) {
			System.out.println("unique");
			}
		}		

		}
}
