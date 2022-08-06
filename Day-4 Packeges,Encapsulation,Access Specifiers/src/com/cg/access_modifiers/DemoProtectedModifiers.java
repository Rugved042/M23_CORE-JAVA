package com.cg.access_modifiers;

class Car {
	protected void display()
	{
		System.out.println(" Hey, I am using Access Specifiers");
	}
	
}
class Mercedes extends Car
{
	
}

public class DemoProtectedModifiers {

	public static void main(String[] args) {
		Mercedes obj = new Mercedes();
		obj.display();
		
	}

}
