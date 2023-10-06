package com.topperworldtask;
import java.util.Scanner;

public class ATMInterface
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		ATM A=new ATM(123456789,"Janhavi",1234,25000);
		System.out.println("ATM MACHINE");
		System.out.println("Choose 1 for Withdraw" + "\nChoose 2 for Deposite" + "\nChoose 3 for Check Balance"
		+ "\nChoose 4 for EXIT");
		for(;;)
		{
		System.out.println("Choose the Operation:");
		int choice = sc.nextInt();
		switch(choice)
		{
		case 1:
			System.out.println("Enter Password To Withdraw");
			int pass=sc.nextInt();
			if(pass==A.getPass())
			{
				System.out.println("Enter Amount to Withdraw");
				double withdrawlAmount=sc.nextDouble();
				if(withdrawlAmount<=A.getBalance())
				{
					double newAmount = A.getBalance()- withdrawlAmount;
					System.out.println("Your money has been Withdrawl Successfully");
					A.setBalance(newAmount);
					break;
				}
				else
				{
					System.out.println("Insufficient Balance");
				}
			}
			else
			{
				System.out.println("Incorrect Password");
				break;
			}
			
		case 2:
			System.out.println("Enter Account number To Deposite money");
			long accountNo=sc.nextLong();
			if(accountNo==A.getAccountNo())
			{
				System.out.println("Enter Amount to Deposite");
				double depositeAmount=sc.nextDouble();
				double newAmount2 = A.getBalance()+ depositeAmount;
				System.out.println("Your money has been Successfully Deposite");
				A.setBalance(newAmount2);
				break;
			}
			else
			{
				System.out.println("Invalid Account Number");
				break;
			}
			
		case 3:
			System.out.println("Enter Password to check Balance");
			int newPass=sc.nextInt();
			if(newPass==A.getPass())
			{
				System.out.println(A.getBalance());
				break;
			}
			else
			{
				System.out.println("Incorrect Password");
				break;
			}
		case 4:
			System.exit(0);
		}
		}
	}
}
