package com.cg.operators;

import java.util.Scanner;

public class LogicalOperators {

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		int d = s.nextInt();
		boolean res = (a > b && c < d);
		boolean res1 = (a > b || c < d);
		boolean res2 = !(a > b && c < d);
		
		System.out.println(res);
		System.out.println(res1);
		System.out.println(res2);
		s.close();
	}

}
