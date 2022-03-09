package javaW3Basic;

public class Q44 {

	public static void main(String[] args) {
//		Write a Java program that accepts an integer (n) and computes the value of n+nn+nnn. Go to the editor
//		Sample Output:
//
//		Input number: 5                                                        
//		5 + 55  + 555
		
		
		int n=5;
		String nnEski="55";
		String nnnEski="555";
		
		int nn=Integer.valueOf(nnnEski);
		int nnn=Integer.valueOf(nnnEski);
		
		System.out.println(n+nn+nnn);
		System.out.println(n +" + "+ nnEski+" + "+nnnEski);

		  System.out.printf("%d + %d%d  + %d%d%d\n", n, n, n, n, n, n);

	}

}
