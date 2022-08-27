package com.cg.multithreading;

class A
{
	void print(int num)
	{
		synchronized(this)
		{
			for(int i =1; i<4;i++)
			{
				System.out.println(num*i);
				try
				{
					Thread.sleep(400);
				}
				catch(Exception e)
				{
					System.out.println(e);
				}
			}
		}
	}
}

class B extends Thread
{
	A obj;
	B(A obj)
	{
		this.obj = obj;
	}
	public void run()
	{
		obj.print(50);
	}
}

public class SynchronizedBlock {

	@SuppressWarnings("unused")
	public static void main(String[] args) 
	{
		A obj1 = new A();
		B t1 = new B(obj1);
		B t2 = new B(obj1);
		t1.start();
		t2.start();
		
	}

}
