package com.cg.fianlkeyword;

class Car
{
	String name;
	// final method is inherited but not the override
	final void print(String name)
	{
		System.out.println("My name is :"+name);
	}
}

class Audi extends Car
{
	
}

public class FinalinheritedMethod {

	public static void main(String[] args) {
		Audi a = new Audi();
		a.print("Audi");

	}

}
