package javaW3Basic;

import java.util.Scanner;

public class Q13 {

	public static void main(String[] args) {
//		Write a Java program to print the area and perimeter of a rectangle. Go to the editor
//		Test Data:
//		Width = 5.5 Height = 8.5
//
//		Expected Output
//		Area is 5.6 * 8.5 = 47.60
//		Perimeter is 2 * (5.6 + 8.5) = 28.20

		Scanner scan=new Scanner(System.in);
		System.out.println("yukseklik giriniz");
		double height=scan.nextDouble();
		System.out.println("genisligi giriniz");
		double weight=scan.nextDouble();
		
		double area = height*weight;
		double perimeter = 2*(weight*height);
		
		System.out.println("Area is = "+area);
		System.out.println("Perimeter is = "+perimeter);
		
		
		
		
		
		scan.close();
	}

}
