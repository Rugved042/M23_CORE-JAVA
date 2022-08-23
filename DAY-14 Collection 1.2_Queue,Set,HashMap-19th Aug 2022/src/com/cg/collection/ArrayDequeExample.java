package com.cg.collection;

import java.util.ArrayDeque;

public class ArrayDequeExample {

	@SuppressWarnings({ "rawtypes", "unused", "unchecked" })
	public static void main(String[] args) 
	{
		ArrayDeque obj = new ArrayDeque();
		obj.add(11);
		obj.add("Hello");
		obj.add(25);
		System.out.println(obj);
		obj.remove();
		System.out.println(obj);
		obj.addFirst(12);
		obj.addLast("World");
		System.out.println(obj);
		obj.removeFirst();
		obj.removeLast();
		System.out.println(obj);
	}

}
