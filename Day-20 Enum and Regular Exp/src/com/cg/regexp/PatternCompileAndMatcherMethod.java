package com.cg.regexp;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternCompileAndMatcherMethod {

	@SuppressWarnings("resource")
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		Pattern p = Pattern.compile("and");
		//Matcher m = p.matcher("Java is good language to learn and earn money and i like it to learn Java");
		
		//user input
		Matcher m = p.matcher(s.nextLine());
		
		//it will check "and" location until last and it will print
		while(m.find())
		{
			System.out.println("Paytern found from "+m.start()+ " to "+(m.end()-1));
		}
		s.close();
	}

}
