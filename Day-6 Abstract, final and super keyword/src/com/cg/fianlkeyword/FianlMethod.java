package com.cg.fianlkeyword;

class A
{
	A()
	{
		System.out.println("Constructor");
	}
	
	//if you make any method as fianl you can't override it
	//final public void accept()
	public void accept()
	{
		System.out.println("Parent Class");
	}
}

class B extends A
{
	public void accept()
	{
		System.out.println("child Class");
	}
}

public class FianlMethod {

	public static void main(String[] args) {
		B b = new B();
		b.accept();

	}

}
