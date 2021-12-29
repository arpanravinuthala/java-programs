abstract class Shape
{
    int a,b;
    abstract void printArea(int a,int b);
}
class Rectangle extends Shape
{
    void printArea(int a,int b)
    {
        System.out.println("Area of the Rectangle is : "+(a*b));
    }
}
class Triangle extends Shape
{
    void printArea(int a,int b)
    {
        System.out.println("Area of the Triangle is : "+(0.5*a*b));
    }
}
class Circle extends Shape
{
    void printArea(int a,int b)
    {
        System.out.println("Area of the Circle is : "+(3.14*a*a));
}
}
public class AbstractClass
{
public static void main(String args[])
{
Rectangle r=new Rectangle();
Triangle t = new Triangle();
Circle c=new Circle();
r.printArea(2,4);
t.printArea(3,4);
c.printArea(5,6);
}
}
