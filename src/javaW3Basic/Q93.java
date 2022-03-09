package javaW3Basic;

public class Q93 {

	public static void main(String[] args) {
//		Write a Java program to test 
//		if an array of integers contains an element 10 next to 10 or an element 20 next to 20, but not both.

		int[] nums = {10, 2, 10, 10, 10, 2, 4, 20, 20, 20, 20, 20, 20};
		int count10=0;
		int count20=0;
		
		
		for (int i = 0; i < nums.length-1; i++) {
			if (nums[i]==10 && nums[i+1]==10) {
				count10++;
			}if (nums[i]==20 && nums[i+1]==20) {
				count20++;
			}
		}
		System.out.println(("arka arkaya 10 var mi = ")+(count10!=0));
		System.out.println(("arka arkaya 20 var mi = ")+(count20!=0));
		System.out.println(count10 + " adet arka arkaya 10 var" );
		System.out.println(count20 + " adet arka arkaya 20 var" );

	}

}
