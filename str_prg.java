/* Write a menu driven program to implement following 
* •	Write a method that takes two strings and checks whether they are anagrams of each other Two words are anagrams if they contain the same letters and the same number of each letter. For example, “stop” is an anagram of “pots”.
* •	Write a method called “isAbecedarian” that takes a String and returns a boolean indicating whether the word is abecedarian. A word is said to be “abecedarian” if the letters in the word appear in alphabetical order. For example, abdest, agnosy, befist
* •	Write a method called “isDoubloon” that takes a string and checks whether it is a doubloon. A word is said to be a “doubloon” if every letter that appears in the word appears exactly twice. For example coco, noon
*/
import java.util.*;
public class str_prg 
{
    public static void main(String args[])
   {
        String s1=null;
	String s2=null;
	Scanner sc = new Scanner(System.in);
	System.out.println("Select a function:");
	System.out.println("1.To check whether two strings are Anagram to each other");
	System.out.println("2.To check whether a string is Abecedarian or not");
	System.out.println("3.To check whether a string is Doubloon or not");
	int select = sc.nextInt();
	switch(select)
     	{   
        case 1:
	System.out.println("Enter a string:");
        s1 = sc.next();
	//System.out.println(s1);
	System.out.println("Enter another string:");
	s2 = sc.next();
	//System.out.println(s2);
	isAnagram(s1, s2);
	break;
	
	case 2:
	System.out.println("Enter a string:");  
        s1 = sc.next();
	//System.out.println(s1);
	if(isAbecedarian(s1))
        System.out.println("True: String is an Abecedarian");
	else
	System.out.println("False: String is not an Abecedarian");
	break;

	case 3:
	System.out.println("Enter a string:");
        s1 = sc.next();
	//System.out.println(s1);
	if(isDoubloon(s1))
	System.out.println("True: String is a Doubloon");
	else
	System.out.println("False: String is not Doubloon");
	break;

	default:
	System.out.println("Wrong choice!!!");
        }
    }

	static void isAnagram(String s1, String s2)
	{
		String copyOfs1 = s1.replaceAll("s", "");
 		String copyOfs2 = s2.replaceAll("s", ""); 
		boolean status = true;
 		if(copyOfs1.length() != copyOfs2.length())
		{
			status = false;
		}
		else
		{
			char[] s1Array = copyOfs1.toLowerCase().toCharArray();
 			char[] s2Array = copyOfs2.toLowerCase().toCharArray();
 			Arrays.sort(s1Array);
 			Arrays.sort(s2Array);
 			status = Arrays.equals(s1Array, s2Array);
		} 
		if(status)
		{
			System.out.println(s1+" and "+s2+" are Anagrams");
		}
		else
		{
			System.out.println(s1+" and "+s2+" are not Anagrams");
		}
	}

	public static boolean isAbecedarian(String s1)
	{
		int x=s1.length();
		int i=0;
		int j=1;
		int k=2;
		while (k<=x)
		{
			String a=s1.substring(i,j);
			String b=s1.substring(j,k);
			int flag=a.compareTo(b);
			if(flag<=0)
			{
				i++;
				j++;
				k++;
			}
			else
			{
			  return false;
			}
		}
			return true;
	}

	public static boolean isDoubloon(String s1) 
	{
    		String str = s1.toLowerCase();

    		for (int i = 0; i < str.length(); i++) 
		{
        		int count = 0;
       			for (int j = 0; j < str.length(); j++) 
			{
           			if (str.charAt(i) == str.charAt(j))
				{
              				count++;
              				if (2 < count) 
					{
                				return false;
              				} 
           			}
        		}
        			if (count == 1 )
				{
            				return false;
        			}
    		}
    			return true;
	}
}