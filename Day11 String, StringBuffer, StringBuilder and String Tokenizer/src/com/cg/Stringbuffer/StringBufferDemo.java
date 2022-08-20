package com.cg.Stringbuffer;

public class StringBufferDemo {

	public static void main(String[] args) {
		StringBuffer buff = new StringBuffer("Internet of Things");
		System.out.println(buff.capacity());
		buff = new StringBuffer(" ");
		System.out.println(buff.capacity());

	}

}
