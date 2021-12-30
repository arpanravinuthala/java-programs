class pass_by_ref
{
int n,n2;
public void get(int a,int b)
{
n=a;
n2=b;
}
public void doubleit(pass_by_ref temp)
{
temp.n=temp.n*2;
temp.n2=temp.n2*2;
}
}
class apply7
{
public static void main(String args[])
{
int x=5,y=10;
pass_by_ref obj=new pass_by_ref();
obj.get(x,y);
System.out.println("Initial values are");
System.out.println(+obj.n);
System.out.println(+obj.n2);
obj.doubleit(obj);
System.out.println("final values are");
System.out.println(+obj.n);
System.out.println(+obj.n2);
}
}
