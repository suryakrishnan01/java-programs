import java.io.*;
import java.util.*;
class Findmax
{
	public static void main(String args[])
	{
	int a,b,c;
	Scanner sc=new Scanner(System.in);
	a=sc.nextInt();
	b=sc.nextInt();
	c=sc.nextInt();
	if(a>b && a>c)
	{
	System.out.println("maximum num is a" + a);
	}
	else if(b>a && b>c)
	{
	System.out.println("maximum num is b" + b);
	}
	else
	{
	System.out.println("maximum num is c" + c);
	}
	
	if(a<b && a<c)
	{
	System.out.println("minimum num is a" + a);
	}
	else if(b<a && b<c)
	{
	System.out.println("minimum num is b" + b);
	}
	else
	{
	System.out.println("minimum num is c" + c);
	}
}
}
	