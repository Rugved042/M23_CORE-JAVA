package com.cg.strings;

import java.util.Scanner;

public class UpperAndLowerCaseMethod {

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		s.close();

	}

}
