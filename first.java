import java.util.*;
class pass_by_value
{
	int n,n2;
	public void get(int x,int y)
	{
		x=x*x;
		y=y*y;
	}
}
class first
{
	public static void main(String args[])
	{
		int a,b;
		a=2;
		b=9;
		System.out.println("Initial values of a & b "+a+" "+b);
		System.out.println("enter any two values");
		Scanner scan=new Scanner(System.in);
		a=scan.nextInt();
		b=scan.nextInt();
		pass_by_value obj=new pass_by_value();
		obj.get(a,b);
		System.out.println("Final values of a&b are"+a+" "+b);
	}
}		
