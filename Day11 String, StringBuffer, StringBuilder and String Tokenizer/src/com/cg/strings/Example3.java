package com.cg.strings;

public class Example3 {

	public static void main(String[] args) 
	{
		String str = "Rugved Naik";
		String str1 = "Rugved Naik";
		
		String str2 = new String("Rugved Naik");
		String str3 = new String("Rugved Naik");

		System.out.println(str==str1);
		System.out.println(str2==str3);
		
		//if we use [equals] method then it will check data of variable and compare. 
		System.out.println(str2.equals(str3));

	}

}
