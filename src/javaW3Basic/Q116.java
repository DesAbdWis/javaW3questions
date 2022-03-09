package javaW3Basic;

public class Q116 {

	public static void main(String[] args) {

//		Write a Java program which iterates the integers from 1 to 100. 
//		For multiples of three print "Fizz" instead of the number and for the multiples of five print "Buzz". 
//		When number is divided by both three and five, print "fizz buzz".

		
		
			for (int num = 1; num <= 100; num++) {
				if (num%3==0 && num%5==0) {
					System.out.println(num+":fizz buzz");
				}else if (num%5==0) {
					System.out.println(num+":Buzz");
				}else if (num%3==0 ) {
					System.out.println(num+":fizz");

				}
			}
		
		
		
	}

}
