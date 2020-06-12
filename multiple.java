import java.util.Scanner;
public class multiple 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit");
        int limit = sc.nextInt();

        int arr[] = new int[limit];
        int newArr[] = new int[limit];
        System.out.println("Enter elements into the array");
       	for(int i=0;i<limit;i++)
	{
        arr[i] = sc.nextInt();
     	}
         	int fix=0;
                for(int i=0;i<limit;i++){
                    if(arr[i]%5==0){
                        fix = arr[i];
                    }
                    if(fix!=0)
                    arr[i] = fix;
                }
                System.out.println("newArr[] is");
                for(int i=0;i<limit;i++){
                    System.out.print(arr[i] + " ");
                }
	}
}