package javaW3Basic;

public class Q71 {

	public static void main(String[] args) {
//		 Write a Java program to create the concatenation of the two strings except removing the first character of each string. 
//		 The length of the strings must be 1 and above. Go to the editor
//		 Test Data: 
//		 Str1 = Python
//		 Str2 = Tutorial
//		 Sample Output:
//		 ythonutorial

		String str1 = "Python";
		String str2 = "Tutorial";

		String newStr=str1.substring(1).concat(str2.substring(1));
		System.out.println(newStr);
		
		
		
		
		
		
	}

}
