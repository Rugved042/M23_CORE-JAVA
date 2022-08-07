package com.cg.looping;

import java.util.Scanner;

public class PyramidPattern {

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int  rows=s.nextInt();
		for(int i = 1;i<=rows;i++)
		{
			for(int j = 1;j<=i;j++)
			{
				System.out.println("@ ");
			}
			System.out.println();
		}
		

	}

}
