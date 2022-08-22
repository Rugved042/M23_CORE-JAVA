package com.cg.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		@SuppressWarnings("rawtypes")
		List obj = new LinkedList<>();
		obj.add(52);
		obj.add(11);
		obj.add("Rugved");
		obj.add(76.90);
		obj.add("Naik");
		obj.add(52);
		obj.add(11);
		System.out.println(obj);
		System.out.println(obj.size());
		System.out.println(obj.remove(0));
		System.out.println(obj);
		
		System.out.println(obj.lastIndexOf(11));
		System.out.println(obj.indexOf(11));

	}

}
