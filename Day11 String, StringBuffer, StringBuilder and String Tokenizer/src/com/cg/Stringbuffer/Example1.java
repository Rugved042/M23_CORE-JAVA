package com.cg.Stringbuffer;

public class Example1 {

	public static void main(String[] args) {
		String str = "Today";
		StringBuffer s = new StringBuffer(str.length());
		System.out.println(s.capacity());
	}

}
