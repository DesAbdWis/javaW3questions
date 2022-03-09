package javaW3Basic;

public class Q76 {

	public static void main(String[] args) {
//		Write a Java program to test if the first and the last element of two array of integers are same.
//		The length of the array must be greater than or equal to 2. Go to the editor
//		Test Data: array1 = 50, -20, 0, 30, 40, 60, 12
//		array2 = 45, 20, 10, 20, 30, 50, 11
//		Sample Output:
//
//		false

		int arr[]= {50, -20, 0, 30, 40, 60, 12};
		int arr2[]= {45, 20, 10, 20, 30, 50, 50};
		
		System.out.println(arr[1]==arr2[arr2.length-1]);
		System.out.println(arr2[arr2.length-1]==arr[0]);
		
	}

}
