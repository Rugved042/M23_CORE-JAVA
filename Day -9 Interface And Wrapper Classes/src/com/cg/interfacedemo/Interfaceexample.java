package com.cg.interfacedemo;
//Interface Example
interface A
{
	// abstract method by default
	void print();
	void display();
}

class B implements A
{

	@Override
	public void print() {
		System.out.println("Technoserve India Foundation");
		
	}

	@Override
	public void display() {
		System.out.println("JAVA FULL STACK");
		
	}
	
}
public class Interfaceexample {

	public static void main(String[] args) {
		B obj = new B();
		obj.print();
		obj.display();

	}

}
