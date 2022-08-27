package com.cg.lambdaexpr;

public class Runnable_Interface_impl_Usilng_Lambda {

	public static void main(String[] args) 
	{
		//Runnable Interface
		/*Runnable R1 = new Runnable()
		{
			public void run()
			{
				System.out.println("runnable interface Implementation");
			}
		};*/
		
		 // Runnable interface implementation by using lambda expression
		Runnable R1 = () -> 
		{
			System.out.println("runnable interface Implementation");
		};
		Thread t = new Thread(R1);
		t.start();
	}

}
