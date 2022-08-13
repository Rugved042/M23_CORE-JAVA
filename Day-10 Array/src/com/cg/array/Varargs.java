package com.cg.array;

public class Varargs 
{
	//variable arguments (deonted by ellipse symbol [..]
	static void print(int a,int b,String... s)
	{
		//to print variable
		System.out.println(a+","+b);
		
		for(int i = 0; i < s.length; i++)
		{
			System.out.println(s[i]+"\t");

		}
	}

	public static void main(String[] args) {
		//fun call 
		print(13,65,"Python","Java","C++");
		//print(13,65,25,52,65);

	}

}