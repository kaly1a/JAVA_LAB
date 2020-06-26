/* Number Sequence Program */
import java.util.*;
class number_sequence
{ 
	static void identify_largest(int n)
	{
		int largest=0;
		while(n!=1)
		{
			if(n%2==0)
			{
				n=n/2;
			}
			else
			{
				n=((3*n)+1);
			}
			if(largest<n)
			{
				largest=n;
			}
		}
		System.out.println("Largest sequence num :" +largest);
	}
}

class checknumber_sequence
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number within 1000");
		int n=s.nextInt();
		number_sequence.identify_largest(n);
	}
}
