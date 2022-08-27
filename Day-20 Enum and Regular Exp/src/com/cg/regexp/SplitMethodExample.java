package com.cg.regexp;

import java.util.Scanner;
import java.util.regex.Pattern;

public class SplitMethodExample {

	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		String delimeter = "\t";
		Pattern p = Pattern.compile(delimeter,Pattern.CASE_INSENSITIVE);
		String res[] = p.split(str);
		for(String i:res)
		{
			System.out.print(i+" ");

		}
		s.close();

	}

}
