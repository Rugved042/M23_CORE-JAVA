package com.cg.lambdaexpr;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Comparable_Lambda {

	public static void main(String[] args) 
	{
		Comparator<String> obj = (s1,s2) -> Integer.compare(
				s1.length(),s2.length());
		String str[] = {"Sumit","Rugved_Naik","Akshay","Viren","Vaibhav"};
		Collections.sort(Arrays.asList(str),obj);
		for(String i:str)
		{
			System.out.print(i+ " ");
		}
	}

}
