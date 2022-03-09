package javaW3Basic;

public class Q67 {

	public static void main(String[] args) {
//		Write a Java program to insert a word in the middle of the another string. 
//		Go to the editor
//		Insert "Tutorial" in the middle of "Python 3.0", so result will be Python Tutorial 3.0
//		Sample Output:
//
//		Python Tutorial 3.0

		String str="Tutorial";
		String strBuyuk="Python 3.0";
		
		System.out.println((strBuyuk.substring(0, (strBuyuk.length())/2)+" "+str+" "+strBuyuk.substring(5)));
		
		
		
//		int ortaStrBuyuk=(strBuyuk.length()-1)/2;
//		System.out.println(ortaStrBuyuk);
//		
//		char [] strBuyukChar = strBuyuk.toCharArray();
//		System.out.println(Arrays.toString(strBuyukChar));
//		
//		char [] strChar=str.toCharArray();
//		System.out.println(Arrays.toString(strChar));
//		
//		
//		System.out.println(strBuyukChar.length);
//		
		
		
	}

}
