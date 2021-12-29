import java.util.*;
public class totalmarks
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        result o=new result();
        o.details();
        o.score();
        o.total();
    }
}
class student
{
    String name;
    int r;
    Scanner s=new Scanner(System.in);
    void details()
    {
    System.out.println("enter the name and roll number of the student");
    name=s.nextLine();
    r=s.nextInt();
}
}
class testscores extends student
{
    Scanner s=new Scanner(System.in);
    float marks[]=new float[6];
    void score()
    {
    System.out.println("enter the marks of the student\n");
    for(int i=0;i<6;i++)
    {
        marks[i]=s.nextFloat();
    }
}
}
class result extends testscores
{
    void total()
    {
    float t=0;
    for(int i=0;i<6;i++)
    {
        t=t+marks[i];
    }
    System.out.println("Name : "+name+"\nRoll no : "+r+"\nTotal Marks : "+t);
}
}
