import java.util.*;
class Clock 
{
    private int hours, minutes, seconds;

    public Clock() 
	{
        this.hours = 12;
        this.minutes = 00;
        this.seconds = 00;
    }

    public Clock(int hours, int minutes, int seconds) 
	{
        if (hours > 23 || minutes > 59 || seconds > 59)
            return;
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public Clock(int seconds_since) 
	{
        this(0, 0, 0);

        this.setClock(seconds_since);
    }

    public void setClock(int seconds_since) 
	{
        if (seconds_since > 86400) 
		{
            System.out.println("More than 24 hours !");
            return;
        }

        int minutes = seconds_since / 60;
        this.seconds = seconds_since % 60;
        if (minutes > 59) 
		{
            this.hours = minutes / 60;
            this.minutes = minutes % 60;
        }
    }
    
    public void setHours(int hours) 
	{
	
        this.hours = hours;
    }

    public void setMinutes(int minutes) 
	{
        this.minutes = minutes;
    }

    public void setSeconds(int seconds) 
	{
        this.seconds = seconds;
    }

    public int getHours() 
	{
        return this.hours;
    }

    public int getMinutes() 
	{
        return this.minutes;
    }

    public int getSeconds() 
	{
        return this.seconds;
    }
	public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter clock seconds:");
        int sec = sc.nextInt();
		Clock c1 = new Clock(sec);

        System.out.println(c1.getHours() + ":" + c1.getMinutes() + ":" + c1.getSeconds());
    }
}