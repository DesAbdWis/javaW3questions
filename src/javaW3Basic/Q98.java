package javaW3Basic;

public class Q98 {

	public static void main(String[] args) {
//		Write a Java program to check 
//		if the value 20 appears three times and no 20's are next to each other in an given array of integers.
//		Go to the editor

		int []arr= {10,20,122,20,15,15,15,20,20,90,8,7,6,6,6,5,4,3,2,46};
			
		int twentyCounter=0;
		int nextCounter=0;
		
		for (int i = 0; i < arr.length-1; i++) {
			if (arr[i]==20) {
				twentyCounter++;
			}if (arr[i]==20&&arr[i+1]==20) {
				nextCounter++;
				
			}
		}System.out.println("20 sayisi = "+ twentyCounter+ " adet vardir");
		System.out.println("arka arkaya 20 sayisi = " +nextCounter);
	}

}
