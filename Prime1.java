import java.io.*;
import java.util.*;
class Prime1
{
	public static void main(String args[])
	{
	int low,high,i,flag,temp;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter two numbers intervals: low and high");
	low=sc.nextInt();
	high=sc.nextInt();
	System.out.println("the prime num between"+low+" to " +high);
	if (low > high)
	{
        temp = low;
        low = high;
        high = temp;
    }
	while(low<high)
	{
		flag=0;
		for(i=2;i<=low/2;++i)
		{
			if(low%i==0)
			{
				flag=1;
				break;
			}
		}
		if (flag==0)
			System.out.println(low);
		++low;
	}
	}
}	
	