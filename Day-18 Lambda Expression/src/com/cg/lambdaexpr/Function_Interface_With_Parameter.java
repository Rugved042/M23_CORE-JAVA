package com.cg.lambdaexpr;

//functional interface
@FunctionalInterface
interface D
{
	String display(String str); // Bstract method with parameter
	
}

public class Function_Interface_With_Parameter {

	public static void main(String[] args) 
	{
		D obj = (String str) ->
		{
			return str;
		};
		System.out.println(obj.display("Welcom to Lambda Expression Concept"));
	}

}
