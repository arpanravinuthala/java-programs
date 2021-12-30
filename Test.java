class Test
{
static int a=10;
static int b;
static{
System.out.println("static block");
b=b+2;
}
static void m1()
{
System.out.println("static method is called");
}
public static void main(String args[])
{
System.out.println("value of a : "+a);
System.out.println("value of b : "+b);
m1();
}
}
