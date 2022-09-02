package com.cg.Application;

import com.cg.framework.CurrentAcc;

public class MMCurrentAcc extends CurrentAcc 
{

	public MMCurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		super(accNo, accNm, accBal, creditLimit);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void deposite(float withdraw) {
		// TODO Auto-generated method stub
	}

	@Override
	public String toString() {
		return "MMCurrentAcc [toString()=" + super.toString() + "]";
	}
	
	

}
