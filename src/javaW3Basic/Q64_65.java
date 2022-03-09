package javaW3Basic;

public class Q64_65 {

	public static void main(String[] args) {
//		Write a Java program to calculate the modules of two numbers without using any inbuilt modulus operator. 
//		Go to the editor
//		Sample Output:
//
//		Input the first number : 19                                            
//		Input the second number: 7                                             
//		5   

		int num1=19;
		int num2=7;
		
//		% kullanarak
		int result=num1%num2;
		System.out.println(result);
		
		
//		% kullanmadan 
		int remainder=num1/num2;
		int result2=num1-(remainder*num2);
		System.out.println(result2);
		
		
		
		
		
		
	}

}
