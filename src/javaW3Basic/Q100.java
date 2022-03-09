package javaW3Basic;

import java.util.Arrays;

public class Q100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] nums1 = {10, 11, 10, 20, 43, 20, 50};
		int[] nums2 = {10, 13, 11, 20, 44, 30, 50};
		
		System.out.println("Array1: "+Arrays.toString(nums1)); 
		System.out.println("Array2: "+Arrays.toString(nums2)); 
		
		int ctr = 0;
	    
	    for(int i = 0; i < nums1.length; i++) {
	        if(Math.abs(nums1[i] - nums2[i])<= 1 && nums1[i] != nums2[i])
	            ctr++;
	    }
	                    
	    System.out.printf("Number of elements: "+ctr);
		System.out.printf("\n");	 
		

	}

}
