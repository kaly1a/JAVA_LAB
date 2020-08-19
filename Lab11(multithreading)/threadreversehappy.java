/*
Create a following classes and methods to implement multithreading.

    Create a class called Oddreverse which has a method called "reverseOdd" which takes in a string and reverses only those strings which are of odd length.(Returns a string)
    Create a class called oddreversethread which implements runnable interface has three variables
    String input
    an object of Oddreverse
    an object of Thread class 

write a parameterized constructor to initialize the variables and also start the thread object ,in the "run" method use sleep for atleast 1000milliseconds and call the method "reverseOdd" in it.

3. Create a class called Happynumber which has a method "happyAlgorithm" which takes in an integer number and returns a string saying if it is a happy number or sad and the number of steps to reach the solution. Below is the details about happy number

A number is happy number when iteratively we add the sum of the digits of the number we arrive upon a single digit which should be 1 for example if number is 139

1+9+81=91, 81+1=82,64+4=68,36+64=100,1+0+0=1 hence happy number.

If a number is sad it will end up in a infinite loop and the numbers will be one of the following 4,16,37,58,89,145,42,20. Avoid the infinite looping by checking the number generated with the list of numbers mentioned above.

4. Create a class called "happynumberthread" which implements runnable and has variables an integer,object of Happynumber,object of Thread class. write a parameterized constructor to initialize the variables and also start the thread object ,in the "run" method use sleep for atleast 1000milliseconds and call the method "happyAlgorithm" in it.

5. Create a class called "threadrevesehappy" and create 2 objects of each class oddreversethread,happynumberthread. use sleep to display the output with a delay.

Harcode the values for string and number

Strings " Testing the String", Testing the program"

Numbers : 191,48
*/
import java.util.*;
class Oddreverse
{
	public String reverseOdd(String str)
	{
		   String[] words = str.split(" ");
		   String rev_str = "";
		   if(words.length % 2 != 0)
		   {
			  for(int i=0;i<words.length;i++)
			  {
			    	String word = words[i];
				    String rev_word = "";
				    for(int j=word.length()-1;j>=0;j--)
				    {
					    rev_word = rev_word + word.charAt(j);
				    }
			   rev_str = rev_str + rev_word + " ";
			  }
		   }
		   else
	   	   {
			System.out.println("Entered string length is even");
			rev_str = "Can't reverse";
		   }
		   //System.out.println(str);
		   //System.out.println(rev_str);
		   return rev_str;
	}
}

class oddreversethread implements Runnable
{
	String input;
	Oddreverse o1 = new Oddreverse();
	Thread t1 = new Thread();
	oddreversethread(String str)
	{
		this.input = str;
	}
	public void start()
	{
		System.out.println("Starting OddReverse Thread");
		if(t1==null)
		{
			t1=new Thread(this,input);
			t1.start();
		}
		run();
	}
	public void run()
	{
		try
		{
			Thread.sleep(1000);
			String rev = o1.reverseOdd(input);
			System.out.println("Reversed String is: "+rev);
		}
		catch(InterruptedException e)
		{
			System.out.println("Thread" +input+ "interrupted");
		}
	}
}

class Happynumber
{
	String result=" ";
	public String happyalgorithm(int num)
	{
		int rem = 1, sum = 0;
		while(num > 9)
		{
			while(num > 0)
			{
				rem = num % 10;
				sum = sum + (rem * rem);
				num = num / 10;
			}
		num = sum;
		sum = 0;
		}
		if(num!=1 && num!=4 && num!=16 && num!=37 && num!=58 && num!=89 && num!=145 && num!=42 && num!=20)
		{
			happyalgorithm(num);
		}
		else if(num==1)
		{
			result = "a Happy Number";
		}
		else
		{
			result = "a Sad Number";
		}
		return result;
	}
}

class happynumberthread implements Runnable
{
	int number;
	Happynumber o2 = new Happynumber();
	Thread t2 = new Thread();
	happynumberthread(int n)
	{
		this.number = n;
	}
	public void start()
	{
		System.out.println("Starting HappyNumber Thread");
		if(t2==null)
		{
			t2=new Thread(this,"happy");
			t2.start();
		}
		run();
	}
	public void run()
	{
		try
		{
			Thread.sleep(1000);
			String res = o2.happyalgorithm(number);
			System.out.println("Number is "+res);
		}
		catch(InterruptedException e)
		{
			System.out.println("Thread HappyNumber interrupted");
		}
	}
}

class threadreversehappy
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string:");
		String s = sc.nextLine();
		oddreversethread ot1 = new oddreversethread(s);
		ot1.start();
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter a number:");
		int digit = sc1.nextInt();
		happynumberthread ot2 = new happynumberthread(digit);
		ot2.start();
	}
}
