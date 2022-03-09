package javaW3Basic;

import java.util.Arrays;

public class Q77 {

	public static void main(String[] args) {
//		Write a Java program to create a new array of length 2 from two arrays of integers with three elements
//		and the new array will contain the first and last elements from the two arrays. 
//		Go to the editor
//		Test Data: array1 = 50, -20, 0
//		array2 = 5, -50, 10
//		Sample Output:
//
//		Array1: [50, -20, 0]                                                   
//		Array2: [5, -50, 10]                                                   
//		New Array: [50, 10]

		
		int [] arr1= {50, -20, 0};
		int [] arr2= {5, -50, 10};
		
		int [] newArr= {arr1[0],arr2[arr2.length-1]};
		System.out.println(Arrays.toString(newArr));
		
		
	}

}
