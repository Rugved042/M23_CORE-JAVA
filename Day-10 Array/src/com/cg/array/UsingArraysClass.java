package com.cg.array;

import java.util.Arrays; 

public class UsingArraysClass {
	
	static void sort(int...a)
	{
		//Arrays.sort defines Array is a class and sort is a method which sort the values
		Arrays.sort(a);
		for(int i = 0; i < a.length; i++)
		{
			System.out.println(a[i]+" ");
		}
	}

	public static void main(String[] args) {
		sort(21,5,64,89,74,23);
	}

}
