package com.cg.oops;

class hero
{
	public int speed;
	public String color;
	//Parameterized Constructor
	hero(int sp,String col)
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
		hero p=new hero(100,"Black");
		p.accept();
		
	}

}

