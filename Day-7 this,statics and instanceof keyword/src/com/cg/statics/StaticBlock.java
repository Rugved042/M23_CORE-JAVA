package com.cg.statics;

public class StaticBlock {
	static int a;
	static String name;
	/*@SuppressWarnings("static-access")
	StaticBlock(int a, String name)
	{
		this.a = a;
		this.name = name;
	}*/

	//static Block
	static
	{
		a = 34;
		name = "Apple";
	}
	public static void main(String[] args) {
		/*StaticBlock obj = new StaticBlock(a,name);
		obj.a = 34;
		obj.name = "Apple";*/
		System.out.println(a);
		System.out.println(name);
		
		

	}

}
