import java.util.*;
interface Student
{
    abstract void getvalue();
}
interface Department
{
    abstract void getattendence();
}
class Exam implements Student,Department
{
    Scanner s=new Scanner(System.in);
    int sno,m,c,atd;
    String sname;
    public void getvalue()
    {
        System.out.println("enter the roll no,marks,name respectively");
        sno=s.nextInt();
        m=s.nextInt();
        s.next();
        sname=s.nextLine();
    }
    public void getattendence()
    {
        System.out.println("enter your attendence percentage");
        atd=s.nextInt();
    }
    public void calattendence()
    {
        if(atd>75)
        {
            c=c+1;
        }
        if(m>80)
        {
            c=c+1;
        }
    }
    public String eligible()
    {
        if(c==2)
        {
            return("YES");
        }
        else
        {
            return("NO");
        }
    }
}
public class interfacepro
{
    public static void main(String args[])
    {
        Exam e=new Exam();
        e.getvalue();
        e.getattendence();
        e.calattendence();
        String g=e.eligible();
        System.out.println(g);
    }
}
