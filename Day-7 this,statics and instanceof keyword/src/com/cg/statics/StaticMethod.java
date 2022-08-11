package com.cg.statics;

public class StaticMethod {
	static void display()
	{
		System.out.println("Welcom to M23 Batch");
	}
	public static String name() {
		return "Hello Guys";
	}
	
	public static void main(String[] args) {
		//StaticMethod s = new StaticMethod();
		//s.display();
		
		display();
		System.out.println(name());

	}

}
