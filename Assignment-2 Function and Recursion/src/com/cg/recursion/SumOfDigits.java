package com.cg.recursion;

import java.util.Scanner;

public class SumOfDigits {
	 static int sumofdigits(int n)
	    {
	        if (n == 0)
	        {
	        	return 0;
	        }
	        return (n % 10 + sumofdigits(n / 10));
	    }

	public static void main(String[] args) 
	{
		Scanner f = new Scanner(System.in);
		int a = f.nextInt();
		System.out.println(sumofdigits(a)); // Function Call
		f.close();

	}

}
