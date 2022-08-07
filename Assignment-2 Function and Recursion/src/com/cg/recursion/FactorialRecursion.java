package com.cg.recursion;

import java.util.Scanner;

public class FactorialRecursion {
	
	static int fact(int a)
	{
		if(a ==  1)
		{
			return 1;
		}
		else
		{
			return (a * fact(a - 1));
		}
	}

	public static void main(String[] args) {
		Scanner f = new Scanner(System.in);
		int a = f.nextInt();
		System.out.println(fact(a)); // Function Call

	}

}
