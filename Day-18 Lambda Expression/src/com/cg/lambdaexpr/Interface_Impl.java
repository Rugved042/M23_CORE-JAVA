package com.cg.lambdaexpr;

interface C
{
	/* lambda expr will only work for functional interface implementation 
	not for other interface implementation*/
	void display();
	//void accept();
}

public class Interface_Impl {

	public static void main(String[] args) 
	{
		C obj = () ->
		{
			System.out.println("Functional Interface implementation with Lambda Expression");
		};
		obj.display();
	}

}
