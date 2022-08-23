package com.cg.collection;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetExample {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) 
	{
		SortedSet obj = new TreeSet();
		obj.add(11);
		obj.add(33);
		obj.add(5);
		obj.add(45);
		System.out.println(obj);
	}

}
