final class sample
{
    final int a=10;
    int b=10;
    void display()
    {
        System.out.println("We cannot change the final variable");
        System.out.println("A value is:"+a);
        b=20;
        System.out.println("B value after changing:"+b);
    }
    final void run()
    {
        System.out.println("This is a final method");
    }
}
class sample1
{
    void display()
    {
        System.out.println("Final method run cannot be overrided");
        System.out.println("We also cannot inherit methods of a final base class");
    }
}

public class Final
{
	public static void main(String[] args)
	{
	    sample s = new sample();
	    s.display();
	    sample1 s1= new sample1();
	    s1.display();
	}
}
