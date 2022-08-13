package com.cg.polymorphism;

class shape
{
	int area(int a)
	{
		return a*a;
	}
	int area(int a,int b)
	{
		return a*b;
	}
}



public class MethodOverLoading {

	public static void main(String[] args) {
		shape obj = new shape();
		System.out.println(obj.area(5));
		System.out.println(obj.area(4,3));
		

	}

}
