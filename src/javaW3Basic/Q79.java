package javaW3Basic;

import java.util.Arrays;

public class Q79 {

	public static void main(String[] args) {
//		Write a Java program to rotate an array (length 3) of integers in left direction. Go to the editor
//		Sample Output:
//
//		Original Array: [20, 30, 40]                                           
//		Rotated Array: [30, 40, 20]

		int arrOriginal []= {20, 30, 40};
		int rotatedArr []= {arrOriginal[arrOriginal.length-(arrOriginal.length-1)],arrOriginal[arrOriginal.length-1],arrOriginal[0]};
		System.out.println(Arrays.toString(arrOriginal));
		System.out.println(Arrays.toString(rotatedArr));

		
		
		
	}

}
