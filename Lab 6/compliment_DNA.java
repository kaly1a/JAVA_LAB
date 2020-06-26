/*
Write a class called compliment_DNA which has a public string called “inputDNA”, public methods reverse_compliment() which takes in a string value and returns also a string , checkinput() which take in a string and returns a boolean value. The first method is to compliment the given DNA string, second method is to validate the input, the program should exit if the input string is not a valid DNA.



The compliment of a given DNA strand is done in the following way:

The reverse complement of a DNA string s is the string sc formed by reversing the symbols of s, then taking the complement of each symbol (e.g., the reverse complement of "GTCA" is "TGAC")



Please note:  In DNA strings, symbols 'A' and 'T' are complements of each other, as are 'C' and 'G'.



Create an object of the class and accept the string from user and call the function to compliment only if the input is valid. Have the main method in the same class.


*/
import java.io.*;
import java.util.*;
class compliment_DNA
{
	public static void main(String args[])
	{
		String inputDNA;
		compliment_DNA DNA = new compliment_DNA();
		System.out.println("Enter the DNA");
		Scanner s = new Scanner(System.in);
		inputDNA = s.next();
		//System.out.println(inputDNA);
		//boolean flag = dna.checkinput(inputDNA);
		if(!checkinput(inputDNA))
		{
			System.exit(0);
		}
		System.out.println(reverse_compliment(inputDNA));
	}
	
	public static boolean checkinput(String inputDNA)
	{
		for(int i=0; i<inputDNA.length(); i++)
		{
			inputDNA = inputDNA.toUpperCase();
			char base=inputDNA.charAt(i);
			if (base !='T' && base !='A' && base !='C' && base!='G')
			{
				System.out.println("Invalid DNA String");
				return false;
			}
		}
		return true;
	}
	
	public static String reverse_compliment(String inputDNA)
	{
		inputDNA = inputDNA.toUpperCase();
		String result = "";
		String temp;
		for(int i=inputDNA.length()-1; i>=0; i--)
		{
			char ch = inputDNA.charAt(i);
			if(ch == 'T')
			{
				result = result + 'A';
			}
			if(ch == 'A')
			{
				result = result + 'T';
			}
			if(ch == 'C')
			{
				result = result + 'G';
			}
			if(ch == 'G')
			{
				result = result + 'C';
			}
		}
		return result;
	}
}
