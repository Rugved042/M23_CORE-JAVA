package com.cg.oops;

class Animal
{
	int x;
	//Non-Parameterized Constructor
	Animal()
	{
	//variable
	x = 15;
	}
	//use-define method
	void display() 
	{
		System.out.println("Lion"+" "+x);
	}
}

public class NonParameterizedConstructor {

	public static void main(String[] args) {
		Animal a=new Animal();
		a.display();

	}

}
