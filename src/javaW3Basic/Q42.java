package javaW3Basic;

import java.util.Scanner;

public class Q42 {

	public static void main(String[] args) {
//		Write a Java program to input and display your password. Go to the editor
//		Expected Output
//
//		Input your Password:                                                    
//		Your password was: abc@123
		
		Scanner scan=new Scanner(System.in);
		System.out.println("input your password");
		String passWord=scan.next();
		System.out.println("Your password was: " +passWord);
		

			scan.close();
	}

}
