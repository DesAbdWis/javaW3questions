package javaW3Basic;

public class Q85 {

	public static void main(String[] args) {
//		Write a Java program to check if a string starts with a specified word. Go to the editor
//		Sample Data: 
//		string1 = "Hello how are you?"
//		Sample Output:
//
//		true

		
		String str = "Hello how are you?";
		System.out.println(str.startsWith("Hello"));
		System.out.println(str.startsWith(str));
		System.out.println(str.startsWith("hello"));

	}

}
