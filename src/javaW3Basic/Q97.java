package javaW3Basic;

public class Q97 {

	public static void main(String[] args) {
//	    Write a Java program to check if an array of integers contains a specified number next to each other or 
//		there are two same specified numbers separated by one element. Go to the editor SADECE ARKA ARKAYA OLMA DURUMUNA BAKTIM


		int[]arr= {3,10,20,10,17,10,20,33,76,76,2};

		int countSpecific=0;
		int countSame=0;
		
		for (int i = 0; i < arr.length-1; i++) {
			if (arr[i]==arr[(i+1)]) {
				countSame++;
			}if (arr[i]==arr[i+1]) {
				countSpecific++;
			}
		}
		System.out.println(countSame);
		System.out.println(countSpecific);

	}

}
