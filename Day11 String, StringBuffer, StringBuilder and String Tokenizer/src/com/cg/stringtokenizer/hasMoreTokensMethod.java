package com.cg.stringtokenizer;

import java.util.StringTokenizer;

public class hasMoreTokensMethod {

	public static void main(String[] args) 
	{
		//StringTokenizer st = new StringTokenizer("Let's,try,this",",");
		StringTokenizer st = new StringTokenizer("Let's try this");

		while(st.hasMoreTokens())
		{
			System.out.println(st.nextToken());
		}
	}

}
