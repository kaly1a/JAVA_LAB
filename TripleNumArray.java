import java.util.Scanner;

public class TripleNumArray {
	public static void main(String [] args) {
		
		Scanner input = new Scanner(System.in);

		int positions = input.nextInt();
		int[] myarray = new int[positions];

		for (int x = 0; x < myarray.length; x++) {
			myarray[x] = input.nextInt();
		}
		
		System.out.println(tripleUp(myarray));
		
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