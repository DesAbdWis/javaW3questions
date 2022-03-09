package javaW3Basic;

public class Q82 {

	public static void main(String[] args) {
	
//	Write a Java program to find the largest element between first, last, and middle values from an array of integers (even length).
//	Go to the editor
//	Sample Output:
//
//		Original Array: [20, 30, 40, 50, 67]                                   
//		Largest element between first, last, and middle values: 67 

		
		int []arr= {20, 30, 401, 50, 67};
		
		int max_value=arr[0];
		
		if (max_value <=arr[arr.length-1] ){
			max_value=arr[arr.length-1];
		}if (max_value <=arr[arr.length/2]) {
			max_value=arr[arr.length/2];
		}
			
		System.out.println(max_value);
		
		
		
	}

}
