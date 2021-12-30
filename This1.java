import java.util.*;
class This1
{
String name;
int age;
This1(String name,int age)
{
this.name=name;
this.age=age;
}
}
public class This
{
public static void main(String args[])
{
Scanner s = new Scanner(System.in);
System.out.println("enter the name and age respectively");
String name=s.next();
int age=s.nextInt();
This1 obj=new This1(name,age); 
System.out.println("the name of the student : "+obj.name+ "\nage : "+ obj.age);
}
}
