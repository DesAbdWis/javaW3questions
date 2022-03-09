package javaW3Basic;

public class Q56 {

	public static void main(String[] args) {
//		Write a Java program to find the number of integers within the range of two specified numbers and 
//		that are divisible by another number. Go to the editor
//		For example x = 5, y=20 and p =3, 
//		find the number of integers within the range x..y and that are divisible by p i.e. { i :x ≤ i ≤ y, i mod p = 0 }
//		Sample Output:5		

		int count=0;
		for (int i = 5; i < 21; i++) {
			if (i%3==0) {
				count++;
			}
		}
		System.out.println(count);

		
	}

}
