package com.cg.oops;

class pulser
{
	public int speed;
	public String color;
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

public class ParameterizedConstructor {

	public static void main(String[] args) {
		pulser p=new pulser(50,"Black");
		p.accept();
		
	}

}
