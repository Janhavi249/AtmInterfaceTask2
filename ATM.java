package com.topperworldtask;

public class ATM
{
	private long accountNo;
	private String accountHolderName;
	private int pass;
	private double balance;
	
	ATM(long a1,String s1,int p1,double d1)
	{
		accountNo=a1;
		accountHolderName=s1;
		pass=p1;
		balance=d1;
		
	}
	public long getAccountNo()
	{
		return accountNo;
	}
	public void setAccountNo(long a1)
	{
		accountNo=a1;
	}
	public String getAccountHolderNamme()
	{
		return accountHolderName;
	}
	public void setAccountHolderName(String s1)
	{
		accountHolderName=s1;
	}
	public int getPass()
	{
		return pass;
	}
	public void setPass(int p1)
	{
		pass=p1;
	}
	public double getBalance()
	{
		return balance;
	}
	public void setBalance(double d1)
	{
		balance=d1;
	}
	
}
