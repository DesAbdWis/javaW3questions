package javaW3Basic;

public class Q105_106_107 {

	public static void main(String[] args) {
//		Write a Java program to check if an array of integers contains three increasing adjacent numbers.

		
			int arr[]= {11, 12, 13, 122, 4, 6};
			int count=0;
			for (int i = 1; i < arr.length-1; i++) {
				if (arr[i-1]<arr[i] && arr[i]+1==arr[i+1]) {
						count++;
				} 
			}System.out.println("arka arkaya artan uc rakam sayisi = "+count);
	}

}
