package javaW3Basic;

public class Q61 {

	public static void main(String[] args) {
//		Write a Java program to reverse a word. Go to the editor
//		Sample Output:
//
//		Input a word: dsaf
//  	Reverse word: fasd

		
		String str="dsaf";
		
		for (int i = str.length()-1; i >=0; i--) {
			System.out.print(str.charAt(i));
		}
		
		
	}

}
