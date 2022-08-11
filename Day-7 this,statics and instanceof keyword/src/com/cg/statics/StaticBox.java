package com.cg.statics;

public class StaticBox {
	
	double width;
	double height;
	static int count = 7;
	public StaticBox(double width,double height)
	{
		this.width = width;
		this.height = height;
	}
	public StaticBox()
	{
		super();
		int cnt = 16;
		cnt++;
		System.out.println("count is : " +cnt);
		count++;
		System.out.println("count is : " +count);
	}

	public static void main(String[] args) {
		//SaticBox obj = new SaticBox(45,5);
		StaticBox obj = new StaticBox();
		//obj.width = 23;
		//obj.height= 6;
		System.out.println(obj.width);

	}

}
