package javaW3Basic;

public class Q81 {

	public static void main(String[] args) {
//		Write a Java program to swap the first and last elements of an array (length must be at least 1) and create a new array.
//		Go to the editor
//		Sample Output:
//
//		Original Array: [20, 30, 40]                                           
//		New array after swaping the first and last elements: [40, 30, 20] 

		
		
		int arr[]= {20, 30, 40, 30, 40, 30, 40, 30, 40, 30, 40, 30, 40, 30, 40, 30, 40, 30, 40, 30, 40, 30, 40};
			
		for (int i = arr.length-1; i >=0; i--) {
			System.out.print(arr[i]+ " ");
		}
		
	}

}
