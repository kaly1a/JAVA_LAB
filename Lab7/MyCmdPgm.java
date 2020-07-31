/*
Write a class named “MyCmdPgm”. The class should implement two methods
a.    First method “ClimbStairs” is a recursive method which gives the possible number of ways to climb stairs considering that the user can climb 1 or 2 steps at a time. The method takes in a single integer value ‘n’ as parameter, which is the number of stairs. For example:
If n=4 there are 5 ways of climbing the stairs.
1,1,1,1   2,1,1   1,2,1   1,1,2   2,2
ClimbStairs(4) will return an integer value 5.
b.    Second method “MagicSigil” takes a string and removes its vowels and duplicate letters. The returned string should not contain any spaces and be in uppercase. For duplicate letters the last one is kept. For example
MagicSigil ("i am healthy”) will return back “MLTHY”
 Use switch case in the program and use command line argument for choice of function to be implemented. For example:
 java MyCmdPgm 1 would invoke first method “ClimbStairs”.
*/
import java.util.*;

public class MyCmdPgm
{
	public static int Climbstairs(int n)
	{
		if(n<=1)
		{
			return n;
		}
		return Climbstairs(n-1) + Climbstairs(n-2);	  
		
	}
   
   public static int Climb(int s)
   {
   	return Climbstairs(s+1);
   }
   public static String MagicSigil(String str, int n)
   {
   	String res="";
   	for(int i=0;i<n;i++)
   	{
   		int j;
   		for(j=i+1;j<n;j++)
   		{
   			if(str.charAt(i) == str.charAt(j) || str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u' || str.charAt(i) == ' ')
   			{
   				break;
   			}
   		}   
   		    if(j==n)
   		    	res = res+str.charAt(i);
   			
   		}
   		return res;
   		
   	}
   
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		for(String str:args)
		{
			int argument = Integer.parseInt(str);
			switch(argument)
			{
				case 1: System.out.println("Enter the String");
				        String s=sc.nextLine();
				        int d = s.length();
				        String a = MagicSigil(s,d);
				        String b = a.toUpperCase();
				        System.out.println("The magic Sigil is " + b);
				        break;
				
				case 2: System.out.println("Enter the number of stairs");
				        int n=sc.nextInt();
				        System.out.println("The number of ways are " + Climb(n));
				        break;
							
			}
		}
	}
   
}
