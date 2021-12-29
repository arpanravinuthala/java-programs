import java.util.*;
public class netsal
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        salary sa =new salary();
        sa.reademp();
        sa.readsal();
        sa.calculatesalary();
        sa.displayemp();
    }
}
class employee
{
    Scanner s=new Scanner(System.in);
    String name,des;
    int id;
    public void reademp()
    {
    System.out.println("enter the name,designation and id respectiverly");
    name=s.nextLine();
    des=s.nextLine();
    id=s.nextInt();
    }
}
class salary extends employee
{
    Scanner s=new Scanner(System.in);
        float bp,hra,da,pf,np=0;
    public void readsal()
    {
        System.out.println("enter the basic pay,hra,da,pf details respectively");
        bp=s.nextFloat();
        hra=s.nextFloat();
        da=s.nextFloat();
        pf=s.nextFloat();
    }
    public void calculatesalary()
    {
        np=bp+hra+da-pf;
    }
    public void displayemp()
    {
        System.out.println("Details of the employee:");
        System.out.println("Name : "+name+"\nDesignation : "+des+"\nID : "+id);
        System.out.println("Net Salary : "+np);
    }
}
