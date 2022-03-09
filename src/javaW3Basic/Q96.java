package javaW3Basic;

public class Q96 {

	public static void main(String[] args) {
//		Write a Java program to check if there is a 10 in a given array of integers with a 20 somewhere later in the array. 

		
		int[]arr= {3,10,20,12,17,33,20,33,76,54,2};
		
		int count=0;
		
		for (int i = 0; i < arr.length-1; i++) {
			if (arr[i]==10 && arr[i+1]==20) {
				count++;
			}
		}System.out.println(count);
		
		
		
		
	}

}
