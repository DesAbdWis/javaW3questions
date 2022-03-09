package javaW3Basic;

public class Q68 {

	public static void main(String[] args) {
//		Write a Java program to create a new string of 4 copies of the last 3 characters of the original string. 
//		The length of the original string must be 3 and above. Go to the editor
//		Sample Output:
//
//		3.03.03.03.0 

		String str="mustafa";
		String newStr=str.substring(str.length()-3);
		String copyStr=newStr.concat(newStr).concat(newStr).concat(newStr)	;
		
		
		System.out.println(copyStr);
	}

}
