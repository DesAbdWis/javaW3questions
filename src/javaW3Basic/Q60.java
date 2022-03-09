package javaW3Basic;

import java.util.Arrays;

public class Q60 {

	public static void main(String[] args) {
//		 Write a Java program to find the penultimate (next to last) word of a sentence. Go to the editor
//		 Sample Output:
//
//		 Input a String: The quick brown fox jumps over the lazy dog.
//		 Penultimate word: lazy

		
		String sentence="The quick brown fox jumps over the lazy dog.";
		String [] str=sentence.split(" ");
		
		System.out.println(Arrays.toString(str));
		
//		int genislik=str.length; bunu yazmasan da olur.
		
		System.out.println("Penultimate word: " + str[str.length-2]);
		
		
		
	}

}
