import java.util.*;
class figure
{
	double length,breadth,area1;
	figure(double l, double b)
	{
        length = l;
        breadth = b;
	}
	void area()
	{
        System.out.println("Area for Shape is undefined.");
	}
}
class Rectangle extends figure
{
	Rectangle(double l,double b)
	{
		super(l,b);
	}
	void area()
	{
		area1=length*breadth;
		System.out.println("Area of rectangle is:"+area1);
	}
}
class Triangle extends figure
{
	Triangle(double h,double b)
	{
		super(h,b);
	}
	void area()
	{
		area1=0.5*length*breadth;
		System.out.println("Arae of triangle is:"+area1);
	}
}
class area1
{
	public static void main(String args[])
	{
		double l,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length and height");
		l=sc.nextDouble();
		System.out.println("Enter breadth and base");
		b=sc.nextDouble();
		Rectangle r=new Rectangle(l,b);
		Triangle t=new Triangle(l,b);
		System.out.println("Rectangle class called");
		r.area();
		System.out.println("Triangle class called");
		t.area();
	}
}
