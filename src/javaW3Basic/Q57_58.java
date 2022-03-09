package javaW3Basic;

public class Q57_58 {

	public static void main(String[] args) {
//		Write a Java program to capitalize the first letter of each word in a sentence. Go to the editor
//		Sample Output:
//
//		Input a Sentence: the quick brown fox jumps over the lazy dog.         
//		The Quick Brown Fox Jumps Over The Lazy Dog.

		
		String str = "the quick brown fox jumps over the lazy dog.";
//		String str1=str.toUpperCase();
//		System.out.println(str1);
		
		int boslukYeri=str.indexOf(" ");
		
		System.out.print(str.substring(0,1).toUpperCase());
		System.out.print(str.substring(1,boslukYeri+1));
		System.out.print(str.substring(boslukYeri+1, boslukYeri+2).toUpperCase());
        System.out.println(str.substring(boslukYeri+2).toLowerCase());
		
        String  uzunCumle [] = str.split(" ");

        for (int i = 0; i < uzunCumle.length; i++) {
        	uzunCumle[i] = uzunCumle[i].toLowerCase();
            	if(uzunCumle.length-1 != i  ) { 
            			System.out.print(uzunCumle[i].substring(0,1).toUpperCase()+uzunCumle[i].substring(1)+" ");
            	}else {
            			System.out.print(uzunCumle[i].substring(0,1).toUpperCase()+uzunCumle[i].substring(1));
            		}
        }
          
	}
}
