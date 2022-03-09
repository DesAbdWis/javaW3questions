package javaW3Basic;

public class Q38 {
	static String sentence = "Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33";

		
	public static void main(String[] args) {
//		Write a Java program to count the letters, spaces, numbers and other characters of an input string. 
//		Go to the editor
//		Expected Output
//
//		The string is :  Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33
//		letter: 23                                               
//		space: 9                                                 
//		number: 10                                               
//		other: 6
		

		count(sentence);
				
			}
	
	public static void count(String sentence) {
		char[]ch = sentence.toCharArray();
		int letter=0;
		int space=0;
		int number=0;
		int other=0;
		
		for (int i =0; i <sentence.length(); i++) {
			if (Character.isLetter(ch[i])) {
				letter++;		
			}else if (Character.isSpaceChar(ch[i])) {
				space++;
			}else if (Character.isDigit(ch[i])) {
				number++;
			}else {
				other++;
			}
	}
		
//		System.out.println("Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33");
		System.out.println("letter: "+letter);
		System.out.println("space: "+space);
		System.out.println("number: "+number);
		System.out.println("other: "+other);
		
		}

}
