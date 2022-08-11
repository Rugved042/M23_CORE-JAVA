package com.cg.thisdemo;

public class Derived extends Base1
{
	//Default constructor
	Derived()
	{
		System.out.println("Default constructor for derived");
	}
	//Parameterized constructor
	Derived(int i)
	{
		this();
		System.out.println("Parameterized constructor for derived");
	}

}
