import java.util.*;
class shape
{
	float length,breadth,area;
	shape()
	{
		this.length=0;
		this.breadth=0;
	}
	shape(float l)
	{
		this.length=l;
		this.breadth=l;
	}
	shape(float l,float b)
	{
		this.length=l;
		this.breadth=b;
	}
	void area()
	{
		area=length*breadth;
		System.out.println("Area of Room is:"+area);
	}
}
class Area
{
	public static void main(String args[])
	{
		int ch,a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your choice");
		System.out.println("1:default constructor\n2:one parameter\n3:two parameter");
		ch=sc.nextInt();
		switch(ch)
		{
			case 1: shape s=new shape();
			         s.area();
			         break;
			case 2: System.out.println("Enter side length");
			         a=sc.nextInt();
			         shape s1=new shape(a);
			         s1.area();
			         break;
			case 3: System.out.println("Enter length");
			         a=sc.nextInt();
			         System.out.println("Enter breadth");
			         b=sc.nextInt();
			         shape s2=new shape(a,b);
			         s2.area();
			         break;
			default:System.out.println("Enter a valid choice\n");
			         break;
		}
	}
}
