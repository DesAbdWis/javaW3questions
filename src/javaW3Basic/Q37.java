package javaW3Basic;

public class Q37 {

	static String sentence ="The quick brown fox";
	static String sentence2=sentence.toLowerCase();
	
	public static void main(String[] args) {
//		Write a Java program to reverse a string. Go to the editor
//		Input Data:
//		Input a string: The quick brown fox
//		Expected Output
//
//		Reverse string: xof nworb kciuq ehT

		
		reverseString(sentence2);
	}

	public static void reverseString(String sentence2) {
		
				for(int i = sentence2.length()-1; i >= 0; i--) {
					System.out.print(sentence2.charAt(i));
				}			

	}
	
}
