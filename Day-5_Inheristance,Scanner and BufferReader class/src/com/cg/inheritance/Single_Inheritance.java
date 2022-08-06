package com.cg.inheritance;

class Parent
{
	protected int roll_no;
	/*Parent(int roll_no)
	{
		this.roll_no = roll_no;
	}*/
	void print()
	{
		System.out.println(" Hey Guys! What's going on?");
	}
}

class child extends Parent
{
	void accept()
	{
		System.out.println(" Roll No. is: " +roll_no);
	}
}

public class Single_Inheritance {

	public static void main(String[] args) {
		child c = new child();
		c.roll_no = 121;
		c.accept();
		c.print();

	}

}
