package javaW3Basic;

public class Q83 {

	public static void main(String[] args) {
//		 Write a Java program to multiply corresponding elements of two arrays of integers. Go to the editor
//		 Sample Output:
//
//		 Array1: [1, 3, -5, 4]                                                  
//		                                                                        
//		 Array2: [1, 4, -5, -2]                                                 
//		                                                                        
//		 Result: 1 12 25 -8

		String result = "";
		   int[] arr1 = {1, 3, -5, 4};
		   int[] arr2 = {1, 4, -5, -2};


	       for (int i = 0; i < arr1.length; i++) {
					int num1 = arr1[i];
					int num2 = arr2[i];
					result += Integer.toString(num1 * num2) + " "; 
				}
			System.out.println("\nResult: "+result);     
	}

}
