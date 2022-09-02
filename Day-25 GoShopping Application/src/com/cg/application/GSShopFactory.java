package com.cg.application;

import com.cg.framework.NormalAcc;
import com.cg.framework.PrimeAcc;
import com.cg.framework.ShopFactory;

public class GSShopFactory extends ShopFactory
{

	@Override
	public PrimeAcc getNewPrimeAccount(int AccNo, String accNm, float charges, boolean isPrime) 
	{
		GSPrime p = new GSPrime(AccNo,accNm,charges,isPrime);
		return p;
	}

	@Override
	public NormalAcc getNewNormalAccount(int AccNo, String accNm, float charges, float deliveryCharges,
			boolean isNormal) 
	{
		GSNormalAcc n = new GSNormalAcc(AccNo,accNm,charges,deliveryCharges);
		return n;
	}
	

}
