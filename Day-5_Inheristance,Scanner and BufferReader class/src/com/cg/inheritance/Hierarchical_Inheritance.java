package com.cg.inheritance;

//Parent Class 1
class AndroidVersion
{
	protected int speed;
	
	void display1()
	{
		System.out.println(" Android-Version");
	}
}

//child class of AndroidVersion
class Kitkat extends AndroidVersion
{
	void print()
	{
		System.out.println(" Kitkat ");
	}
}

//child class of AndroidVersion class
class Pie extends AndroidVersion
{
	void print1()
	{
		System.out.println(" Pie ");
	}
}

public class Hierarchical_Inheritance {

	public static void main(String[] args) {
		Kitkat k = new Kitkat();
		Pie p = new Pie();
		k.display1(); 
		k.print();
		p.display1();
		p.print1();
		

	}

}
