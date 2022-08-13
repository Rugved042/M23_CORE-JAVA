package com.cg.interfacedemo;

//Multiple Inhetance By Using Interface
interface Father
{
	void property();
}
interface Mother
{
	void love();
}

class son implements Father,Mother
{

	@Override
	public void love() {
		System.out.println("Mother loves their child");
		
	}

	@Override
	public void property() {
		System.out.println("father's gives property to child");
		
	}
	
}
public class MultipleInhetanceByUsingInterface {

	public static void main(String[] args) {
		son obj = new son();
		obj.love();
		obj.property();

	}

}
