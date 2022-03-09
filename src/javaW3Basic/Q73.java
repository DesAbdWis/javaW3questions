package javaW3Basic;

public class Q73 {

	public static void main(String[] args) {
//		Write a Java program to create a new string taking first and last characters from two given strings.
//		If the length of either string is 0 use "#" for missing character. Go to the editor
//		Test Data: str1 = "Python"
//		str2 = " "
//		Sample Output:
//
//		P#

		
		String str1="Python";
		String str2="ali";

		if (str1.length()>=1) {
			System.out.print(str1.charAt(0));
		}else {
			System.out.print("#");
		}
		
		
		if (str2.length()>=1) {
			System.out.println(str2.charAt(str2.length()-1));
		}else {
			System.out.println("#");
		}
		
	}

}
