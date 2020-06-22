/* Create a class called “Book” which has variable Subject(String),Title (String),Publisher(String),year_of_publication(int).
 Write two  parameterised constructor to initialise the values “Public Book(String Subject,String Title,String Publisher, int year_of_publication)”, 
 “public Book(String Title)”. Write a method  getBookTitle() which returns back a String.

 Create a class called “FacultyMember” with variables id(int),Name(String),Designation(String),Department(String),books(An array of object of class “Book”). 
 Assume that “books” variable contains all the books borrowed by the FacultyMember from the University library where there is no maximum number. 
 Overload constructors by writing four public constructors.
	FacultyMember (int id,String Name)
	FacultyMember (int id, String Name,String Designation)
	FacultyMember(int id,String Name,String Designation,String Department) 
	FacultyMember(int id, String Name,String Designation,String Department, Book [] books))
 Call one constructor in wherever possible.
	Overload method Public Book UpdateBooks()which when invoked with index(int),title(String) where index is the position of the book and title is
  the title of the new book which is replacing the book in the given index and returns back the old book.When the method is invoked  with an index(int), 
 replbook(Book) will replace the existing book at index value with replbook and returns back the old book. Also print the title of the book  returned.

 Write main method in FacultyMember class create one object called  facultymember for the class FacultyMember.
*/

import java.util.*;

public class FacultyMember
{
	int id;
	String name,designation,department;
	
	public FacultyMember(int id,String name)
	{
		this.id = id;
		this.name = name;
	}
	public FacultyMember(int id,String name,String designation)
	{
		this(id,name);
		this.designation = designation;
	}
	public FacultyMember(int id,String name,String designation,String department)
	{
		this(id,name,designation);
		this.department = department;
	}
	public FacultyMember(int id,String name,String designation,String department,book[] books )
	{
		this(id,name,designation,department);
	}
	
	
	public static void main(String[] args)
	{
		int i,j;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number book objects you want to create");
		int n = s.nextInt();
		
		book[] b;
		b = new book[100];
		for(i=0;i<n;i++)
		{
			j = i+1;
			System.out.println("Enter the details for Book " +j);
			System.out.println("Enter the subject");
			String sub = s.next();
			System.out.println("Enter the title");
			String title = s.next();
			System.out.println("Enter the publisher");
			String pub = s.next();
			System.out.println("Enter the year of publication");
			int year = s.nextInt();
			b[i] = new book(title,sub,pub,year);
			
		}
		
		System.out.println("Enter the faculty member details");
		System.out.println("Enter the id");
		int id = s.nextInt();
		System.out.println("Enter the name");
		String name = s.next();
		System.out.println("Enter designation");
		String des = s.next();
		System.out.println("Enter the department");
		String dept = s.next();
		
		FacultyMember f = new FacultyMember(id,name,des,dept);
		
		System.out.println("python");
		System.out.println("Enter the book index number  you want to update(0- (n-1))");
		int update = s.nextInt();
		System.out.println("Enter the title");
		String title = s.next();
		System.out.println("Title of old book: "+b[update].gettitle());
		b[update].updatebooks(title);
		System.out.println("Enter the new book title you want to update to the faculty list at the same index");
		String new_title = s.next();
		System.out.println("Title of old book: "+b[update].gettitle());
		b[update].updatebooks(new_title);
	}	
	
}



class book
{
	
	String title,subject,publisher;
	int year;
	public String book(String title)
	{
		this.title = title;
		return title;
	}
	public book(String title,String subject,String publisher,int year)
	{
		this.title=title;
		this.subject = subject;
		this.publisher = publisher;
		this.year = year;
	}
	public String updatebooks(String title)
	{
		
		this.title = title;
             return title;
	}
	public String gettitle()
	{
		return title;
	}
	
		
}
