package com.cg.streamapi;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.List;

public class MappingExample {

	@SuppressWarnings("unused")
	public static void main(String[] args) 
	{
		List<Integer> obj = Arrays.asList(new Integer[] {20,4,2,5});
		obj.stream().map((i -> i*i)).forEach((i) -> System.out.print(i+" "));
		System.out.println();
		
		//Stream class-Collectors just like a collections class //[]
		List<Integer> obj2 = obj.stream().map((i -> i * i)).collect(Collectors.toList());
		System.out.println(obj2+" ");
		
	}

}
