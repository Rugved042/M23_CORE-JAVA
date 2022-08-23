package com.cg.collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

	public static void main(String[] args) 
	{
		//tree map always follow order
		Map<Integer,String> obj = new HashMap<Integer,String>();
		obj.put(13,"Akshay");
		obj.put(14,"Guru");
		obj.put(15,"Viren");
		obj.put(11, "Rugved");
		obj.put(12,null);
		System.out.println(obj);
		obj.remove(12);
		System.out.println(obj);

	}

}
