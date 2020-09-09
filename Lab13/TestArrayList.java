/*
Write a class called TestArrayList which will have the following.

Create an Array list of Strings, write method

·     “Switch” which will switch alternate words in the array list. If the size of the array list is odd leave the last element in it’s original position.

·     “Hide” which will hide the characters of a string whose length is divisible by 2 by “#”

Create an array list of integers and write a method “removeunfairnumber” which will remove a number if it is less than the number to its left.
*/

import java.util.*;
public class TestArrayList
{
	static ArrayList<String> Switch(ArrayList<String> list)
	{
		int j;
		for(int i = 0;i<list.size()-1;i+=2)
		{
			j=i+1;
			Collections.swap(list,i,j);
		}
			return list;
		
	}
	
	
	static ArrayList<String> Hide(ArrayList<String> list)
	{
		int j;
		for(int i = 0;i<list.size();i++)
		{
			if(list.get(i).length() % 2 == 0)
			{
				list.set(i,"#");
			}
		}
			return list;
		
	}

	static ArrayList<Integer> removeunfairnumber(ArrayList<Integer> num)
	{
		for(int i = 1;i<num.size();i++)
		{
			if(num.get(i) < num.get(i-1))
			{
				num.remove(i);
			}
			if(num.get(num.size()-1) < num.get(num.size()-2))
			{
				num.remove(num.size()-1);
			}
		}
		return num;
	}
	
	
	static void display(ArrayList<String> list)
	{
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
		
		}
	}
	
	public static void main(String[] args)
	{
		ArrayList<String> list = new ArrayList<String>();
		ArrayList<String> list1 = new ArrayList<String>();
		ArrayList<Integer> num = new ArrayList<Integer>();
		int i;
        	list.add("aabbcca");
        	list.add("purple");
        	list.add("leopard");
        	list.add("698762321");
        	list.add("lily");

		
		list1 =Switch(list);
		System.out.println("---After Swapping---");
		display(list1);
		System.out.println(" ");
		
		list1 =Hide(list);
		System.out.println("---After Hiding---");
		display(list1);
		System.out.println(" ");
		
        	num.add(8);
		      num.add(18);
        	num.add(4);
        	num.add(6);
        	num.add(9);
        	num.add(0);
		      num.add(90);
		
		System.out.println(" ");
		num = removeunfairnumber(num);
		System.out.println("----After removing Unfair Numbers----");
		for(i=0;i<num.size();i++)
		{
			System.out.println(num.get(i));
		
		}
		
		
	}
}
