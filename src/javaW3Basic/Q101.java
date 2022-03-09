package javaW3Basic;

public class Q101 {

	public static void main(String[] args) {
//		Write a Java program to check if the number of 10 is greater than number to 20's in a given array of integers.

		int[]arr= {10,10,10,3,4,7,10,20,30,3,2,7,10};
			
			int countTen=0;
			int countTwenty=0;
			int i =0;
			for (i = 0; i < arr.length; i++) {
				 if (arr[i]==10) {
					countTen++;
				}if (arr[i]==20) {
					countTwenty++;
				}	
			}
			if (countTen>countTwenty) {
				System.out.println(true);
			}
			System.out.println("10 sayisi = "+countTen);
			System.out.println("20 sayisi = "+countTwenty);
	}

}
