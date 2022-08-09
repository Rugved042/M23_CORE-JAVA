package com.cg.superkeyword;

class android
{
	//public String name;
	android()
	{
		System.out.println("Lava is Andoide mobile");
	}
	/*void print()
	{
		System.out.println("Lava is );
	}*/
}

class Lava extends android
{
	Lava()
	{
		//
		super();
		System.out.println("Hello everyone");
	}
}

public class SuperConstructor {

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Lava l = new Lava();
		//System.out.println("Lava class constructor");

	}

}
