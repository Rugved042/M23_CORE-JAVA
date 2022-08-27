package com.cg.streamapi;

import java.util.Arrays;
import java.util.List;

public class FilterExample {

	public static void main(String[] args) 
	{
		List<String> obj = Arrays.asList(new String[] {"Priyanka","Ben","Akshay","Viren","Vaibhav"});
		
		// to return the string 
		obj.stream().filter((i -> i.length() > 3)).forEach((i) -> System.out.print(i+" "));
	}

}
