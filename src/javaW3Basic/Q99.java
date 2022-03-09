package javaW3Basic;

public class Q99 {

	public static void main(String[] args) {
//		Write a Java program to check 
//		if a specified number appears in every pair of adjacent element of a given array of integers. 

		int[] nums = {10, 20, 10, 20, 40, 20, 50};
		int count = 0;	
		int x = 20;  // aradigi spesifik rakam
		for(int i = 0; i < nums.length - 1; i++) {
	        if(nums[i] == x && nums[i + 1] == x)
			{
	        count = 1;	//arka arkaya iki tane 20 varsa count 1 dir diyoruz ve 1 durumuna false diyoruz, yani aradigimiz zdurum yok
			}        
	    }                                   
	    if (count==1)
	 	  {
	     	 System.out.printf( String.valueOf(false));	         
		  }
	 else
		   	  {
	     	 System.out.print( String.valueOf(true));	         
		  }		
		
		
		
	}

}
