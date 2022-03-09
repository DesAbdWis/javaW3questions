package javaW3Basic;

public class Q15 {

	public static void main(String[] args) {
//		Write a Java program to swap two variables. Go to the editor
//		Click me to see the solution
		
	//bos kap kullanarak yapilma sekli
		int num1 =100;
		int num2=10;
		
		System.out.println("ilk once num1 = "+num1);
		System.out.println("ilk once num2 = "+num2);
		
		int gecici=num1;
		num1=num2;
		num2=gecici;
		
		System.out.println("degisimden sonra num1 = "+num1);
		System.out.println("degisimden sonra num2 = "+num2);
		
//bos kap kullanmadan yapilma sekli
		
		int num10=50;
		int num20=30;
		System.out.println("ilk once num10 = "+num10);
		System.out.println("ilk once num20 = "+num20);
		
		num10=num10+num20;
		num20=num10-num20;
		num10=num10-num20;

		System.out.println("degisimden sonra num10 = "+num10);
		System.out.println("degisimden sonra num20 = "+num20);
		
		
	}

}
