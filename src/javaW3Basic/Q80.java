package javaW3Basic;

import java.util.Arrays;

public class Q80 {

	public static void main(String[] args) {
//		Write a Java program to get the larger value between first and last element of an array (length 3) of integers . 
//		Go to the editor
//		Sample Output:
//
//		Original Array: [20, 30, 40]                                           
//		Larger value between first and last element: 40 

		
		int arr[]= {20, 30, 100};
		
		System.out.println("Arr: "+Arrays.toString(arr)); 
		int max_val = arr[0];
		if(arr[2] >= max_val)
			max_val = arr[2];
		System.out.println("Larger value between first and last element: "+max_val);
		}
		
		
		
	}


