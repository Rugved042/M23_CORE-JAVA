package com.cg.thiskeyword;

//this() : to invoke current class constructor
class Z
{
	public int x;
	//default constructor
	Z()
	{
		this(23);//invoking the parameterized constructor
		System.out.println("Default constructor");
	}
	//parameterized constructor
	Z(int x)
	{
		System.out.println("Value of x is : "+x);
	}
}

public class InvokedConstructor {

	public static void main(String[] args) {
		Z obj = new Z();

	}

}
