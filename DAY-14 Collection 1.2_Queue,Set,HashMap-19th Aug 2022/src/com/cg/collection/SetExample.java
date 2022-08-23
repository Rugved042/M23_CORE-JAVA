package com.cg.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetExample {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) 
	{
		Set obj = new HashSet();// not followed order
		Set obj1 = new LinkedHashSet();//follewed order
		obj.add(11);
		obj.add(null);
		obj1.add(11);
		obj1.add(null);
		System.out.println(obj);
		System.out.println(obj1);

	}

}
