package javaW3Basic;

public class Q102 {

	public static void main(String[] args) {
//		Write a Java program to check if a specified array of integers contains 10's or 30's. 

		int[]arr= {10,10,10,3,4,7,10,20,30,3,2,7,10};
		
		int countTen=0;
		int countThirty=0;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]==10) {
				countTen++;
			}if (arr[i]==30) {
				countThirty++;
			}
			
			
		}System.out.println(countTen );
		System.out.println(countThirty);
		
		
		
	}

}
