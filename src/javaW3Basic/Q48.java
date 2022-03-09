package javaW3Basic;

public class Q48 {
	static int num1;
	public static void main(String[] args) {
//		Write a Java program to print the odd numbers from 1 to 99. Prints one number per line. Go to the editor
//		Sample Output:
//
//		1                                                                      
//		3                                                                      
//		5                                                                      
//		7                                                                      
//		9                                                                      
//		11                                                                     
//		....                                                                                                                                         
//		91                                                                     
//		93                                                                     
//		95                                                                     
//		97                                                                     
//		99 

		oddNumbers(num1);
	
	
	}

	public static void oddNumbers(int num1) {
		
		for (num1 = 1; num1 < 100; num1++) {
			if (num1 % 2==1) {
				System.out.print(num1+ " ");
			}
		}
	}
	}
