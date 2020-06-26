/* Holiday Program */
import java.util.*;
class Holiday{
	String name;
	int day;
	String month;
	
	
	Holiday(String name, int day, String month){
		this.name = name;
		this.day = day;
		this.month = month;
	}
	
	public boolean isSameMonth(Holiday ob2){
		return (this.month.equals(ob2.month));
	}
	
	public static float avgDate(Holiday[] arrayOb){
		int d_sum = 0;
		int count = arrayOb.length;
		for(int i = 0; i < count; i += 1){
			d_sum += arrayOb[i].day;
		}
		return ((float)d_sum / count);
	}
}


public class checkholiday{
	static String name;
	static int day;
	static String month;
	static Scanner s = new Scanner(System.in);
	
	static void fetch_details(){
		System.out.println("Enter the day");
		day = s.nextInt();
		System.out.println("Enter the name of the holiday");
		name = s.next();
		System.out.println("Enter the month");
		month = s.next();
	}
	
	public static void main(String[] args){
		System.out.println("Enter the first object details");
		fetch_details();
		Holiday ob1 = new Holiday(name, day, month);
		
		System.out.println("Enter the second object details");
		fetch_details();
		Holiday ob2 = new Holiday(name, day, month);
		
		
		System.out.println("Enter the number of objects for array of objects to be created");
		int count = s.nextInt();
		Holiday[] arrayOb = new Holiday[count];
		System.out.println("Enter the details for " + count + " Holiday objects");
		
		for(int i = 0; i < count; i += 1){
			int num = i + 1;
			System.out.println("Enter details of" + num + " object");
			fetch_details();
			arrayOb[i] = new Holiday(name, day, month);
		}	
		
		System.out.println("Applying the method isSameMonth() on the two objects created");
		System.out.println(ob1.isSameMonth(ob2));
		
		System.out.println("Applying the method avgDate() on the array of objects created");
		System.out.println(Holiday.avgDate(arrayOb));
		
		
	}	

}
