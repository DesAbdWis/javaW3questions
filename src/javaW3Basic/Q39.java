package javaW3Basic;

public class Q39 {

	public static void main(String[] args) {
//		Write a Java program to create and display unique three-digit number using 1, 2, 3, 4. 
//		Also count how many three-digit numbers are there. Go to the editor
//		Expected Output
//
//		123                                                      
//		124                                                      
//		...                                            
//		                                                   
//		431                                                      
//		432                                                      
//		Total number of the three-digit-number is 24

		int amount =0;
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 4; j++) {
				for (int k = 1; k <= 4; k++) {
					if (k!=i && k!=j && i!=j) { // uniqe dedigi icin bunu koyduk. rakamlari farkli olacak
						amount++;
						System.out.println(i+""+j+""+k+"");
						System.out.println("Total number of the three-digit-number is: " +amount);  
						// sayma asamalarini da ekrana yazdirir

					}
				}
			}
		}
		
			System.out.println("Total number of the three-digit-number is: " +amount);

		
	}

}
