package com.cg.function;

import java.util.Scanner;

public class Factorial {
	//Function Definition
	static int fact(int a)
	{
		int fac = 1;
		for(int i=1;i<=a;i++)
		{
			fac = fac * i;
		}
		return fac;
	}

	public static void main(String[] args) 
	{
		Scanner f = new Scanner(System.in);
		int a = f.nextInt();
		System.out.println(fact(a)); // Function Call
	}

}
