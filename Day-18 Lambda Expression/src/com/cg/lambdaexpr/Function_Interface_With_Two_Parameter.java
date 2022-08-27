package com.cg.lambdaexpr;

interface E
{
	int add(int a, int b);
}

public class Function_Interface_With_Two_Parameter {

	public static void main(String[] args) 
	{
		
		//Lambda Expression with return statement
		/*E obj = (int a, int b) -> 
		{
			return a+b;
		};
		System.out.println(obj.add(5,7));*/
		
		// Lambda Expression without return statement
		E obj = (int a, int b) -> (a+b);
		System.out.println(obj.add(5,7));
	}

}
