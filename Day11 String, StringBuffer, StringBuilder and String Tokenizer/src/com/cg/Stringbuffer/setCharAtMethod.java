package com.cg.Stringbuffer;

public class setCharAtMethod {

	public static void main(String[] args) {
		StringBuffer buff = new StringBuffer("Internet of Things ");
		System.out.println(buff);
		System.out.println(buff.charAt(1));
		buff.setCharAt(1,'R');
		System.out.println(buff);
	}

}
