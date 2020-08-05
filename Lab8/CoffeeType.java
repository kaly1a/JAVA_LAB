/*

We all are missing the coffee machine in the University and to overcome it we are

planning to write few classes to implement usage of coffee machine. Assume there are

3 types of filter coffee, espresso, cappuccino, Design your own hierarchy of classes use abstract,

super and final  appropriately.Create a class called coffeemachine as abstract class
*/
import java.util.*;
abstract class CoffeeMachine
{    
	final double cost= 100.0;
	abstract void Coffee();
}

class Filter_Coffee extends CoffeeMachine
{    
	double cost = 150.0;
	void Coffee()
	{        
		System.out.println("Here is your Filter Coffee");
		System.out.println("Original cost : "+ " " +cost);
		System.out.println("But pay fixed cost only :  "+ super.cost);
		}
}

class Espresso extends CoffeeMachine
{    
	double cost = 170.0;    
	void Coffee()
	{        
		System.out.println("Here is your Espresso");
		System.out.println("Original cost : "+ cost);
		System.out.println("But pay fixed cost only : "+ super.cost);
	}
}
		
class Cappuccino extends CoffeeMachine
{    
	double cost = 190.0;
	void Coffee()
	{        
		System.out.println("Here is your Cappuccino");
		System.out.println("Original cost : "+ cost);
		System.out.println("But pay fixed cost only : "+ super.cost);
	}
}

public class CoffeeType
{    
	public static void main(String args[])
	{        
		System.out.println("1. Filter coffee");
		System.out.println("2. Espresso");
		System.out.println("3. Cappuccino");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the choice");
		int option = sc.nextInt();
		CoffeeMachine cm_fc = new Filter_Coffee();
		CoffeeMachine cm_esp = new Espresso();
		CoffeeMachine cm_cap = new Cappuccino();
		switch(option)
		{            
			case 1 :
				cm_fc.Coffee();
				break;
			case 2 :
				cm_esp.Coffee();
				break;
			case 3 :                
				cm_cap.Coffee();
				break;
			default :
				System.out.println("Invalid");
		}
	}
}
