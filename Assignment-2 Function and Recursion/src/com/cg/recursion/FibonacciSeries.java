package com.cg.recursion;

import java.util.Scanner;

public class FibonacciSeries {
	
	static int fibo(int n)
    {
    if (n <= 1)
       return n;
    return fibo(n-1) + fibo(n-2);
    }
	
	public static void main(String[] args) {
		Scanner f = new Scanner(System.in);
		int n = f.nextInt();
	    System.out.println(fibo(n));
	    f.close();

	}

}
