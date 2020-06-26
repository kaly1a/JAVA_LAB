/*
 Program: Create a class called Light and use static block to print the statement “This is a program which prints pattern to dispel darkness”. Static functions to print the pattern and remove redundancy. Name the methods appropriately. Write the main method in the same class.


*/
import java.io.*;
class Light
{
	  static void printDiamond()
	  {
		System.out.println("      *");
		System.out.println("    *   *");
		System.out.println("      *");
	  }
	  
	  static void printrevPyramid()
	  {
		System.out.println("    *****");
		System.out.println("  *********");
		System.out.println("*************\n");
	  }
	  
	  static void printPyramid()
	  {
	  	System.out.println("*************");
		System.out.println("  *********");
		System.out.println("    *****");
	  }
	  
	  static void printlinear()
	  {
	  	System.out.println("* | | | | | *\n");
	  }
	  
	public static void main(String args[])
	{
		System.out.println("This is a program which prints pattern to dispel darkness \n");
		Light.printDiamond();
		Light.printPyramid();
		System.out.print("\n");
		Light.printlinear();
		Light.printDiamond();
		Light.printPyramid();
		System.out.print("\n");
		Light.printlinear();
		Light.printPyramid();
		Light.printDiamond();
		Light.printrevPyramid();
		Light.printlinear();
		Light.printDiamond();
		Light.printDiamond();
		Light.printPyramid();
		System.out.print("\n");
		Light.printlinear();
		Light.printDiamond();
		Light.printPyramid();
		System.out.print("\n");
		Light.printlinear();
	}

	
}
