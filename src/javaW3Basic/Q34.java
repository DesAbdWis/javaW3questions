package javaW3Basic;

import java.util.Scanner;

public class Q34 {

	public static void main(String[] args) {
//		Write a Java program to compute the area of a hexagon(ALTIGEN). Go to the editor
//		Area of a hexagon = (6 * s^2)/(4*tan(π/6))
//		where s is the length of a side
//		Input Data:
//		Input the length of a side of the hexagon: 6
//		Expected Output
//		The area of the hexagon is: 93.53074360871938

		Scanner scan=new Scanner(System.in);
		System.out.println("altigenin bir kenarının değerini giriniz");
		int side=scan.nextInt();
		
		System.out.println("altigenin alanı = "+(6 * side*side)/(4*Math.tan(Math.PI/6)));
	
	scan.close();	
	}

}
