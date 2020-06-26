/*
Write a program to decode a string encoded using Caeser’s Cipher. The input given to the program is an encrypted string and a word in the original string. The output should be the decoded string or the original string.
*/
import java.util.*;
class caesercipher
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the encrypted message: ");
		String word = s.nextLine();
		word = word.toUpperCase();
		System.out.println("Enter an original word from the message: ");
		String org_word = s.nextLine();
		org_word = org_word.toUpperCase();
		decrypt(word,org_word);
	}
	
	static void decrypt(String word, String org_word)
	{
		String decrypt_word="";
		for(int i=1; i<26; i++)
		{
			for(int j=0; j<word.length();j++)
			{
				char ch=word.charAt(j);
				if(ch>='A' && ch<='Z')
				{
					ch = (char)(ch-i);
					if(ch<'A')
					{
						ch = (char)(ch-'A'+'Z'+1);
					}
					
				}
				decrypt_word=decrypt_word+ch;
			}
		
		int check = decrypt_word.indexOf(org_word);
		if(check!=-1)
		{
			System.out.println("Key for this message is: "+i);
			System.out.println("Decrypted Message: "+decrypt_word);
			System.exit(0);
		}
		decrypt_word="";
	}
	System.out.println("Word is not present in the message!!");
	}
}