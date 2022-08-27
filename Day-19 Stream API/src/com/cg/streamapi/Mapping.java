package com.cg.streamapi;

import java.util.Arrays;
import java.util.List;

public class Mapping {

	public static void main(String[] args) 
	{
List<String> obj = Arrays.asList(new String[] {"Priyanka","Ben","Akshay","Viren","Vaibhav"});
		
	    //
		obj.stream().map((i -> i.length())).forEach((i) -> System.out.print(i+" "));
		System.out.println(); 

		
		obj.stream().map((i -> i.length() > 3)).forEach((i) -> System.out.print(i+" "));
	
	}

}
