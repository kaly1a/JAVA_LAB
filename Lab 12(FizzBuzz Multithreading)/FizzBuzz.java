/*
Create a class called FizzBuzz which has an integer variable , constructor public FizzBuzz(int number),
methods public void fizz() which prints “fizz” if the number is divisible by 3, public void buzz() which prints “buzz” if the number is divisible by 5
and public void fizzbuzz() which prints “fizzbuzz” if it is divisible by both 3 and 5. 
Implement multithreading by creating three threads Thread A which will call fizz() method, Thread B which will call buzz() and 
Thread C will call fizzbuzz().Given an number 5 the output should be 1, 2, fizz, 4, buzz.
*/

class test
{
	int n;
	public test(int number)
	{
		this.n = number;
	}
	synchronized void fizz()
	{
		if(n%3==0 && n%15!=0)
			System.out.println("fizz");
		else if(n%5!=0)
			System.out.println(n);
	}
	synchronized void buzz()
	{
		if(n%5==0 && n%15!=0)
			System.out.println("buzz");
	}
	synchronized void fizzbuzz()
	{
		if(n%15==0)
			System.out.println("fizzbuzz");
	}
}

class threadA extends Thread
{
	int a;
	public threadA(int m)
	{
		this.a = m;
	}
	public void run()
	{
		test ob1 = new test(a);
		ob1.fizz();
	}
}

class threadB extends Thread
{
	int b;
	public threadB(int m)
	{
		this.b = m;
	}
	public void run()
	{
		test ob2 = new test(b);
		ob2.buzz();
	}
}

class threadC extends Thread
{
	int c;
	public threadC(int m)
	{
		this.c = m;
	}
	public void run()
	{
		test ob3 = new test(c);
		ob3.fizzbuzz();
	}
}

public class FizzBuzz
{
	public static void main(String args[])
	{
		for(int i=1;i<=5;i++)
		{
			threadA A = new threadA(i);
			threadB B = new threadB(i);
			threadC C = new threadC(i);
			A.start();
			try
			{
				//System.out.println(" " );
				A.join(); 
			}   
			catch(Exception ex) 
			{             
				System.out.println("Exception has " + "been caught" + ex);
			}
			B.start();
			try
			{
				//System.out.println(" " );
				B.join();
			}
			catch(Exception ex)
			{
				System.out.println("Exception has " + "been caught" + ex); 
			} 
			C.start();
		}
	}
}
