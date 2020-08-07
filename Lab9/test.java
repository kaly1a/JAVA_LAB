/*
Write a program to create two concrete classes MovablePoint and MovableCircle which implement Movable Interface.Use the figure below for better understanding.
   
   <<interface>> Movable
   + moveUp():void               
   + moveDown():void             
   + moveLeft():void             
   + moveRight():void
   
   MovablePoint
   ~ x:int
   ~ y:int
   ~ xSpeed:int
   ~ ySpeed:int
   + MovablePoint(x:int, y:int, xSpeed:int, ySpeed:int)
   + toString():String
   + moveUp():void               
   + moveDown():void             
   + moveLeft():void             
   + moveRight():void
   
   MovableCircle
   - radius:int
   - center:MovablePoint
   + MovableCircle(x:int, y:int, xSpeed:int, ySpeed:int, radius:int)
   + toString():String
   + moveUp():void               
   + moveDown():void             
   + moveLeft():void             
   + moveRight():void
*/

interface Movable
{
	public void moveUp();
	public void moveDown();
	public void moveLeft();
	public void moveRight();
}

class MovablePoint implements Movable
{
	private int x, y, xSpeed, ySpeed;
	
	public MovablePoint(int x, int y, int xSpeed, int ySpeed)
	{
		this.x = x;
		this.y = y;
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}
	public String toString()
	{
		return "MovablePoint(" + "x=" + x + ", y=" + y + ", xSpeed=" + xSpeed + ", ySpeed=" + ySpeed + ")";
	}
	public void moveUp()
	{
		y -= ySpeed;
	}
	public void moveDown()
	{
		y += ySpeed;
	}
	public void moveLeft()
	{
		x -= xSpeed;
	}
	public void moveRight()
	{
		x += xSpeed;
	}
}

class MovableCircle implements Movable
{
	private MovablePoint center;
	private int radius;
	
	public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius)
	{
		this.center = new MovablePoint(x, y, xSpeed, ySpeed);
		this.radius = radius;
	}
	
	public String toString()
	{
		return "MovableCircle(" + "center=" + center + ", radius=" + radius + ")";
	}
	public void moveUp()
	{
		center.moveUp();
	}
	public void moveDown()
	{
		center.moveDown();
	}
	public void moveLeft()
	{
		center.moveLeft();
	}
	public void moveRight()
	{
		center.moveRight();
	}
}

class test
{
	public static void main(String args[])
	{
		Movable m1 = new MovablePoint(5, 6, 10, 5);
		System.out.println(m1);
		m1.moveLeft();
		m1.moveDown();
		System.out.println(m1);
		
		Movable m2 = new MovableCircle(2, 1, 2, 20, 20);
		System.out.println(m2);
		m2.moveRight();
		m2.moveUp();
		System.out.println(m2);
	}
}
