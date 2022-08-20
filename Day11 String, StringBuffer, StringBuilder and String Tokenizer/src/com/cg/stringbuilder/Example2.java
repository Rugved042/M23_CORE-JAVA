package com.cg.stringbuilder;

public class Example2 {

	public static void main(String[] args) 
	{
		StringBuffer s = new StringBuffer();
		System.out.println(s.capacity());
		
		s.append("Akshay");
		System.out.println(s.capacity());
		
		s.append("Java is my favourite language");
		System.out.println(s.capacity());
	}

}
