package com.cg.polymorphism;

//Program on method overriding
//one class is not enough creat two or more class which contains inhetance concept
class Multiplication
{
	void accept(int a, int b)
	{
		System.out.println(a*b);
	}
}

class Mult extends Multiplication
{
	void accept(int x, int y)
	{
		System.out.println(x*y);
	}
}

public class MethodOverriding {

	public static void main(String[] args) {
		Mult obj = new Mult();
		Multiplication obj1 = new Multiplication();
		obj.accept(4,6);
		obj1.accept(12, 5);
	}

}
