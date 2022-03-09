package javaW3Basic;

import java.util.Arrays;

public class Q78 {

	public static void main(String[] args) {
//		Write a Java program to test that a given array of integers of length 2 contains a 4 or a 7. 
//		Go to the editor
//		Sample Output:
//
//		Original Array: [5, 7]                                                 
//		true 

		int [] arr= {6,7};
		int [] arr2= {6,1,7,4};

		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.binarySearch(arr,7)==2);
		System.out.println(Arrays.equals(arr, arr2));
		
		if (arr[0]==4 || arr[1]==7) {
			System.out.println("true");
		}else {
			System.out.println("false");

		}
	}

}
