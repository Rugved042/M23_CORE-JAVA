package com.cg.strings;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) 
	{
		String str = "Dhoni";
		
		Scanner s = new Scanner(System.in);
		String str1 = s.nextLine();
		//System.out.println(str.equals(str1));
		
		if(str.equals(str1))
		{
			System.out.println("Matching");
		}
		else
		{
			System.out.println("Not-Matching");
		}
	}

}
