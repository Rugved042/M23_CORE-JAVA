package com.cg.thiskeyword;

//this can be passed as an argument in the method call 
class B
{
	public void accept1(B obj)
	{
		System.out.println("Accept1 method");
	}
	public void accept2()
	{
		accept1(this);
		
	}
}

public class MethodCall {

	public static void main(String[] args) {
		B obj = new B();
		obj.accept2();
	}

}
