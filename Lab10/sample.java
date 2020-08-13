/*
Write a class called MyException which has two methods calledCountTheLetters() which takes in a string and returns back numberof english letters in the given string.
Ensure that only letters arecounted and use a user defined exception if any non letter is encountered.
The second method takes in an arithmetic expression and returns the result.
Use a user defined exception to validate whether the given expression is avalid arithmetic expression.
Create another class called MyImplementation which creates oneobject of the MyException and calls the methods.
*/
import java.util.*;
import java.lang.*;
class MyException extends Exception
{
	MyException(String str)
	{
		super(str);
	}
}

class MyImplementation
{
	
	public int CountTheLetters(String str) throws MyException
	{
		int len = str.length();
		int i=0;
		for(i=0;i<len;i++)
		{
			boolean ch = Character.isLetter(str.charAt(i));
			if(ch == false)
			{
				throw new MyException("String Invalid");
			}
		}
		return i;
	}
	
	public int arithmeticExp(int num1, int num2, char op) throws MyException
	{
		int sol = 0;
		int flag =0;
		
		if (op == '+')
		{
			 sol = num1 + num2;
			 return sol;
		}
		else if(op == '-')
		{
			sol = num1 - num2;
			return sol;
		}
		else if(op == '*')
		{
			sol = num1 * num2;
			return sol;
		}
		else if(op == '/')
		{
			try 
			{
					
					sol = num1 / num2;
					
			}
				catch(ArithmeticException exc) 
				{
					System.out.println("Division by zero is INVALID!!!");
				}
			 return sol;
		}
		else if(op == '%')
		{
			sol = num1 % num2;
			return sol;
		}
		else 
		{
			throw new MyException("String is INVALID!!!");
		}
	
	}
}
class sample
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string:");
		String s1 = sc.nextLine();
		MyImplementation MyImp = new MyImplementation();
		try
		{
			int num = MyImp.CountTheLetters(s1);
			System.out.println("Numbers of letters present in the entered word:"+num);
		}
		catch(MyException ex)
		{
			System.out.println("Caught the Exception!");
			System.out.println(ex.getMessage());
		}
		try
		{
			System.out.println("Enter first number:");
			int num1 = sc.nextInt();
			System.out.println("Enter second number:");
			int num2 = sc.nextInt();
			System.out.println("Enter the operation:");
			char op = sc.next().charAt(0);
			
			int solution = MyImp.arithmeticExp(num1, num2, op);
			System.out.println("Result:"+solution);	
		}
		catch(MyException ex)
		{
			System.out.println("Caught the Exception!");
			System.out.println(ex.getMessage());
		}
	}
}
