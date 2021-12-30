import java.util.*;
class employee
{
    	String name,id;
		float sal;
	Scanner s=new Scanner(System.in);
	void read_emp()
	{
		System.out.println("enter the name of the employee");
		name=s.next();
		System.out.println("enter the id of the employee");
		id=s.next();
		System.out.println("enter the salary of the employee");
		sal=s.nextFloat();
	}
}
class permanent_employee extends employee
{
	void print_emp()
	{
		System.out.println("Details of the employee : ");
		System.out.println("Name : "+name+"\nID : "+id+"\nSalary : "+(sal+(0.05*sal)));
	}
}
class temporary_employee extends employee
{	
	void print_emp()
	{
		System.out.println("Details of the employee : ");
		System.out.println("Name : "+name+"\nID : "+id+"\nSalary : "+(sal+(0.035*sal)));
	}
}
public class per_tem
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter '1' if you are a permanent employee or '0' if you are a temporary employee");
		int ch=s.nextInt();
		if(ch==1)
		{
			permanent_employee p =new permanent_employee();
			p.read_emp();
			p.print_emp();
		}
		else if(ch==0)
		{
			temporary_employee t=new temporary_employee();
			t.read_emp();
			t.print_emp();
		}
	}
}
