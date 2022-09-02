package com.cg.client;

import com.cg.application.GSNormalAcc;
import com.cg.application.GSPrime;
import com.cg.application.GSShopFactory;
import com.cg.framework.NormalAcc;
import com.cg.framework.PrimeAcc;
import com.cg.framework.ShopFactory;

public class Client {

	@SuppressWarnings("unused")
	public static void main(String[] args) 
	{
		ShopFactory s = new GSShopFactory();
		PrimeAcc p = new GSPrime(1001, "Rugved Naik", 500, true);
		NormalAcc n = new GSNormalAcc(1002, "Akshay Jadhav", 500, 50);
		System.out.println("Prime Account: ");
		p.bookProduct(500);
		System.out.println("Normal Account: ");
		n.bookProduct(500);
		
		//System.out.println(s.getNewNormalAccount(1003, "Viren" , 1000, 500, false));
		//System.out.println(s.getNewPrimeAccount(1003, "Guru" , 1000, true));
		
		System.out.println(p);
		System.out.println(n);
	}

}
