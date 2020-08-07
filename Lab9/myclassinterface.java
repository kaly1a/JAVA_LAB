/*
Create an interface by name “myinterface” which contains two methods

public String LnCommonPrefix(String []str);

public int givesamosa(int ratings[]);

Write a class named myclassinterface which will implement the interface and define the methods,i

nvoke them with its object. Hardcode the String array for method LnCommonPrefix and

accept number of kids and the rating from user for the method givesamosa.

[The two methods indicate two things we do ie talk and eat.]

The method LnCommonPrefix will take in a string array identify if there is a common prefix to the strings

and return the longest common prefix else an empty string.

For example – if the string arrary has {Flight,Flog,Flop} the method would return “Fl”.

The method givesamosa will give samosa to kids by their rating.

There are “n” kids  standing in a line. Each kid is assigned a rating.

You are giving samosas to them as you are a foodie and also believe that “sharing is caring” but you are  following certain conditions:

·      Every kid  must be given least one samosa.

·      kid with a higher rating get more samosa than his/her neighbour in the line.(Life is unfair !)

What is the minimum number of  samosas you must give to them? For example if there are 3 kids and their ratings are{1,0,2}

you need to give minimum of 5

First – 2,Second-1,Third-2
*/

import java.io.*;
import java.util.*;
import java.lang.String;
interface sample
{
	public String LnCommonPrefix(String []str);
	public int givesamosa(int ratings[]);
}
class myclassinterface
{
	static StringBuffer myString=new StringBuffer();
	public int givesamosa(int ratings[])
	{
		int size=ratings.length;
		int prev,next;
		int samosas=0;
		for(int i=0;i<size;i++)
		{
			samosas+=1;
			prev=i-1;
			next=i+1;
			if(prev >= 0)
			{
				if(ratings[prev]<ratings[i])
				{   
					samosas++;
				}
			}
			if(next<size)
			{
				if(ratings[next]<ratings[i])
				{
					samosas++;
				}
			}
		}
		return samosas;
	}
	
	public String LnCommonPrefix(String []str)
	{    
		String common;
		int size=str.length;
		int len1,len2;
		myString=new StringBuffer(str[0]);
		int a;
		for(int i=1;i<size;i++)
		{
			len1=str[i].length();
			len2=myString.length();
			a=0; 
			common="";
			while( a < len1  && a < len2)
			{
				if( str[i].charAt(a) == myString.charAt(a) )
				{
					common+= str[i].charAt(a);
				}
				else
				{    
					break;
				}
			a++;
			}
			
			myString=new StringBuffer(common);
		}
		common=myString.toString();
		return common;
	}
	
	public static void main(String[] args)
	{
		myclassinterface m=new myclassinterface();
		Scanner s=new Scanner(System.in);
		int kids;
		int minimum_samosas;
		String common;
		String[] names={"carlot","caribbean","carliac","cardamon"};
		System.out.println("Enter the number of kids you want to give samosa");
		kids=s.nextInt();
		int[] ratings=new int[kids];
		System.out.println("Enter the ratings of the kids");
		for(int i=0;i<kids;i++)
		{  
			ratings[i]=s.nextInt();
		}
		minimum_samosas=m.givesamosa(ratings);
		System.out.println("The minimum number of samosas to be given are "+minimum_samosas);
		common=m.LnCommonPrefix(names);
		System.out.println("The longest prefix which is common is "+common);
	}
}
