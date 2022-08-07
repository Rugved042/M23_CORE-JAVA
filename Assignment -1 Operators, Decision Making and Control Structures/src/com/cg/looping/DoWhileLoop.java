package com.cg.looping;

import java.util.Scanner;

public class DoWhileLoop {

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int  n=s.nextInt();
		int i = 1;
		do
		{
			System.out.println(i+" ");
			i++;
		}
		while(i <= n);

	}

}
