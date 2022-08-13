package com.cg.polymorphism;

class A
{
	void add(int a,int b)
	{
		System.out.println(a+b);
	}
	void add(float a,float b)
	{
		System.out.println(a+b);
	}
}

public class CompileTimePolymorphism1 {

	public static void main(String[] args) {
		A obj = new A();
		obj.add(5, 10);
		obj.add(5.2f,2.9f);
		

	}

}
