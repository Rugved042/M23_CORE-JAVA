package com.cg.statics;

public class StaticVariable {
	//use any static variable out side the main function
	static int x = 67; //static variable
	
	public static void main(String[] args) {
		x = 71;
		System.out.println(x);
	}

}
