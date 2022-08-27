package com.cg.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class BasicStreamDemo {

	public static void main(String[] args) 
	{
		Stream<String>obj = Stream.of("Priyanka","Akshay","Viren","Vaibhav");
		obj.forEach((i) -> System.out.print(i+" "));
		System.out.println();
		
		//Stream can be accquired from araay or collection
		List<String>obj1 = Arrays.asList(new String[] {"47","55","68","94","32"});
		obj = obj1.stream();
		obj.forEach(System.out::println);
	}

}
