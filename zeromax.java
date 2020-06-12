import java.util.Scanner;
public class zeromax 
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
        
        for(int i=0;i<limit;i++){
                int large = 0;
                if(arr[i]==0){
                    large = arr[i];
                    for(int j=i+1;j<limit;j++){
    
                        if ((large < arr[j]) && (arr[j] % 2 !=0)){
                        large = arr[j];
                        }
                            System.out.println("Large is" + large);
                    }
                            arr[i] = large;
                }
                }
                System.out.println("newArr[] is");
                for(int i=0;i<limit;i++){
                    System.out.print(arr[i] + " ");
                }
     }
}        