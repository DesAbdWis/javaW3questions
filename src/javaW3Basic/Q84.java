package javaW3Basic;

public class Q84 {

	public static void main(String[] args) {
//		Write a Java program to take the last three characters from a given string and 
//		add the three characters at both the front and back of the string. 
//		String length must be greater than three and more. Go to the editor
//		
//		Test data: "Python" will be "honPythonhon"
//		Sample Output:

//		honPythonhon

		String str="Python";
		
		System.out.println(str.substring(3)+str+str.substring(3));
		
	}

}
