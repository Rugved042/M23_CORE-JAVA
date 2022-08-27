package com.cg.testing;

import org.junit.jupiter.api.RepeatedTest;

public class RepeatingTastDemo 
{
	@RepeatedTest(5)
	void print()
	{
		System.out.println("Heys Guys! Whtas going on?");
	}

}
