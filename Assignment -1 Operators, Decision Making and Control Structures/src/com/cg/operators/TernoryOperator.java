package com.cg.operators;

import java.util.Scanner;

public class TernoryOperator {

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();

		boolean res = (a > b)?true:false;
		
		System.out.println(res);
		s.close();

	}

}
