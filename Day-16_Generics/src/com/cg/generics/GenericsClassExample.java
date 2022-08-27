package com.cg.generics;

public class GenericsClassExample<T>
{
	T num;
	//method 
	public void show()
	{
		System.out.println(num.getClass().getName());
		System.out.println(num);
	}

	public static void main(String[] args) 
	{
		//instead of collection I have used Generic class Name and Generic concept
		GenericsClassExample<Double> obj = new GenericsClassExample<>();
		
		//obj.num = 13.8; // compilation error as its type safety
		obj.num = 13.8;
		obj.show();
		
	}
}
