import java.util.*;
import java.text.*;
public class DateDemo{
public static void main(String args[]){
Date dnow=new Date();
SimpleDateFormat ft=new SimpleDateFormat("E yyyy:MM:dd 'at' hh:mm:ss zzz");
System.out.println("Current Date :"+ft.format(dnow));
}
}
