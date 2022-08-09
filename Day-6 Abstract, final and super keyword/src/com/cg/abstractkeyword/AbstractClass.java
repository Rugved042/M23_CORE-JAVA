package com.cg.abstractkeyword;
abstract class Flower
{
	abstract void print();
	
	void accept()
	{
		System.out.println("Demo on abstrct keyword");
	}
}

class Lily extends Flower
{
	void print()
	{
		System.out.println("Hey! Folks, I like the fragnance of Lily");
	}
}

public class AbstractClass {

	public static void main(String[] args) 
	{
		//Flower l = new Flower(); // we can't create an object for abstract class and we get error
		
		Lily l = new Lily();
		l.print();
		l.accept();
	}

}
