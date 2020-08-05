import java.util.*;
abstract class AmIPrime
{
	int sum=0;
	public abstract boolean Isprime(int num);
	public static int getvalue(String str)
	{
		int charno=0,add=0;
		str = str.replaceAll("[^a-zA-Z0-9]","");
		str = str.toUpperCase();
		int len = str.length();
		String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		for(int i=0;i<len;i++)
		{
			int flag=0;
			for(int j=0;j<26;j++)
			{
				if(str.charAt(i)==alphabet.charAt(j))
				{
					charno = j+1;
					flag = 1;
				}
			}
			if(flag == 0)
			{
				charno = Character.getNumericValue(str.charAt(i));
				
			}
			add = add+charno;
		}
		return add;
	}
	
	public String issentencePrime(String str1)
	{
		sum = getvalue(str1);
		String r;
		if(Isprime(sum)==true)
		{
			return "Prime Sentence";
		}
		else
		{
			r = makeprime(str1);
			
		}
		return r;
	}
	
	public String makeprime(String str2)
	{
		String[] words = str2.split("\\s");
		for(String w:words)
		{
			if(Isprime(sum-getvalue(w)))
			{
				return "Almost Prime Sentence ("+w+")";
			}
		}
		return "Not a Prime Sentence, so Composite!";
	}
}

public class CheckAmIPrime extends AmIPrime
{
	public boolean Isprime(int no)
	{
		int count=0;
		for(int i=1;i<=no;i++)
		{
			if(no%i == 0)
			{
				count++;
				
			}
			
		}
		if(count==2)
		return true;
		else
		{
			return false;
			
		}
		
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		CheckAmIPrime check = new CheckAmIPrime();
		System.out.println("Enter the sentence you want to check for 'Primeness'");
		String s = sc.nextLine();
		String res = check.issentencePrime(s);
		System.out.println("The answer is "+res);
	}
}
