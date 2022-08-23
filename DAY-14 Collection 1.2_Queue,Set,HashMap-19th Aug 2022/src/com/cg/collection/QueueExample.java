package com.cg.collection;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) 
	{
		Queue<Integer> obj = new PriorityQueue<Integer>();
		System.out.println(obj.element());
		obj.add(11);
		obj.add(25);
		obj.add(33);
		System.out.println(obj);
		//System.out.println(obj.poll());//for pop first element
		System.out.println(obj.remove());//for pop first element
	}

}
