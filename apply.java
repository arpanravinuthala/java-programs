import java.util.*;
class fact
{
int ans;
public int take(int no)
{
if(no==1)
return 1;
ans=take(no-1)*no;
return ans;
}
}
class apply{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
int a;
System.out.println("enter any number to find the factorial");
a=sc.nextInt();
fact obj=new fact();
System.out.println(+obj.take(a));
}
}
