import java.io.*;
import java.util.*;
class Prime
{
	public static void main(String args[])
	{
	int num,i,count,n;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the max range:");
	n=sc.nextInt();
	System.out.println("the prime num between 1 to " +n);
	for(num = 1;num<=n;num++)
	{

         count = 0;

         for(i=2;i<=num/2;i++)
		 {
             if(num%i==0)
			 {
                 count++;
                 break;
             }
        }
        
         if(count==0 && num!= 1)
             System.out.println(num);
    }
}
}