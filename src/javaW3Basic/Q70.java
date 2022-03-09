package javaW3Basic;

public class Q70 {

	public static void main(String[] args) {
//		Write a Java program to create a string in the form 
		
//		short_string + long_string + short_string from two strings.
//		
//		The strings must not have the same length. Go to the editor
//		Test Data: 
//		Str1 = Python
//		Str2 = Tutorial
//		Sample Output:
//
//		PythonTutorialPython

		String str1="Python";
		String str2="Tutorial";
		
		
		String newStr=str1.concat(str2).concat(str1);
		
		System.out.println(newStr);
		
		
		
		
		
	}

}
