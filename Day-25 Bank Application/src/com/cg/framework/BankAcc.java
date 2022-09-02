package com.cg.framework;

public abstract class BankAcc 
{
	private int accNo;
	private String accNm;
	private float accBal;
	private float withdraw;
	
	//Construstor
	public BankAcc(int accNo, String accNm, float accBal) 
	{
		super();
		this.accNo = accNo;
		this.accNm = accNm;
		this.accBal = accBal;
	}

	//getter and setter methods
	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public String getAccNm() {
		return accNm;
	}

	public void setAccNm(String accNm) {
		this.accNm = accNm;
	}

	public float getAccBal() {
		return accBal;
	}

	public void setAccBal(float accBal) {
		this.accBal = accBal;
	}

	//generated to-String method
	@Override
	public String toString() {
		return "BankAcc [accNo=" + accNo + ", accNm=" + accNm + ", accBal=" + accBal + "]";
	}

	public abstract void withdraw(float withdraw);
	public void deposite(float withdraw )
	{
		System.out.println(withdraw);
	}
	
}
