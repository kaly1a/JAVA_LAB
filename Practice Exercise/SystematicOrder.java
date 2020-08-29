/*
Sherlock Holmes likes his numbers to be in a “systematic” order. As you are aware he likes things to be in order.  (Read his adventures/stories  you will love them!!). You are Dr.Watson and are helping Sherlock to keep his numbers systematic. So you write a program for him as he is busy solving a murder mystery.

Suppose we have integer values 1 to n ​(n <=15) . We need to arrange them in the “order”. Numbers are in order if one of the following is true for every i’th position (1<=i<=n)

The number at the i’th position is divisible by i​
i is divisible by the number in i’th position 
For a given n find out the number of possible way’s the numbers will be in  the “systematic order”.
*/
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class SystematicOrder
{
    static int count;
    public static void main(String[] args) 
	{
        System.out.println("Enter number (1-20) ");
        final Scanner sc = new Scanner(System.in);
        final int number = sc.nextInt();
        final List<Integer> availableNumbers = new ArrayList<>();
        for (int i = 1; i <= number; i++) 
		{
            availableNumbers.add(i);
        }
        if (number >= 1) 
		{
            findArrangement(1, availableNumbers, number);
            System.out.println("Possible number of arrangements - " + count);
        } 
		else 
		{
            System.out.println("Possible number of arrangements - " + 0);
        }
    }
    public static void findArrangement(final int index, final List<Integer> availableNumbers, final int number) 
	{
        for (int i = 0; i < availableNumbers.size(); i++) 
		{
            if (availableNumbers.get(i) % index == 0 || index % availableNumbers.get(i) == 0) 
			{
              final List<Integer> remainingNumbers = new ArrayList<>();
                remainingNumbers.addAll(availableNumbers);
                remainingNumbers.remove(availableNumbers.get(i));
                if (index < number) 
				{
                    findArrangement(index + 1, remainingNumbers, number);
                } 
				else 
				{
                    count++;
                }
            }
        }
    }
}
