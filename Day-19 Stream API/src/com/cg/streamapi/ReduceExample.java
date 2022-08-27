package com.cg.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

//Example on reduce
public class ReduceExample {

	public static void main(String[] args) 
	{
		List<Integer> obj = Arrays.asList(11,45,65,35,35,22);
		
		//reduce method
		Optional<Integer>result = obj.stream().reduce((i,j) -> i>j?i:j);
		if(result.isPresent())
		{
			System.out.print("Result is: "+result.get());
		}
	}

}
