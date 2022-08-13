package com.cg.polymorphism;

//Program on constructor overloading
class Triber
{
	int speed;
	String engine;
	Triber()
	{
		System.out.println("Renault-kiger");
	}
	Triber(int speed,String engine)
	{
		this.engine = engine;
		this.speed = speed;
		System.out.println("Speed is: "+speed+" and the engine is on: "+engine);
	}
}

public class ConstructorOverLoading {

	public static void main(String[] args) {
		Triber obj = new Triber();
		Triber obj1 = new Triber(25,"disel");
		//obj.Triber(25,"disel");
		
	}

}
