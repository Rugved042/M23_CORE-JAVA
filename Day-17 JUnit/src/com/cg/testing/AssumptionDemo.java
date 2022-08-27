package com.cg.testing;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class AssumptionDemo 
{
	@Test
	void division()
	{
		System.setProperty("Krutika", "Guru");
		//if Assumption is true 
		Assumptions.assumeTrue("Guru".equals(System.getProperty("Krutika")));
		System.out.println("Assumption is True");
		
		Assumptions.assumeFalse("Guru".equals(System.getProperty("Krutika")));
		System.out.println("Assumption is false");

	}

}
