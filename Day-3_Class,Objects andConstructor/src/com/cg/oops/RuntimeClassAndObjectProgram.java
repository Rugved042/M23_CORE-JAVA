package com.cg.oops;

import java.util.Scanner;

//demo on how to use the class and objects
class Vehicle
{
	//variable
	int a;
	//use-define method
	void display() 
	{
		System.out.println("Welcome to M23 Batch");
		
	}
}


public class RuntimeClassAndObjectProgram {

	public static void main(String[] args) {
		//object creation
		Vehicle obj = new Vehicle();
		//accessing the car class method
		obj.display();
		Scanner s1=new Scanner(System.in);
		System.out.println("enter value : ");
		obj.a = s1.nextInt();
		// accessing the car class method
		System.out.println(obj.a);
		s1.close();
		

	}

}
