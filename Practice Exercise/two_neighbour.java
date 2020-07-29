import java.util.*;
import java.lang.*;
class two_neighbour
{
	static void smalldist(int[] arr)
	{
		int smallest = Math.abs(arr[0]-arr[1]);
		int index = 0;
		for(int i=1;i<arr.length-1;i++)
		{
			int res = Math.abs(arr[i]-arr[i+1]);
			if(res<smallest)
			{
				smallest=res;
				index=i;
			}
		}
		//System.out.println(smallest);
		System.out.println(index);
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit");
        int limit = sc.nextInt();

        int array[] = new int[limit];
        System.out.println("Enter elements into the array");
       	for(int i=0;i<limit;i++)
		{
        array[i] = sc.nextInt();
     	}
		smalldist(array);
	}
}
		
