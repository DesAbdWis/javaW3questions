package javaW3Basic;

public class Q50 {
	
	
	static int num;
	
	public static void main(String[] args) {
//		Write a Java program to print numbers between 1 to 100 which are divisible by 3, 5 and by both. 
//		Go to the editor
//		Sample Output:
//
//		Divided by 3:                                                          
//		3, 6, 9, 12, 15, 18, 21, 24, 27, 30, 33, 36, 39, 42, 45, 48, 51, 54, 57
//		, 60, 63, 66, 69, 72, 75, 78, 81, 84, 87, 90, 93, 96, 99,              
//		                                                                       
//		Divided by 5:                                                          
//		5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55, 60, 65, 70, 75, 80, 85, 90, 
//		95,                                                                    
//		                                                                       
//		Divided by 3 & 5:                                                      
//		15, 30, 45, 60, 75, 90,
		beseBolunenler(num);
		uceBolunenler(num);
		uceVeBeseBolunenler(num);
			}
	public static void uceBolunenler(int num) {
		System.out.println("\n Divided by 3: ");	
		for (num = 1; num < 100; num++) {
			if (num%3==0) {
						System.out.print(num+"-");
				}
		}
    }
	public static void beseBolunenler(int num) {
		System.out.println("\n Divided by 5: ");
		for ( num= 1; num < 100; num++) {
			if (num%5==0) {
				System.out.print(num+"-");
			}

		}
	}
	public static void uceVeBeseBolunenler(int num) {
		System.out.println("\n Divided by 5 & 3: ");
		for ( num= 1; num < 100; num++) {
			if (num%5==0 && num%3==0 ) {
				System.out.print(num+"-");
			}

		}
	}
	
	
}
