package com.cg.oops;
//Parameterized And Non-Parameterized Constructor



class pulser
{
	public int speed;
	public String color;
	//Non-Parameterized Constructor
	pulser()
	{
		System.out.println("Welcome to technoserve India");
	}
	//Parameterized Constructor
	pulser(int sp,String col)
	{
		speed = sp;
		color = col;
	}
	void accept()
	{
		System.out.println("speed is: "+speed+ "km/hr and color is : "+color); 
	}
}

public class ParameterizedAndNonParameterizedConstructor {

	public static void main(String[] args) {
		pulser p1 = new pulser();
		
		pulser p = new pulser(50,"Black");
		p.accept();

	}

}
