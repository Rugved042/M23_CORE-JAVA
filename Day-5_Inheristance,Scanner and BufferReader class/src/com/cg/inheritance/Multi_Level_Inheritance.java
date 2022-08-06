package com.cg.inheritance;

//Parent Class 1
class Bike
{
	protected int speed;
	
	void display()
	{
		System.out.println(" I like to drive a Bike");
	}
}

//Parent class of pulser125 and child class of Bike
class Pulser extends Bike
{
	protected String color;
	void print()
	{
		System.out.println(" Speed is: " +speed);
	}
}

//child class of pulser and Bike class
class Pulser125 extends Pulser
{
	protected String color;
	void accept()
	{
		System.out.println(" color is: " +color);
	}
}

public class Multi_Level_Inheritance {

	public static void main(String[] args) {
		Pulser125 obj = new Pulser125();
		obj.color ="Black";
		obj.speed = 125;
		obj.display();
		obj.print();
		obj.accept();
	}

}
