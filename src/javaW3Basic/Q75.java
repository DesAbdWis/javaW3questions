package javaW3Basic;

public class Q75 {

	public static void main(String[] args) {
//		Write a Java program to test if the first and the last element of an array of integers are same.
//		The length of the array must be greater than or equal to 2. Go to the editor
//		Test Data: array = 50, -20, 0, 30, 40, 60, 10
//		Sample Output:
//
//		false

		int arr[]= {100,-20,0,30,40,60,100};
		
		System.out.println(arr[0]==arr[arr.length-1]);
	}

}
