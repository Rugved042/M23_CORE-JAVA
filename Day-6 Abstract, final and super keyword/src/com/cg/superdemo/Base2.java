package com.cg.superdemo;

public class Base2 extends Base1
{
	Base2()
	{
		super();//call to parent class default comstructor 
		System.out.println("Default constructor for Base2");
	}
	Base2(int i)
	{
		super(i);//call to parent class parameterized comstructor
		System.out.println("Parameterized constructor for Base2 : "+i);
	}

}
