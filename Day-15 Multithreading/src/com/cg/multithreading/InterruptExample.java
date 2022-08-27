package com.cg.multithreading;

class Thread3 extends Thread
{
	public void run()
	{
		System.out.println("This is the program for the Thread interruption");
	}
}

public class InterruptExample {

	@SuppressWarnings("static-access")
	public static void main(String[] args) 
	{
		Thread3 t = new Thread3();
		t.start();
		
		System.out.println("is Thread isInterrupted 1 " +t.isInterrupted());
		System.out.println("is Thread interrupted 1 " +t.interrupted());
		
		t.interrupt();
		
		System.out.println("is Thread isInterrupted 2 " +t.isInterrupted());
		System.out.println("is Thread interrupted 2 " +t.interrupted());
	}

}
