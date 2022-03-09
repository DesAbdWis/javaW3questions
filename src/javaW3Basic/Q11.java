package javaW3Basic;

public class Q11 {
	
//	private static final double radius=7.5;
	static double radius=7.5;

		
	public static void main(String[] args) {
//		Write a Java program to print the area and perimeter of a circle. Go to the editor
//		Test Data:
//		Radius = 7.5
//		Expected Output
//		Perimeter is = 47.12388980384689
//		Area is = 176.71458676442586
//		System.out.println(Math.PI);		
		
		double perimeter=2*Math.PI*radius;
		double area=Math.PI*radius*radius;
		System.out.println("Perimeter is = "+perimeter);
		System.out.println("Area is = "+area);
		
	}

}
