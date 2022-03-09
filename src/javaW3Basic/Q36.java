package javaW3Basic;

import java.util.Scanner;

public class Q36 {
		
		static double radius=6371.01;
	
	public static void main(String[] args) {
//		Write a Java program to compute the distance between two points on the surface of earth. Go to the editor
//		Distance between the two points [ (x1,y1) & (x2,y2)]
//		d = radius * arccos(sin(x1) * sin(x2) + cos(x1) * cos(x2) * cos(y1 - y2))
//		Radius of the earth r = 6371.01 Kilometers
//		Input Data:
		
//		Input the latitude of coordinate 1: 25
//		Input the longitude of coordinate 1: 35
//		Input the latitude of coordinate 2: 35.5
//		Input the longitude of coordinate 2: 25.5
//		Expected Output
//
//		The distance between those points is: 1480.0848451069087 km 
		Scanner scan=new Scanner(System.in);
		System.out.println("x1'i giriniz");
		double x1=scan.nextDouble();
		System.out.println("x2'i giriniz");
		double x2=scan.nextDouble(); 
		System.out.println("y1'i giriniz");
		double y1=scan.nextDouble(); 
		System.out.println("y2'i giriniz");
		double y2=scan.nextDouble(); 
		
		System.out.println(countDistance(x1,x2,y1,y2));
		
	scan.close();	
	}

	public static double countDistance(double x1,double x2,double y1,double y2) {
		return radius*(Math.acos((Math.sin(x1)*Math.sin(x2)+Math.cos(x1)*Math.cos(x2)*Math.cos(y1-y2))));
	}
	
	
}
