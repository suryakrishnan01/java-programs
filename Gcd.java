import java.io.*;
import java.util.*;
class Gcd
{
	public static void main(String args[])
	{
	int a,b;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the two numbers:");
	a=sc.nextInt();
	b=sc.nextInt();
	gcd(a,b);
	}
	public static void gcd(int a,int b)
	{
	int n1=a;
	int n2=b;
	int ans=0;
	int i;
	for(i=1;i<=n1 && i<=n2;++i)
	{
		if(n1%i==0 && n2%i==0)
	    ans=i;
	}
	System.out.println("GCD of"+n1+" and "+n2+" is :"+ ans);
	
	}
}
