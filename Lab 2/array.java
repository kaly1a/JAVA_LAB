/* Write a menu driven program to implement following 
* 1. Accept an array and return an array where each zero value in the array is replaced by the largest odd number to the right of zero in the array. If there is no odd number  to the right of zero leave zero as it is. Consider the example
* [0, 5, 0, 3] → [5, 5, 3, 3] 
* 2. Accept an array and for each multiple of 5 in the given array, change all the values following it to that multiple till you encounter another multiple of 5.Consider the following example 
* [2, 10, 3, 4, 20, 7] → [2, 10, 10, 10, 20, 20]
* 3. Accept an array and return a Boolean value True if array contains, somewhere, three increasing adjacent numbers like 5,6,7. Consider the following example 
* [1, 4, 5, 6, 2] → true
*/
import java.util.Scanner;
public class array {
    public static void main(String args[]){
                Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the limit");
        int limit = scanner.nextInt();

        int arr[] = new int[limit];
        int newArr[] = new int[limit];
        System.out.println("Enter elements into array");
        for(int i=0;i<limit;i++){
        arr[i] = scanner.nextInt();
        }
        
        System.out.println("Enter choice:");
        System.out.println("1. To display the max element present in the array instead of zero" );
        System.out.println("2. To display the multiples of 5 instead of other numbers");
        System.out.println("3. Return true if three consecutive number exists in the array");
        int choice = scanner.nextInt();
        switch (choice){
            
            case 1:
            for(int i=0;i<limit;i++){
                int large = 0;
                if(arr[i]==0){
                    large = arr[i];
                    for(int j=i+1;j<limit;j++){
    
                        if ((large < arr[j]) && (arr[j] % 2 !=0)){
                        large = arr[j];
                        }
                            System.out.println("Large is " + large);
                    }
                            arr[i] = large;
                }
                }
                System.out.println("newArr[] is");
                for(int i=0;i<limit;i++){
                    System.out.print(arr[i] + " ");
                }
            break;
        case 2:
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
            break;
	case 3:
		Scanner input = new Scanner(System.in);

		int positions = input.nextInt();
		int[] myarray = new int[positions];

		for (int x = 0; x < myarray.length; x++) {
			myarray[x] = input.nextInt();
		}
		
		System.out.println(tripleUp(myarray));
		
		break;
        default:
            System.out.print("NOT VALID INPUT");
        
        }
    }

	public static boolean tripleUp(int [] myarray) {
		boolean triple = false;

		for (int x = 0; x < myarray.length -2; x++){
			if (myarray[x] == myarray[x + 1] - 1 && myarray[x] == myarray[x + 2] - 2){
				return true;
			}
		}
		return false;
	}
}
