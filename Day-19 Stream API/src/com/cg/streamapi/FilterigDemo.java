package com.cg.streamapi;

import java.util.Arrays;
import java.util.List;

public class FilterigDemo {

	public static void main(String[] args) 
	{
		List<Integer> obj = Arrays.asList(11,45,65,35,35,22);
		
		//filter(predicated[means condition]) Method
		obj.stream().filter(i -> i>25).forEach((i) -> System.out.print(i+" "));
		System.out.println();
		
		//distinct Method we for avoid same data print twice 
		System.out.println("the distinct elements are: ");
		obj.stream().distinct().forEach((i) -> System.out.print(i+" "));
		System.out.println();
		
		System.out.println("the limit is: ");
		obj.stream().limit(2).forEach((i) -> System.out.print(i+" "));
		System.out.println();
		
		System.out.println("The discarded element is: ");
		obj.stream().skip(2).forEach((i) -> System.out.print(i+" "));
		

	}

}
