package javaW3Basic;

import java.util.Scanner;

public class Q35 {

	public static void main(String[] args) {
//		Write a Java program to compute the area of a polygon. Go to the editor
//		Area of a polygon = (n*s^2)/(4*tan(π/n))
//		where n is n-sided polygon and s is the length of a side
//		
//		Input Data:
//		Input the number of sides on the polygon: 7
//		Input the length of one of the sides: 6
//		Expected Output
//
//		The area is: 130.82084798405722

		Scanner scan=new Scanner(System.in);
		System.out.println("kenar sayisini giriniz");
		int side = scan.nextInt();
		System.out.println("kenar uzunlugunu giriniz");
		int length = scan.nextInt();
		
		
		double result=(length*(side*side))/(4.0*Math.tan((Math.PI/length)));
		System.out.println(result);
		
		
		
		
		
	scan.close();	
	}

}
