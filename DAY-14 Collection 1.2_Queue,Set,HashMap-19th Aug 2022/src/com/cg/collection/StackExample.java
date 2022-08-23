package com.cg.collection;

import java.util.Stack;

public class StackExample {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		@SuppressWarnings("rawtypes")
		Stack obj = new Stack();
		obj.add(10);
		obj.add(20);
		obj.pop();
		System.out.println(obj);
	}

}
