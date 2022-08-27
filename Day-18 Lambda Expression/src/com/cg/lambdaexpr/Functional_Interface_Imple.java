package com.cg.lambdaexpr;

interface A
{
	void print();//abstract method
}

//length of code is increased using Implementable class B
/*class B implements A
{
	public void print()
	{
		Syste.out.println("Functional Interface implementation without Lambda Expression");
	}
}*/

public class Functional_Interface_Imple {

	public static void main(String[] args) 
	{
		/*B obj = new B();
		obj.print()*/
		
		@SuppressWarnings("unused")
		//lambda expression implements the function interface
		A obj = () -> 
		{
			System.out.println("Functional Interface implementation with Lambda Expression");
		};
		obj.print();
	}

}
