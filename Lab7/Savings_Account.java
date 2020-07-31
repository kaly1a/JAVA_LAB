/*
Write a class called Savings_Account with following variables
protected int accountnumber
protected double balance
protected double rate
and create three parameterised constructors and use “this” keyword in two of them. 
The methods are public void deposit (double amount)to deposit a given amount, 
public boolean checkminbalance() checks if minimum balance is available or not, 
You need to maintain Rs.1000 as minimum balance in your account. 
public boolean withdrawal (double amount) which returns true if withdrawal is 
possible else false, call the method ”checkminbalance” using ”this” keyword . 
Make required modifications in the “balance” variable. 
public void add_interest() method adds interest based on the “rate” variable.
Create an array of 10 objects. 
Validations required : Ensure that the “accountnumber” is unique.
*/
import java.util.*;
class Savings_Account
{
	protected int accountnumber;
	protected double balance,rate;
	public Savings_Account(int accountnumber, double balance, double rate)
	{
		this.accountnumber = accountnumber;
		this.balance = balance;
		this. rate = rate;
	}
	
	public Savings_Account(int accountnumber, double balance)
	{
		this(accountnumber, balance, 7);
	}
	
	public Savings_Account(int accountnumber)
	{
		this(accountnumber, 1000, 7);
	}
	
	public void deposit(double amount)
	{
		this.balance += amount;
	}
	
	public boolean checkminbalance()
	{
		if(this.balance<1000)
		{
			System.out.println("You need to maintain Rs.1000 as minimum balance in your account");
			return false;
		}
		return true;
	}
	
	public boolean withdrawal(double amount)
	{
		this.balance -= amount;
		if(checkminbalance())
		{
			return true;
		}
		else
		{
			this.balance += amount;
			return false;
		}
	}
	
	public void add_interest()
	{
		this.balance += this.balance * (this.rate/100);
	}
	
	public int getaccno()
	{
		return this.accountnumber;
	}
	
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of account numbers you want to insert:");
		int x = sc.nextInt();
		int accno;
		Savings_Account[] acc = new Savings_Account[x];
		
		for(int i=0; i<x; i++)
		{
			do
			{
				System.out.println("Enter account number: ");
				accno = Integer.valueOf(sc.next());
			} while (Unique(acc, accno, i) == false);
		
		acc[i]=new Savings_Account(accno);
		}
	}
	
	public static boolean Unique(Savings_Account[] acc, int accno, int size)
	{
		for(int i=0; i<size;i++)
		{
			if(acc[i].getaccno() == accno)
				return false;
		}
		return true;
	}
}
