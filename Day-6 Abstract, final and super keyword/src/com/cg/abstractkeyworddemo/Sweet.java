package com.cg.abstractkeyworddemo;

//abstract method
public abstract class Sweet extends Food
{
	//constructor 
	public Sweet()
	{
		System.out.println("from sweet class - I like ras-malai");
	}
	//non-abstract method
	public String taste()
	{
		return "Sweet";
	}
}
