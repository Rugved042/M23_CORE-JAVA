package com.cg.decisionmaking;

import java.util.Scanner;

public class switchCase {

	public static void main(String[] args) 
	{
		//Switch Case
		Scanner s = new Scanner(System.in);
		int a =s.nextInt();
		switch(a)
		{
		case 1:
			System.out.println("Guru");
			break;
			
		case 2:
			System.out.println("Akash");
			break;
			
		case 3:
			System.out.println("Akshay");
			break;
			
		default:
			System.out.println("enter valid option");
		}
		s.close();
	}
}