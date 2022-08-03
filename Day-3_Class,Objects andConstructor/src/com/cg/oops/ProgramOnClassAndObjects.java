package com.cg.oops;
//demo on how to use the class and objects
class Car
{
	//variable
	int a;
	//use-define method
	void display() 
	{
		System.out.println("Welcome to M23 Batch");
		
	}
}


public class ProgramOnClassAndObjects {

	public static void main(String[] args) {
		//object creation
		Car obj = new Car();
		//accessing the car class method
		obj.display();
		obj.a = 55;
		// accessing the car class method
		System.out.println(obj.a);
		

	}

}
