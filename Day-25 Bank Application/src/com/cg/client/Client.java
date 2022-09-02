package com.cg.client;

import com.cg.Application.MMBankFactory;
import com.cg.Application.MMCurrentAcc;
import com.cg.Application.MMSavingAcc;
import com.cg.framework.BankFactory;
import com.cg.framework.CurrentAcc;
import com.cg.framework.SavingAcc;

public class Client {

	@SuppressWarnings("unused")
	public static void main(String[] args) 
	{
		BankFactory b = new MMBankFactory();
		CurrentAcc c = new MMCurrentAcc( 1244 ,"Rugved Naik ",5000,100000);
		SavingAcc s = new MMSavingAcc( 1245 ,"Akshay Jadhav ",5000,true);
		
		System.out.println("Current Account: ");
		c.withdraw(500);
		
		System.out.println("Saving Account: ");
		s.withdraw(500);

		
		System.out.println(c);
		System.out.println(s);
		
	}

}
