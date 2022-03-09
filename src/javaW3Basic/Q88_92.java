package javaW3Basic;

public class Q88_92 {

	public static void main(String[] args) {
		 
//		Write a Java program to count the number of even and odd elements in a given array of integers.
		


	int [] num = {3,4,1,6,8,9,3,5,6,8,9,3,5,6,8,9,3,5,6,8,9,3,5,6,8,9,3,5,6,8,9,3,5,6,8,9,3,5,6,8,6,8,9,3,5,6,8,6,8,9,3,5,6,8};
		
		int countCift=0;
		int countTek=0;

		for (int i = 0; i < num.length; i++) {
			if (num[i]%2==0) {
				countCift++;
			}if (num[i]%2!=0) {
				countTek++;
			}
			}
		System.out.println("tek olan sayilar ="+countTek);
		System.out.println("cift olan sayilar ="+countCift);

	}

}
