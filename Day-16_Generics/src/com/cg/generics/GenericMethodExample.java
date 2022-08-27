package com.cg.generics;

public class GenericMethodExample 
{
	//when we use generic method we can pass any types of arguments in the method
	public static <E>void printArray(E[] elem)
	{
		for(E itr:elem)
		{
			System.out.println(itr.getClass().getName());
			System.out.println(itr);
		}
	}

	public static void main(String[] args) 
	{
		//Integer Array
		Integer arr1[] = {10,20,30};
		//Character Array
		Character arr2[] = {'z','x','a'};
		
		System.out.println("Printing Array for integer");
		printArray(arr1);
		
		System.out.println("Printing Array for character");
		printArray(arr2);
	}

}
