package com.cg.stringbuilder;

public class Example1 {

	public static void main(String[] args) {
		String str = "Today";
		StringBuilder s = new StringBuilder(str.length());
		System.out.println(s.capacity());
	}

}
