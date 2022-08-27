package com.cg.multithreading;

//Predict the Output // With using static synchronization

class Test2

{

	public static synchronized void display()
	{
		System.out.println("Current thread " + Thread.currentThread());
		for(int i = 0; i < 5 ; i++)
		{
			System.out.println(Thread.currentThread().getName() + " i - " +i);
			try
			{
				Thread.sleep(50);
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}
		
	}
}
	
	@SuppressWarnings("unused")
class Valueoff implements Runnable
{
		Thread t;//pre-define class
		Test2 val;
		Valueoff(Test2 val)
		{
			this.val = val;
			t = new Thread(this);
			t.start();
		}
		@SuppressWarnings("static-access")
		public void run()
		{
			val.display();

		}

}


public class WithUsingStaticSynchronizedMethod {
	@SuppressWarnings("unused")
	public static void main(String[] args) 
	{
		Test2 obj1 = new Test2();
		Test2 obj2 = new Test2();
		Valueoff t1 = new Valueoff(obj1);
		Valueoff t2 = new Valueoff(obj2);

	}
}
