package javaW3Basic;

import java.util.Arrays;

public class Q103_104 {

	public static void main(String[] args) {

//		Write a Java program to create a new array from a given array of integers, 
//		new array will contain the elements from the given array after the last element value 10.

		int[] nums = {11, 15, 13, 10, 45, 20};
	    System.out.println("Original Array: "+Arrays.toString(nums)); 
		

	    
			int first = nums[0];  //11 demis
				              
	    for(int i = 1; i < nums.length; i++)
	        nums[i - 1] = nums[i];
	    nums[nums.length - 1] = first; // sondaki elemani basa atmis yani ilk elemani sona at demis 
		System.out.println("New Array: "+Arrays.toString(nums)); 
		
			
	}

}
