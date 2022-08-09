package com.cg.superkeyword;

class Color
{
	protected String name = "orange";
}

class Blue extends Color
{
	public String name = "Blue";
	public void display()
	{
		System.out.println("color is :"+name);
		//Super keyword is used to refer the parent class variable
		System.out.println(super.name);
	}
}

public class SuperVariable {

	public static void main(String[] args) {
		Blue b = new Blue();
		b.display();
	}

}
