class vararg{
static void arg(int... a)
{
System.out.println("enter the number of arguments: "+a.length);
for(int i : a)
System.out.println(i +" ");
System.out.println();
}
public static void main(String args[])
{
arg(1);
arg(5,6,5,6);
arg(5,6,3,5,23,5,3,3);
}
}
