/* Design a class overloading and a function display( ) as follows:
void display(String str, int p) with one String argument and one integer argument. It displays all the vowels if 'p' is 1 (one) otherwise, it displays all the alphabets.
void display(String str, char ch) — checks whether the word str contains the letter ch at the beginning as well as at the end or not. If present, print 'Special Word' otherwise print 'No special word'.
Void display(int a, char ch) with one integer argument and one character argument. It computes the cube root of the integer arguments if ch is 'c', else it computes the square root of the integers.
Void display (int n) to accept a number. The function prints “Is a Pronic”, if the number is 'Pronic', otherwise prints “Not a Pronic”.Pronic number is the number which is the product of two consecutive integers. Example 20 = 4 * 5
Write a class called checkoverloading to create an object of the Overloading and input and call all the methods in a serial manner. */
import java.util.*;
import java.lang.*;

class Overloading
{
	void display(String str,int p)
	{
		String s = str.toUpperCase();
		if(p==1)
		{
		  for(int i=0; i<s.length(); i++)
		  {
		   if(s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U')
		        System.out.println(str.charAt(i));
		  }
		}
		else
		{
		   for(int i=0; i<s.length(); i++)
		   { 
		     System.out.println(str.charAt(i));
		   }
		}
	}
	
	
	void display(String str,char ch)
	{
		String s = str.toUpperCase();
		int n = (s.length()-1);
		if(str.charAt(0)==ch && str.charAt(n)==ch)
		{
			System.out.println("Special Word");
		}
		else
		{
			System.out.println("No Special Word");
		}
	}
	
	
	void display(int a,char ch)
	{
		double sq_rt,cb_rt;
		if(ch=='c')
		{
			cb_rt=Math.cbrt(a);
			System.out.println(cb_rt);
		}
		else
		{
			sq_rt=Math.sqrt(a);
			System.out.println(sq_rt);
		}
	}
	
	
	void display(int n)
	{
		int num = (int) Math.sqrt(n);
		int res = (num * (num +1));
		if(res==n)
		{
		 System.out.println("Is a Pronic");
		}
		else
		{
		 System.out.println("Not a Pronic");
		}
	}
}

class checkoverloading
{
	public static void main(String args[])
	{
		Overloading o =new Overloading();
		Scanner sc = new Scanner(System.in);
		String str;
		int p;
		char ch;
		System.out.println("There are three methods in this program");
		System.out.println("1. Print vowels in a given string if a integer value 1 is given");
		System.out.println("2. Prints that a given string is special word if the given character is first and last character of the string");
		System.out.println("3. Prints cube root of a given number if the character 'c' is given as input else square root");
		System.out.println("4. Prints given number is pronic or not");
		System.out.println("Input for the first display function");
		System.out.println("Enter first string");
		str=sc.next();
		System.out.println("Enter an integer value 0 or 1");
		p=sc.nextInt();
		System.out.println("Calling the first display function");
		o.display(str,p);
		System.out.println("Input for the second display function");
		System.out.println("Enter the second string");
		str=sc.next();
		System.out.println("Enter any character");
		ch=sc.next().charAt(0);
		System.out.println("Calling the second display function");
		o.display(str,ch);
		System.out.println("Input for the third display function");
		System.out.println("Enter an integer");
		p=sc.nextInt();
		System.out.println("Enter an character 'c' to cube the integer or any other character to square");
		ch=sc.next().charAt(0);
		System.out.println("Calling the third display function");
		o.display(p,ch);
		System.out.println("Input for the fourth display function");
		System.out.println("Enter an integer to check if it is a pronic");
		p=sc.nextInt();
		o.display(p);
		
	}
}
