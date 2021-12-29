import java.util.Scanner;
class employee
{
	int salary;
	float worktime;
	String name,id;
	Scanner sc=new Scanner(System.in);
	void getinfo()
	{
		System.out.println("Enter the name of the employee");
		name=sc.next();
		System.out.println("Enter the employee id");
		id=sc.next();
		System.out.println("Enter the employee salary");
		salary=sc.nextInt();
		System.out.println("Enter the number of hours of work");
		worktime=sc.nextFloat();
	}
	void Addsal()
	{
		System.out.println("Addsal method called");
		if (salary<500)
		{
			System.out.println("Your one of the finest employee of our company");
			salary=salary+10;
		}
		System.out.println("Salary per day is $"+salary);
		System.out.println("Salary per month is $"+(salary*30)); 
	}
	void Addwork()
	{
		System.out.println("Addwork method called");
		if (worktime>6.0)
		{
			System.out.println("For your hard work and spending extra time for the company");
			salary=salary+5;
		}
		System.out.println("Salary per day is $"+salary);
		System.out.println("Salary per month is $"+(salary*30));
	}
}
public class employeesal
{
	public static void main(String args[])
	{
		int n,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of employees");
		n=sc.nextInt();
		employee[] arr=new employee[n];
		for(i=1;i<n+1;i++)
		{
			arr[i-1]=new employee();
			System.out.println("Enter employee details");
			arr[i-1].getinfo();
			System.out.printf("Salary of %d employee",i);
			System.out.println();
			arr[i-1].Addsal();
			arr[i-1].Addwork();
		}
	}
}
