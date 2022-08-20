package com.cg.strings;

import java.util.Scanner;

public class LenghtOfString {

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		
		//By using lenght funcion 
		//System.out.println(str.length());
		
		
		//lenght by without using lenght function
		int lenght = 0;
		for(char c : str.toCharArray())
		{
			lenght++;
		}
		System.out.println(lenght);
		s.close();

	}

}
