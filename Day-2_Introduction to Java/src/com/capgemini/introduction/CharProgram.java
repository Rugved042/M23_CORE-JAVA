package com.capgemini.introduction;
//program on character input
import java.util.Scanner;

public class CharProgram {

	public static void main(String[] args) {
		//char x ='a';
		//compiler-time input
		Scanner s = new Scanner(System.in);
		System.out.println(" Enter the value of x : ");
		
		// run time input
		char x = s.next().charAt(0);
		System.out.println("the character is : "+x);

	}

}
