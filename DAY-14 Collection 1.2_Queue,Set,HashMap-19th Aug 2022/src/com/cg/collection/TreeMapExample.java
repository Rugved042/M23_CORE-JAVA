package com.cg.collection;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {
		Map<Integer,String> obj = new TreeMap<Integer,String>();
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
