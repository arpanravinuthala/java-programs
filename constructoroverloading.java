import java.util.Scanner;
class time
{
	int hours,min,sec;
	time()
	{
		hours=00;
		min=00;
		sec=00;
	}
	time(int h)
	{
		hours=h;
		min=00;
		sec=00;
	}
	time(int h,int m)
	{
		hours=h;
		min=m;
		sec=00;
	}
	time(int h,int m,int s)
	{
		hours=h;
		min=m;
		sec=s;
	}
	void display()
	{
		System.out.println("Time is "+hours+":"+min+":"+sec);
	}
}
public class constructoroverloading
{
	public static void main(String args[])
	{
		time t1=new time();
		System.out.println("Default constructor");
		t1.display();
		time t2=new time(12);
		System.out.println("Constructor with one parameter");
		t2.display();
		time t3=new time(10,30);
		System.out.println("Constructor with one parameter");
		t3.display();
		time t4=new time(10,30,15);
		System.out.println("Constructor with one parameter");
		t4.display();
	}
}
